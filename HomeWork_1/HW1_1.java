package HomeWork_1;

import java.util.Scanner;

public class HW1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("От какого числа вычесляем тругольно число?");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Треугольное число от "+ number + " будет равно " + (number * (number+1))/2);
    }
}
