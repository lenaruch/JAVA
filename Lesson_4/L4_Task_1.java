package Lesson_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

// 1. Замерьте время, за которое в ArrayList добавляется 1000 элементов.
// 2. Замерьте время, за которое в  LinkedList добавляется 1000 элементов. Сравните с предыдущим.
public class L4_Task_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        LinkedList list2 = new LinkedList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(0,i);
        }
        long timeStop = System.currentTimeMillis();
        System.out.println(timeStop-timeStart);
    }
}
