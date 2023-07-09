package Lesson_4;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/*
    Консольное приложение:
    Принимает от пользователя и "запоминает" строки.
    Если введено print, выводит строки так, чтобы последняя введеная была первой, а первая - последней.
    Если введено revert, удаляет предыдущую троку из памяти.
 */
public class L4_Task_3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        LinkedList list = new LinkedList<>();
        boolean work = true;
        while (work){
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("print")){
                ListIterator<String> listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()){
                    System.out.println(listIterator.previous());
                }
            } else if (line.equalsIgnoreCase("revert") && list.size() > 0) {
                list.removeLast();
            } else {
                list.add(line);
            }
            System.out.println(list);
        }
    }
}
