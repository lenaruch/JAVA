package HomeWork_5;

import com.sun.jdi.Value;
import com.sun.source.doctree.DocTree;
import com.sun.source.doctree.ValueTree;

import javax.naming.ldap.SortKey;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.Key;
import java.sql.Array;
import java.time.Instant;
import java.time.temporal.ValueRange;
import java.util.*;

/*
    Пусть дан список сотрудников:
    Иван Иванов;Светлана Петрова;Кристина Белова;Анна Мусина;
    Анна Крутова;Иван Юрин;Петр Лыков;Павел Чернов;Петр Чернышов;
    Мария Федорова;Марина Светлова;Мария Савина;Мария Рыкова;
    Марина Лугова;Анна Владимирова;Иван Мечников;Петр Петин;Иван Ежов

    Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    Отсортировать по убыванию популярности. Для сортировки использовать TreeMap
 */
public class HW5_2 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        addContact(map, "Иван", "Иванов");
        addContact(map, "Светлана", "Петрова");
        addContact(map, "Кристина", "Белова");
        addContact(map, "Анна", "Мусина");
        addContact(map, "Анна", "Крутова");
        addContact(map, "Иван", "Юрин");
        addContact(map, "Петр", "Лыков");
        addContact(map, "Павел", "Чернов");
        addContact(map, "Петр", "Чернышов");
        addContact(map, "Мария", "Федорова");
        addContact(map, "Марина", "Светлова");
        addContact(map, "Мария", "Савина");
        addContact(map, "Мария", "Рыкова");
        addContact(map, "Марина", "Лугова");
        addContact(map, "Анна", "Владимирова");
        addContact(map, "Иван", "Мечников");
        addContact(map, "Петр", "Петин");
        addContact(map, "Иван", "Ежов");

        Map<String, Integer> treeMap = new TreeMap<>();
        for (Map.Entry<String, ArrayList<String>> entry: map.entrySet()) {
            String name = entry.getKey();
            ArrayList<String> count = entry.getValue();
            int size = count.size();
            treeMap.put(name, size);
        }


        Map<Integer, ArrayList<String>> treeMap2 = new TreeMap<>();
        for (Map.Entry<String, Integer> entry2: treeMap.entrySet()){
            ArrayList<String> list = treeMap2.get(entry2.getValue());
            if (list == null){
                list = new ArrayList<>();
                list.add(entry2.getKey());
                treeMap2.put(entry2.getValue(),list);
            } else {
                if (!list.contains(entry2.getKey())){
                    list.add(entry2.getKey());
                }
            }
        }

        System.out.println(treeMap2);

    }

    static void addContact(Map<String, ArrayList<String>> map, String name, String lastName){
        ArrayList<String> list = map.get(name);
        if (list == null){
            list = new ArrayList<>();
            list.add(lastName);
            map.put(name, list);
        } else {
            if (!list.contains(name)){
                list.add(lastName);
            }
        }
    }
}
