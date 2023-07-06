package HomeWork_1;

import java.util.Scanner;

public class HW1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение (a)");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите значение (b)");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Какой результат хотите получить?\n1-Сложение\n2-Вычетание\n3-Умножение\n4-Деление");
        int res = Integer.parseInt(scanner.nextLine());
        float f = b; // Перевод второй переменной для сохранения дробной части при делении
        if (res == 1){
            System.out.println(a + " + " + b + " = " + (a+b));
        } else if (res == 2){
            System.out.println(a + " - " + b + " = " + (a-b));
        } else if (res == 3){
            System.out.println(a + " * " + b + " = " + a*b);
        } else if (res == 4) {
            System.out.println(a + " / " + b + " = " + a/f); // Используем переменную f которую создали ранее
        }
    }
}
