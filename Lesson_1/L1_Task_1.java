package Lesson_1;
// Поприветсововать польхователя в зависимости от времени суток
import java.time.LocalTime;
import java.util.Scanner;

public class L1_Task_1 {
    public static void main(String[] args) {
        /*

         */
        Scanner scanner = new Scanner(System.in);
        LocalTime time = LocalTime.now();
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12){
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день, " + name + "!");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}
