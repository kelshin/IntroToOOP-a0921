package collections.list;

public class Driver {
    public static void main(String[] args) {
        MyArrayList<String> al = new MyArrayList<>();
        al.add("Hello");
        al.add("Hello");
        al.add("Hello");

        MyArrayList<String> toAdd = new MyArrayList<>();
        toAdd.add("Bye");
        toAdd.add("Bye");

        al.addAll(1, toAdd);
        System.out.println(al);


    }
}
