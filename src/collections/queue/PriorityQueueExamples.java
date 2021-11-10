package collections.queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExamples {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("Java");
        pq.add("Python");
        pq.add("PHP");
        pq.add("C/C++");
        pq.add("JavaScript");
        pq.add("Go");
        pq.add("Swift");
        // System.out.println(Arrays.toString(pq.toArray()));

//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }


        Student st1 = new Student("Kosei", (int) (Math.random() * 100));
        Student st2 = new Student("Junya", (int) (Math.random() * 100));
        Student st3 = new Student("Gab", (int) (Math.random() * 100));
        Student st4 = new Student("Kebin", (int) (Math.random() * 100));
        Student st5 = new Student("Sena", (int) (Math.random() * 100));
        Student st6 = new Student("Sasa", (int) (Math.random() * 100));
        Student st7 = new Student("Mauricio", (int) (Math.random() * 100));

        PriorityQueue<Student> students = new PriorityQueue<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);

        while (!students.isEmpty()) {
            // poll or remove : O(log n)
            System.out.println(students.poll());
        }

    }
}