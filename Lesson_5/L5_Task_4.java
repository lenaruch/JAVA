package Lesson_5;
/*
    Взять набор строк, например,

    Мороз и солнце день чудесный
    Еще ты дремлешь друг прелестный
    Пора красавица проснись.

    Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
    Строки с одинаковой длиной не должны “потеряться”.
 */

import java.util.*;

public class L5_Task_4 {
    public static void main(String[] args) {
        String s = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись.";

        // Удаляем знаки
        s = s.replace(".", "");

        // Заменяем перенос строки на пробелы
        s =s.replace("\n", " ");

        // Создаем массив из строки сплитом по пробелу
        String[] words = s.split(" ");

        //  В следующей строке аргумент Comparator.reverseOrder() дает обратную сортировку
        // Если его убрать, то будет сортировка по умолчанию от меньшего к большему
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String word: words){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}
