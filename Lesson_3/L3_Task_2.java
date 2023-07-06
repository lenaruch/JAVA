package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L3_Task_2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5,7,0,2,6,2};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.sort(null);
        System.out.println(list);
    }
}
