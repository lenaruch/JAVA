package HomeWork_4;

import java.util.*;

/*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его
    first() - возвращает первый элемент из очереди, не удаляя.
 */
public class HW4_2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Выводим созданную очередь
        System.out.println(queue);

        // Добавляем елемент в конец очереди
        enqueue(queue);
        System.out.println(queue);

        // Добавляем еще один елемент в конец очереди
        enqueue(queue);
        System.out.println(queue);

        // Возвращаем первый элемент из очереди иудаляем его
        dequeue(queue);
        System.out.println(queue);

        // Добавляем еще один елемент в конец очереди
        enqueue(queue);
        System.out.println(queue);

        // Возвращаем первый элемент из очереди, не удаляя его.
        first(queue);
        System.out.println(queue);

    }

    /**
     * enqueue() - помещает элемент в конец очереди...
     * Сам элемент генерируется исходя из последнего значения из очереди ( + 1)
     */
    static void enqueue (Queue queue){
        //queue.add(Integer.valueOf(queue.size()+1));
        Iterator iterator = queue.iterator();
        int a = 0;
        while (iterator.hasNext()){
            a = (int) iterator.next();
        }
        queue.add(a+1);
    }

    /**
     * dequeue() - возвращает первый элемент из очереди и удаляет его.
     */
    static void dequeue(Queue queue){
        System.out.println(queue.remove());
    }

    /**
     * first() - возвращает первый элемент из очереди, не удаляя его.
     */
    static void first(Queue queue){
        System.out.println(queue.peek());
    }

}
