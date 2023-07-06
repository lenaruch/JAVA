package Lesson_1;
// Разворто фразы
public class L1_Task_3 {
    public static void main(String[] args) {
        String line = "Добро пожаловать на курс по Java";
        System.out.println(reverse(line));
    }
    static String reverse(String line){
        String[] temp = line.split(" ");
        String res = "";
        for (int i = temp.length - 1; i >= 0 ; i--) {
            res += temp[i];
            res += " ";
        }
        return res;
    }
}
