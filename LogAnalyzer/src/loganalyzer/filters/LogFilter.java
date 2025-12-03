package loganalyzer.filters;

import loganalyzer.model.LogRecord;

public interface LogFilter {

    boolean accept(LogRecord record);

    default LogFilter and(LogFilter other) {
        return record -> this.accept(record) && other.accept(record);
    }
}
