package collections.queue;

import java.util.*;

public class QueueExercise {

    public static void stutter(Queue<Integer> q) {
        int length = q.size();
        for (int i = 0; i < length; i++) {
            Integer elem = q.poll();
            q.offer(elem);
            q.offer(elem);
        }
    }

    public static void mirror(Queue<String> q) {
        Deque<String> stack = new ArrayDeque<>();
        int length = q.size();
        while (length --> 0) {
            String elem = q.poll();
            q.offer(elem);
            stack.push(elem);
        }
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
    }

    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        stutter(q1);
        System.out.println(q1); //  [1, 1, 2, 2, 3, 3]

        Deque<String> q2 = new ArrayDeque<>(Arrays.asList("a", "b", "c"));
        mirror(q2);
        System.out.println(q2); //  [“a”, “b”, “c”, “c”, “b”, “a”]
    }
}
