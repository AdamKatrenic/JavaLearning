package loganalyzer.app;

import loganalyzer.filters.ErrorOnlyFilter;
import loganalyzer.filters.LogFilter;
import loganalyzer.filters.ServiceFilter;
import loganalyzer.model.LogRecord;
import loganalyzer.parser.LogParser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== READING FILE app.log ===");

        // načítaj všetky logy bez filtra
        List<LogRecord> allRecords = FileLogReader.readFile("app.log", null);

        // zoskupenie podľa služby a úrovne
        Map<String, Map<String, List<LogRecord>>> logsByServiceAndLevel = allRecords.stream()
                .collect(Collectors.groupingBy(
                        LogRecord::getService,
                        Collectors.groupingBy(LogRecord::getLevel)
                ));

        // výpis výsledkov
        logsByServiceAndLevel.forEach((service, levelMap) -> {
            System.out.println("\n=== " + service + " ===");
            levelMap.forEach((level, records) -> {
                System.out.println(level + " -> " + records.size() + " log(s)");
                records.forEach(record -> System.out.println("   " + record));
            });
        });
    }
}
