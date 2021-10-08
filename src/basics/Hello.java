package basics;

public class Hello {
    // psvm + tab -> main method
    // main method -> you must have this method to run your java file.
    public static void main(String[] args) {
        // sout + tab -> println -> print with a newline
        System.out.println("Hello, Java!");
        System.out.println("Bye!");

        // print -> print without a newline
        System.out.print("Vancouver, ");
        System.out.print("BC\n");

        // printf -> print with format
        // %s: string
        // %d: int (digit)
        // %f: float
        System.out.printf("%s class starts at %02d:%02d pm\n", "Java", 1, 0);
    }
}