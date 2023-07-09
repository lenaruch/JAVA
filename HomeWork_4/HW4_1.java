package HomeWork_4;

import java.util.*;

/*
    Пусть дан LinkedList с несколькими элементами.
    Реализуйте метод, который вернет “перевернутый” список.
    Постараться не обращаться к листу по индексам.
*/
public class HW4_1 {
    public static void main(String[] args) {
        // Создаем пустой LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("AAA");
        linkedList.add("BBB");
        linkedList.add("CCC");
        linkedList.add("DDD");
        linkedList.add("EEE");
        System.out.println(linkedList);

        // Создаем пустой список, куда будем записывать значения из LinkedList для вывода в консоль
        // (так как это быстрее добавляет новые элементы)
        // Можно так же вместо этого создать другой LinkedList2 (но добавление в него будет идти дольше)
        List<String> list = new ArrayList<>();

        // Итераторм пробигаемся по LinkedList и вытаскиваем из него последний элемент и записываем в новый список
        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()){
            list.add(listIterator.previous());
        }

        // Выводим получившийся список
        System.out.println(list);

    }
}
