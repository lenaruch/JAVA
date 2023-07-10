package Lesson_5;

import java.util.HashMap;
import java.util.Map;

/*
    Процедурный способ
    Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
    3456 Иванов
    2345 Петров
    1314 Иванов
    1243 Сидоров
    2134 Васильев
    7563 Иванов
 */
public class L5_Task_1_V2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        addNote(map,"3456","Иванов");
        addNote(map,"2345","Петров");
        addNote(map,"1314","Иванов");
        addNote(map,"1243","Сидоров");
        addNote(map,"2134","Васильев");
        addNote(map,"7563","Иванов");

        System.out.println(findByName(map, "Иванов"));
    }

    static void addNote(Map<String, String> map, String num, String name){
        map.put(num, name);
    }

    static String findByName(Map<String, String> map, String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String,String> entry: map.entrySet()){
            String num = entry.getKey();
            String name = entry.getValue();
            if (name.equalsIgnoreCase(lastName)){
                stringBuilder.append(num);
                stringBuilder.append(" : ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
