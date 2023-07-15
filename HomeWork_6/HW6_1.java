package HomeWork_6;

import java.security.Key;
import java.util.*;

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
        Set<NoteBook> noteBooks = new HashSet<>();

        NoteBook noteBook_1 = new NoteBook("MSI","Intel","i3", 64,256, "Windows", "black");
        noteBooks.add(noteBook_1);
        NoteBook noteBook_2 = new NoteBook("ASUS","Intel","i9", 4,512, "Ubuntu", "gray");
        noteBooks.add(noteBook_2);
        NoteBook noteBook_3 = new NoteBook("Apple","Intel","i7", 16,256, "Ubuntu", "silwer");
        noteBooks.add(noteBook_3);
        NoteBook noteBook_4 = new NoteBook("Huawei","Intel","i3", 8,2048, "DOS", "white");
        noteBooks.add(noteBook_4);
        NoteBook noteBook_5 = new NoteBook("HP","Intel","i5", 32,256, "DOS", "red");
        noteBooks.add(noteBook_5);
        NoteBook noteBook_6 = new NoteBook("Acer","Intel","i5", 8,512, "Windows", "white");
        noteBooks.add(noteBook_6);
        NoteBook noteBook_7 = new NoteBook("MSI","Intel","i7", 16,1024, "Windows", "white");
        noteBooks.add(noteBook_7);

        Map<Integer, String> map_prop = new HashMap<>();
        map_prop.put(1, null); // RAM
        map_prop.put(2, null); // MEMORY

        System.out.println("Введите минимальное значение ОЗУ:");
        Scanner scanner = new Scanner(System.in);
        String ram = scanner.nextLine();
        map_prop.put(1, ram);

        System.out.println("Введите минимальный объем накопителя:");
        String ssd = scanner.nextLine();
        map_prop.put(2, ssd);


        noteBooks.forEach(noteBook -> System.out.println(noteBook.matchRam(32)));

    }
}

