package HomeWork_4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class HW4_3 {
    public static void main(String[] args) {
        // Создаем LinkedList и добавляем в него элементы
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(6);
        linkedList.add(4);
        linkedList.add(2);
        System.out.println(linkedList);

        // Создаем переменную для вывода суммы
        int sum = 0;

        // Создаем итератор для того, чтобы пройтись по linkedlist и там же в цикле добавляем значения элементов к sum
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            sum = sum + listIterator.next();
        }

        // Выводим sum
        System.out.printf("Сумма всех элементов равно %d", sum);
    }
}
