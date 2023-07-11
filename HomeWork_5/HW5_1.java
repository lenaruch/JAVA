package HomeWork_5;

import java.util.*;

/*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class HW5_1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        addContact(map, "Валера", "131313");
        addContact(map, "Игорь", "46323535");
        addContact(map, "Игорь", "47683536");
        addContact(map, "Василий", "6565865");
        addContact(map, "Антон", "863292");
        addContact(map, "Василий", "0354324");

        System.out.println(map);
        System.out.println(findName(map,"Игорь"));

    }

    // Метод для добавления новых контактов, где номер пишется в массив стрингов
    static void addContact(Map<String, ArrayList<String>> map, String name, String phone){
        ArrayList<String> list = map.get(name);
        if (list == null){
            list = new ArrayList<>();
            list.add(phone);
            map.put(name, list);
        } else {
            if (!list.contains(name)){
                    list.add(phone);
            }
        }
    }

    // Поиск по имени в созданном справочнике
    static String findName(Map<String, ArrayList<String>> map, String name){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, ArrayList<String>> entry: map.entrySet()){
            String nameContact = entry.getKey();
            ArrayList<String> phone = entry.getValue();
            if (name.equalsIgnoreCase(nameContact)){
                stringBuilder.append(nameContact);
                stringBuilder.append(" : ");
                stringBuilder.append(phone);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

}