package basics;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Types
        // - the value (itself) gets stored in memory

        // To create a variable in Java
        // Java is statically typed language!
        byte day = 127;        // 8 bits (-128 <=   <= 127)
        short year = 2021;     // 16 bits (-2^15 <=   <= 2^15 - 1)
        int age = 25;          // 32 bits (-2^31 <=   <= 2^31 - 1)
        long sin = 123456789L; // 64 bits (-2^63 <=   <= 2^63 - 1)

        char gender = 'M';     // 1 byte to store single character
        char ch = 65;          // 'A'
        boolean flag = true;   // true or false
        float weight = 170.56f;  // 32 bits
        double height = 180.23;  // 64 bits

        // Operators
        int x = 10;
        int y = x++;  // x += 1;  // post-fix
        int z = ++x;  // x += 1;  // pre-fix
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
