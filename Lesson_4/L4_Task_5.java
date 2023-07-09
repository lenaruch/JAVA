package Lesson_4;
/*
    Реализовать стэк с помощью массива.
    Нужно реализорвать методы:
    size(), empty(), push(), peek(), pop()
 */
public class L4_Task_5 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.size);
        stack.push("3");
        stack.push("7");
        System.out.println(stack.size);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
