package Lesson_2;
/*
Напишите метод, который сжимает строку.
Ввод: aaaabbbcdd
Вывод: a4b3cd2
 */
public class L2_Task_2 {
    public static void main(String[] args) {
         String s = "aaaabbbcdde";
        System.out.println(squeze(s));
    }

    static String squeze (String Line){
        int count = 1;
        char[] chars = Line.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < chars.length; i++)
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                stringBuilder.append(chars[i-1]);
                if (count != 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        stringBuilder.append(chars[chars.length - 1]);
        if (count != 1){
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
}
