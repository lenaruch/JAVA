package Lesson_3;
/*
Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L3_Task_1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "0";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h','e','l','l','o'});

        System.out.println(s1 == s2); //True
        System.out.println(s3 == s1); //True
        System.out.println(s4 == s2); //False
        System.out.println(s5 == s1); //False
        System.out.println(s6 == s1); //False
        // x.equals(z) - сравнивает содержание объектов а не ссылки стрингов
        // == так нельзя проверять ссылочные типы данных
        System.out.println(s1.equals(s2)); //True
        System.out.println(s1.equals(s5)); //True
    }

}

