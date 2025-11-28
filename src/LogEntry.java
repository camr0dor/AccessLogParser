public class LogEntry {
    private final String page;
    private final int statusCode;
    private final String operatingSystem;

    public LogEntry(String page, int statusCode, String operatingSystem) {
        this.page = page;
        this.statusCode = statusCode;
        this.operatingSystem = operatingSystem;
    }

    public String getPage() {
        return page;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
