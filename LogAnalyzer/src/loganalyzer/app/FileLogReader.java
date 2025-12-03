package loganalyzer.app;

import loganalyzer.filters.LogFilter;
import loganalyzer.parser.LogParser;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileLogReader {

    public static void readFile(String fileName, LogFilter filter) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                LogParser.parseLine(line).ifPresent(record -> {

                    if (filter == null || filter.accept(record)) {
                        System.out.println("PASSED : " + record);
                    } else  {
                        System.out.println("FAILED : " + record);
                    }
                });
            }
        }catch (Exception e) {
            System.out.println("ERROR WHILE READING FILE");
            e.printStackTrace();
        }

    }
}
