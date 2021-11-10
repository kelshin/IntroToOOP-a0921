package collections.queue;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        // 0: 'this' is equal to 'o'
        // pos: 'this' is greater than 'o'
        // neg: 'this' is less than 'o'
        // return o.score - this.score;
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
