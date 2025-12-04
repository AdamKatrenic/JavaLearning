package loganalyzer.app;

import loganalyzer.filters.LogFilter;
import loganalyzer.parser.LogParser;
import loganalyzer.model.LogRecord;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FileLogReader {

    public static List<LogRecord> readFile(String fileName, LogFilter filter) {
        try {
            return Files.lines(Paths.get(fileName)) // Stream<String>
                    .map(LogParser::parseLine)     // Stream<Optional<LogRecord>>
                    .filter(Optional::isPresent)   // iba validné riadky
                    .map(Optional::get)            // Stream<LogRecord>
                    .filter(record -> filter == null || filter.accept(record))
                    .collect(Collectors.toList()); // výsledok ako List<LogRecord>
        } catch (IOException e) {
            throw new RuntimeException("Error while reading file", e);
        }
    }
}