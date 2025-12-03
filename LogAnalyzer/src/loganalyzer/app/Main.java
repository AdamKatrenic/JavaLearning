package loganalyzer.app;

import loganalyzer.filters.ErrorOnlyFilter;
import loganalyzer.filters.LogFilter;
import loganalyzer.filters.ServiceFilter;
import loganalyzer.parser.LogParser;

public class Main {

    public static void main(String[] args) {

        LogFilter filter = new ErrorOnlyFilter().and(new ServiceFilter("AuthService"));
        System.out.println("=== READING FILE app.log ===");

        FileLogReader.readFile("app.log", filter);
    }

    private static void test(String line, LogFilter filter) {

        LogParser.parseLine(line).ifPresent(record -> {

            System.out.println("\nTESTING: " + record);

            if (filter.accept(record)) {
                System.out.println("PASSED FILTER");
            } else {
                System.out.println("FAILED FILTER");
            }

        });
    }
}
