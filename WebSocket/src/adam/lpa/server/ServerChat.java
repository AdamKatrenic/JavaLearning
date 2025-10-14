package adam.lpa.server;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import org.java_websocket.server.WebSocketServer;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.*;

public class ServerChat {

    public static void main(String[] args) throws IOException {
        int PORT = 8080; // Jeden port pre HTTP aj WS

        // HTTP server pre HTML klienta
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                if ("GET".equals(exchange.getRequestMethod())) {
                    String html = """
                    <!DOCTYPE html>
                    <html lang="sk">
                    <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>WebSocket Chat</title>
                    <style>
                    body { font-family: Arial; max-width: 720px; margin: 20px auto; padding: 0 12px; }
                    #chat-log { border: 1px solid #ccc; border-radius: 8px; height: 360px; padding: 12px; overflow-y: auto; white-space: pre-wrap; background: #f9f9f9; }
                    form { display: flex; gap: 8px; margin-top: 12px; }
                    input[type=text] { flex: 1; padding: 10px; border: 1px solid #ccc; border-radius: 8px; }
                    button { padding: 10px 16px; border: 0; border-radius: 8px; cursor: pointer; background-color: #4CAF50; color: white; }
                    </style>
                    </head>
                    <body>
                    <h1>WebSocket Chat</h1>
                    <div id="chat-log"></div>
                    <form id="chatForm">
                        <input type="text" id="msg" placeholder="Napíš správu…">
                        <button type="submit">Poslať</button>
                    </form>
                    <script>
                    const name = prompt("Tvoje meno:")?.trim() || "guest";
                    const ws = new WebSocket("ws://" + location.host + "/?name=" + encodeURIComponent(name));

                    const log = document.getElementById('chat-log');
                    const form = document.getElementById('chatForm');
                    const input = document.getElementById('msg');

                    function addLine(text) {
                        const atBottom = log.scrollTop + log.clientHeight >= log.scrollHeight - 5;
                        log.textContent += (log.textContent ? "\\n" : "") + text;
                        if (atBottom) log.scrollTop = log.scrollHeight;
                    }

                    ws.addEventListener('open', () => addLine("Pripojený ako " + name));
                    ws.addEventListener('message', e => addLine(e.data));

                    form.addEventListener('submit', ev => {
                        ev.preventDefault();
                        const text = input.value.trim();
                        if (!text) return;
                        ws.send(text);
                        input.value = "";
                        input.focus();
                    });
                    </script>
                    </body>
                    </html>
                    """;

                    exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
                    exchange.sendResponseHeaders(200, html.getBytes().length);
                    OutputStream os = exchange.getResponseBody();
                    os.write(html.getBytes());
                    os.close();
                } else {
                    exchange.sendResponseHeaders(405, -1);
                }
            }
        });

        httpServer.setExecutor(null);
        httpServer.start();
        System.out.println("HTTP + WebSocket server beží na http://localhost:" + PORT);

        // WebSocket server
        ChatWebSocket wsServer = new ChatWebSocket(new InetSocketAddress(PORT));
        wsServer.start();
        System.out.println("WebSocket server spustený na rovnakom porte!");
    }

    static class ChatWebSocket extends WebSocketServer {
        private final Map<WebSocket, String> users = new HashMap<>();

        public ChatWebSocket(InetSocketAddress address) { super(address); }

        @Override
        public void onOpen(WebSocket conn, ClientHandshake handshake) {
            String resource = conn.getResourceDescriptor();
            String name = "guest";
            if(resource.contains("=")) name = resource.split("=")[1];
            users.put(conn, name);
            broadcast(name + " sa pripojil.");
            System.out.println(name + " pripojený");
        }

        @Override
        public void onClose(WebSocket conn, int code, String reason, boolean remote) {
            String name = users.get(conn);
            users.remove(conn);
            broadcast(name + " sa odpojil.");
            System.out.println(name + " odpojený");
        }

        @Override
        public void onMessage(WebSocket conn, String message) {
            String name = users.get(conn);
            broadcast(name + ": " + message);
            System.out.println(name + ": " + message);
        }

        @Override
        public void onError(WebSocket conn, Exception ex) { System.out.println("Chyba: " + ex.getMessage()); }

        @Override
        public void onStart() { System.out.println("WebSocket server spustený!"); }
    }
}