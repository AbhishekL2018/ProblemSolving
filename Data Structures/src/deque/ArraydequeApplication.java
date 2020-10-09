package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArraydequeApplication {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addFirst(5);
        deque.addLast(20);
        deque.addLast(30);
        System.out.println(deque);
    }
}
