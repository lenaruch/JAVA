package Lesson_5;
/*
    Способ в стиле ООП
    Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
    3456 Иванов
    2345 Петров
    1314 Иванов
    1243 Сидоров
    2134 Васильев
    7563 Иванов
 */
public class L5_Task_1 {
    public static void main(String[] args) {
        Passports passports = new Passports();
        passports.addNote("3456","Иванов");
        passports.addNote("2345","Петров");
        passports.addNote("1314","Иванов");
        passports.addNote("1243","Сидоров");
        passports.addNote("2134","Васильев");
        passports.addNote("7563","Иванов");

        System.out.println(passports.findByName("Иванов"));
    }
}
