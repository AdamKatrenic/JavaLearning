package loganalyzer.filters;

import loganalyzer.model.LogRecord;

public class ErrorOnlyFilter implements LogFilter {
    @Override
    public boolean accept(LogRecord record) {
        return "ERROR".equalsIgnoreCase(record.getLevel());
    }
}
