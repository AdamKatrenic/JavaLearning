package loganalyzer.filters;

import loganalyzer.model.LogRecord;

public class ServiceFilter implements LogFilter {

    private final String service;

    public ServiceFilter(String service) {
        this.service = service;
    }

    @Override
    public boolean accept(LogRecord record) {
        return service.equalsIgnoreCase(record.getService());
    }
}
