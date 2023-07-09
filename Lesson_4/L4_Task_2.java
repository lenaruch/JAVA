package Lesson_4;

import java.util.LinkedList;
import java.util.Scanner;

/*
    Написать консольное приложение
    которое принимает от пользователя строку вида:
    text~num
    Нужно рассплитить строку по ~, сохранить text в связный список на позицию num
    Если введено print~sum, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
public class L4_Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList list = new LinkedList<>();
        while (work){
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            String numString = arr[1];
            int num = Integer.parseInt(numString);
            if (num > list.size() || num < 0){
                System.out.println("Индекс за переделами. операция невозможна");
                continue;
            }
            switch (text){
                case "print":
                    if (num == list.size()){
                        System.out.println("Индекс за переделами. операция невозможна");
                        continue;
                    }
                    System.out.println(list.remove(num));
                    break;
                case "end":
                    work = false;
                    break;
                default:
                    list.add(num, text);

            }
        }
    }
}
