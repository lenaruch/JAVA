package HomeWork_3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.random.RandomGenerator;

import static java.lang.String.format;

// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
public class HW3_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // создаем список
        // Заполняем список 15 рандомными числами от 0 до 10
        for (int i = 0; i < 5; i++) {
            list.add(RandomGenerator.getDefault().nextInt(0,10));
        }
        // Выводим сгенерированный список
        System.out.println(list);

        // Выводим максимальное значение
        System.out.printf("Максимальное значение = %d\n", Collections.max(list));

        // Выводим минимальное значение
        System.out.printf("Минимальное значение = %d\n", Collections.min(list));

        // Через цикл находим сумму всех элементов
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }

        // Выводим через Ф строку среднее значение (double mid = sum/list.size();)
        // как округлить???
        System.out.printf("Среднее значение = %f\n", sum/list.size());
    }
}
