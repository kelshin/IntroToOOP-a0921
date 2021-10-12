package week1.classes;

public class Driver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5, "Red");
        r1.draw();

        Rectangle r2 = new Rectangle(20, 10);
        r2.draw();

        Rectangle r3 = new Rectangle(10, 0, "Green");
        r3.draw();
    }
}
