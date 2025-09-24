import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validFileCount = 0; // счётчик верно указанных файлов

        while (true) {
            System.out.print("Введите путь к файлу: ");
            String filePath = scanner.nextLine();

            File file = new File(filePath);

            boolean fileExists = file.exists();      // проверка существования файла
            boolean isFile = file.isFile();          // проверка, что путь ведёт именно к файлу

            if (!fileExists) {
                System.out.println("Файл не существует. Попробуйте ещё раз.");
                continue; // возвращаемся к началу цикла
            } else if (!isFile) {
                System.out.println("Указанный путь ведёт не к файлу, а к папке. Попробуйте ещё раз.");
                continue; // возвращаемся к началу цикла
            } else {
                validFileCount++;
                System.out.println("Путь указан верно.");
                System.out.println("Это файл номер " + validFileCount);
            }
        }
    }
}
