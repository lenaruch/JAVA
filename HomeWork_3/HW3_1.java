package HomeWork_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.random.RandomGenerator;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class HW3_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // создаем список
        // Заполняем список 15 рандомными числами от 0 до 10
        for (int i = 0; i < 10; i++) {
            list.add(RandomGenerator.getDefault().nextInt(0,10));
        }

        // Выводим сгенерированный список
        System.out.println(list);

       List<Integer> list2 = new ArrayList<>();

        removeOven3(list);

        System.out.println(list);
    }

    // 1.Способ перебора через итератор
    static void removeOven1(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Integer a = (Integer)iterator.next();
            if ( a %2 == 0){
                iterator.remove();
            }
        }
    }

    // 2. Способ чере цикл FOR (обратный)
    // Пробигаемся по списку циклом FOR для проверки числа на четность и его удаления из списка
    // Цикл идет в обратную сторону!!! Так как в обратном случае вывод будет не корректный
    static void removeOven2(List list){
        for (int i = list.size()-1; i >= 0; i--) {
            Integer value = (Integer) list.get(i);
            if (value % 2 == 0){
                list.remove(i);
            }
        }
    }

    // 3.Способ через цикл FOR (прямой)
    // Пробигаемся по списку циклом FOR для проверки числа на четность и его удаления из списка
    // В конце каждого цикла смещаемся назад для проверки числа, которое сместилось на место удаленного
    static void removeOven3(List list){
        for (int i = 0; i < list.size(); i++) {
            Integer value = (Integer) list.get(i);
            if (value % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }
}
