public class Main {
    public static void main(String[] args) {

        Statistics stats = new Statistics();

        // Добавляем тестовые записи лога
        stats.addEntry(new LogEntry("/index.html", 200, "Windows"));
        stats.addEntry(new LogEntry("/contact.html", 404, "Linux"));
        stats.addEntry(new LogEntry("/about.html", 200, "Windows"));
        stats.addEntry(new LogEntry("/index.html", 200, "MacOS"));
        stats.addEntry(new LogEntry("/home.html", 200, "Linux"));

        // Выводим список всех страниц с кодом 200
        System.out.println("Все страницы с кодом 200:");
        for (String page : stats.getAllPages()) {
            System.out.println(page);
        }

        // Выводим статистику операционных систем
        System.out.println("\nСтатистика операционных систем (доля):");
        stats.getOSStatistics().forEach((os, fraction) ->
                System.out.printf("%s : %.2f%n", os, fraction)
        );
    }
}
