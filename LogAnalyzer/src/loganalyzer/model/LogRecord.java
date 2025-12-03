package loganalyzer.model;

import java.time.LocalDateTime;

public class LogRecord {
    private final LocalDateTime timestamp;
    private final String level;
    private final String service;
    private final String message;

    private LogRecord(LocalDateTime timestamp, String level, String service, String message) {
        this.timestamp = timestamp;
        this.level = level;
        this.service = service;
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public String getLevel() {
        return level;
    }
    public String getService() {
        return service;
    }
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return timestamp + " | " + level + " | " + service + " | " + message;
    }

    public static class Builder {
        private LocalDateTime timestamp;
        private String level;
        private String service;
        private String message;

        public Builder timestamp(LocalDateTime t) {this.timestamp = t; return this;}
        public Builder level(String l) {this.level = l; return this;}
        public Builder service(String s) {this.service = s; return this;}
        public Builder message(String m) {this.message = m; return this;}

        public LogRecord build() {return new LogRecord(timestamp, level, service, message);}
    }
}
