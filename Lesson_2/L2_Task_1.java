package Lesson_2;

import java.util.Scanner;

/*
Дано четно число N (>0) и символы с1 и с2 (тип char).
аписать метод, который вернет строку длины N, которая состоит из чередующихся символов с1 и с2.
Вывод: с1с2с1с2...с1с2(всего N раз)
 */
public class L2_Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину строки: ");
        int n = scanner.nextInt();
        char c1 = 'l';
        char c2 = 'k';
        System.out.println(build(c1,c2,n));
    }
    static StringBuilder build (char c1, char c2, int n){
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            newString.append(c1).append(c2);
        }
        return new StringBuilder(newString.toString());
    }
}
