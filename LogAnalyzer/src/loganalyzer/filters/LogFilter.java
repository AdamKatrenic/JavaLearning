package loganalyzer.filters;

import loganalyzer.model.LogRecord;

public interface LogFilter {

    boolean accept(LogRecord record);

    default LogFilter and(LogFilter other) {
        return record -> this.accept(record) && other.accept(record);
    }

    default LogFilter or(LogFilter other) {
        return record -> this.accept(record) || other.accept(record);
    }

    default LogFilter not(LogFilter other) {
        return record -> !this.accept(record);
    }
}
