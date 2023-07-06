package HomeWork_2;
/*
*Получить исходную json строку из файла, используя FileReader или Scanner
Дана json строка вида:
String json =
"[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
"{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
"{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.

Используйте StringBuilder для подготовки ответа. Далее создайте метод, который запишет
результат работы в файл. Обработайте исключения и запишите ошибки в лог файл с помощью Logger.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class HW1_1 {
    static Logger logger;
    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," + "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," + "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String res1 = json.replace("фамилия", "Студент").replace("оценка", "получил").replace("предмет", "по предмету");
        String res2 = res1.replaceAll("\"", "");
        String res3 = res2.replace("[", "");
        String res4 = res3.replace("]", "");
        String res5 = res4.replace(","," ");
        String res6 = res5.replace(":", " ");
        String res7 = res6.replace("} {", ":");
        String res8 = res7.replace("{", "");
        String res9 = res8.replace("}","");
        String [] data = res9.split(":");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        createLogger2();
        String filePath = "HomeWork_2/data.txt";
        writeToFile(data, filePath);
        closeLogger2();
    }

    private static void closeLogger2() {
        for (Handler handler: logger.getHandlers()){
            handler.close();
        }
    }

    private static void createLogger2() {
        logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("HomeWork_2/log.txt", true);
            logger.addHandler(fileHandler);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    static void writeToFile(String [] data, String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(Arrays.toString(data));
            writer.write("\n");
            writer.flush();
            logger.info("Запсиь успешно завершена");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning("Запись не удалась");
        }
    }
}