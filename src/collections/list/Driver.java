package collections.list;

public class Driver {
    public static void main(String[] args) {
        MyArrayList<String> al = new MyArrayList<>();
        al.add("Hello");
        al.add("Hello");
        al.add("Hello");
        System.out.println(al);

        al.set(10, "Bye");


    }
}
