package Lesson_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//  1. Написать метод, который принимает массив чисел, омещает их в стек и выводит в консоль содержимое стека.
//  2. Написать метод, который принимает массив чисел, омещает их в очередь и выводит в консоль содержимое очереди.
public class L4_TAsk_4 {
    public static void main(String[] args) {
        testQueue();
    }
    static void testStack(){
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");

        // System.out.println(stack);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        for (String string: stack){
            System.out.println(string);
        }

    }
    static void testQueue (){
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");

        // System.out.println(queue);

        // while (!queue.isEmpty()){
        //     System.out.println(queue.poll());
        // }

        for (String string: queue){
            System.out.println(string);
        }
    }
}
