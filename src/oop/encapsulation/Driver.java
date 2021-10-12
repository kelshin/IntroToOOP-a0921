package oop.encapsulation;

public class Driver {
    public static void main(String[] args) {
        Book b1 = new Book("Atmoic Habits", "James Clear");
        System.out.println(b1.getTitle());
        b1.setTitle("A");
        System.out.println(b1.getTitle());
        b1.setAuthor("JamesUnclear");
        System.out.println(b1.getAuthor());


    }
}
