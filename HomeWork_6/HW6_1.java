package HomeWork_6;

import java.util.HashSet;
import java.util.Set;

/*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
    отвечающие фильтру. Критерии фильтрации можно хранить в Map.

    Например:
    “Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …

    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
    Работу сдать как обычно ссылкой на гит репозиторий

    Частые ошибки:
    1. Заставляете пользователя вводить все существующие критерии фильтрации
    2. Невозможно использовать более одного критерия фильтрации одновременно
    3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
    4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков или добавить еще ноутбук,
    то программа начинает работать некорректно
 */
public class HW6_1 {
    public static void main(String[] args) {
        Set<NoteBook> set = new HashSet<>();

        NoteBook noteBook_1 = new NoteBook("Samsung", "i7 8700k", 8,256, "Windows 10", "black");
        NoteBook noteBook_2 = new NoteBook("Xiaomi", "i9 9900kf", 4,120, "DOS", "white");
        NoteBook noteBook_3 = new NoteBook("Apple", "i7 4790k", 32,512, "Ubuntu", "silver");
        NoteBook noteBook_4 = new NoteBook("Huawei", "i5 10400f", 16, 1024, "Windows XP", "red");
        NoteBook noteBook_5 = new NoteBook("Acer", "i3 1100", 16,256, "Windows 7", "silver");
        NoteBook noteBook_6 = new NoteBook("Acer", "AMD Ryzen 5600G", 4,512, "CentOS", "orange");
        NoteBook noteBook_7 = new NoteBook("Apple", "AMD Ryzen 2200U", 8,1024, "Windows", "purple");
        NoteBook noteBook_8 = new NoteBook("Dexp", "Baikal", 64,2048, "Linux", "gray");
        NoteBook noteBook_9 = new NoteBook("Lenovo", "Эльбрус", 128,2048, "DOS", "invisible");

        set.add(noteBook_1);
        set.add(noteBook_2);
        set.add(noteBook_3);
        set.add(noteBook_4);
        set.add(noteBook_5);
        set.add(noteBook_6);
        set.add(noteBook_7);
        set.add(noteBook_8);
        set.add(noteBook_9);


    }
}
