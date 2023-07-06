package Lesson_2;
/*
Напишите метод, который составит сторку, состоящую из 100 слов ' TEST'
и метод, который запишет эту строку в текстовый файл. Обработайте исключения.
 */
import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class L2_Task_3 {
    static Logger logger;
    public static void main(String[] args) {
        int n = 100;
        String s = "Test";
        String s1 = duplicate(s,n);
        String filePath = "test.txt";
        createLogger();
        writeToFile(s1, filePath);
        System.out.println(readInFile(filePath));
        closeLogger();
    }

    private static void closeLogger() {
        for (Handler handler: logger.getHandlers()){
            handler.close();
        }
    }

    private static void createLogger() {
        logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt", true);
            logger.addHandler(fileHandler);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String readInFile(String filePath) {
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void writeToFile(String s1, String filePath) {
        try {FileWriter writer = new FileWriter(filePath, true);
            writer.write(s1);
            writer.write("\n");
            writer.flush();
            logger.info("Запсиь успешно завершена");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning("Запись не удалась");
        }
    }

    static String duplicate(String s, int n) {
        return s.repeat(n);
    }
}
