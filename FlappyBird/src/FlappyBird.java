import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class FlappyBird extends JPanel implements ActionListener, KeyListener {

    private int birdY = 250, velocity = 0, gravity = 1;
    private final int BIRD_X = 100, BIRD_WIDTH = 20, BIRD_HEIGHT = 20;
    private boolean gameOver = false;

    private final Timer timer;
    private final ArrayList<Rectangle> pipes = new ArrayList<>();
    private final Random rand = new Random();
    private int score = 0;

    public FlappyBird() {
        JFrame frame = new JFrame("Flappy Bird - Java");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.addKeyListener(this);
        frame.setResizable(false);
        frame.setVisible(true);

        addPipe(true);
        addPipe(true);

        timer = new Timer(20, this);
        timer.start();
    }

    public void addPipe(boolean start) {
        int space = 150;
        int width = 60;
        int height = 50 + rand.nextInt(200);
        if (start) {
            pipes.add(new Rectangle(500, 0, width, height));
            pipes.add(new Rectangle(500, height + space, width, 500 - height - space));
        } else {
            Rectangle last = pipes.get(pipes.size() - 1);
            pipes.add(new Rectangle(last.x + 300, 0, width, height));
            pipes.add(new Rectangle(last.x + 300, height + space, width, 500 - height - space));
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.cyan);
        g.fillRect(0, 0, 500, 500);

        g.setColor(Color.orange);
        g.fillRect(0, 400, 500, 100);

        g.setColor(Color.green);
        g.fillRect(0, 390, 500, 10);

        g.setColor(Color.red);
        g.fillRect(BIRD_X, birdY, BIRD_WIDTH, BIRD_HEIGHT);

        g.setColor(Color.green);
        for (Rectangle pipe : pipes) {
            g.fillRect(pipe.x, pipe.y, pipe.width, pipe.height);
        }

        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("Score: " + score, 10, 25);

        if (gameOver) {
            g.setFont(new Font("Arial", Font.BOLD, 48));
            g.drawString("Game Over", 120, 250);
        }
    }

    public void jump() {
        if (!gameOver) {
            velocity = -10;
        } else {
            // restart
            birdY = 250;
            velocity = 0;
            pipes.clear();
            score = 0;
            gameOver = false;
            addPipe(true);
            addPipe(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int speed = 5;

        for (int i = 0; i < pipes.size(); i++) {
            Rectangle pipe = pipes.get(i);
            pipe.x -= speed;
        }

        birdY += velocity;
        velocity += gravity;

        if (pipes.size() > 0 && pipes.get(0).x + pipes.get(0).width < 0) {
            pipes.remove(0);
            pipes.remove(0);
            addPipe(false);
            score++;
        }

        for (Rectangle pipe : pipes) {
            if (pipe.intersects(new Rectangle(BIRD_X, birdY, BIRD_WIDTH, BIRD_HEIGHT))) {
                gameOver = true;
            }
        }

        if (birdY > 400 || birdY < 0) {
            gameOver = true;
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            jump();
        }
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new FlappyBird();
    }
}
