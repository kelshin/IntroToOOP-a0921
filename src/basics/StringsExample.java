package basics;

public class StringsExample {
    public static void main(String[] args) {
        // 1. string literal
        String name = "Derrick";     // data segment (read only)
        String name1 = new String("Derrick");  // heap segment
        String name2 = "Derrick";
        System.out.println(name);
        System.out.println(name1);

        System.out.println(name == name1); // false
        System.out.println(name == name2); // true

        // length (the number of characters)
        System.out.println(name.length());

        // substring
        System.out.println(name.substring(0, 3));  // "Der"
        System.out.println(name.substring(3));     // "rick"

        // indexOf
        System.out.println(name.indexOf("ic"));

        // comparing strings
        // == compares memory addresses
        if (name == name1) {
            System.out.println("name and name1 are the same.");
        } else {
            System.out.println("name and name1 are not the same.");
        }

        // comparing strings (contents) the right way
        if (name.equals(name1)) {
            System.out.println("name is equal to name1.");
        } else {
            System.out.println("name is not equal to name1.");
        }

        // print every single character in a String
        String brand = "Apple";
        for (int i = 0; i < brand.length(); i++) {
            // String l = brand.substring(i, i + 1);
            System.out.println(brand.substring(i, i + 1));  // String  "A"
            // char n = brand.charAt(i);
            System.out.println(brand.charAt(i));  // char  'A'
        }

        // char[] = {'A', 'p', 'p', 'l', 'e'};
        for (char ch : brand.toCharArray()) {
            System.out.println(ch);
        }
    }
}