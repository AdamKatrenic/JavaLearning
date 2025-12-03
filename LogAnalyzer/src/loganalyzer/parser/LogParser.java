package loganalyzer.parser;

import loganalyzer.model.LogRecord;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class LogParser {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    public static Optional<LogRecord> parseLine(String line) {
        try {
            String[] parts = line.split("\\|",4);
            if (parts.length < 4) return Optional.empty();

            String ts = parts[0].trim();
            String level = parts[1].trim();
            String service = parts[2].trim();
            String message = parts[3].trim();

            LogRecord record = new LogRecord.Builder()
                    .timestamp(LocalDateTime.parse(ts, dtf))
                    .level(level)
                    .service(service)
                    .message(message)
                    .build();

            return Optional.of(record);

        } catch (Exception ex) {
            return Optional.empty();
        }
    }
}
