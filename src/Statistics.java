import java.util.*;

public class Statistics {

    private final HashSet<String> pages = new HashSet<>();
    private final HashMap<String, Integer> osCounts = new HashMap<>();

    // Добавляем запись лога
    public void addEntry(LogEntry entry) {
        if (entry.getStatusCode() == 200) {
            pages.add(entry.getPage());
        }

        String os = entry.getOperatingSystem();
        osCounts.put(os, osCounts.getOrDefault(os, 0) + 1);
    }

    // Возвращает список всех страниц с кодом 200
    public List<String> getAllPages() {
        return new ArrayList<>(pages);
    }

    // Возвращает долю каждой операционной системы (от 0 до 1)
    public Map<String, Double> getOSStatistics() {
        Map<String, Double> osStats = new HashMap<>();
        int total = osCounts.values().stream().mapToInt(Integer::intValue).sum();

        for (Map.Entry<String, Integer> entry : osCounts.entrySet()) {
            osStats.put(entry.getKey(), entry.getValue() / (double) total);
        }

        return osStats;
    }
}
