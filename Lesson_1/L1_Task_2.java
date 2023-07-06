package Lesson_1;
// Подсчитат количесвтво подряд идущих "1" в массиве
import java.util.Arrays;
import java.util.Random;

public class L1_Task_2 {
    public static void main(String[] args) {
        int [] arr = random(10, 0, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(count(arr));
    }
    static int[] random(int count, int min, int max){
        int[] arr = new int[count];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(min,max);
        }
        return arr;
    }
    static int count(int[]arr){
        int max_count = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count ++;
                if (max_count < count){
                    max_count = count;
                }
            }
            else{
                count = 0;
            }
        }
        return max_count;
    }
}
