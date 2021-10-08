package basics;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Array - "fixed size", a sequence of elements of the same type
        // 1. array literal syntax
        int[] arr1 = {1, 2, 3, 4, 5};               // stack
        // int[] arr4 = new int[] {1, 2, 3, 4, 5};  // heap

        // the length (size) of an array
        System.out.println(arr1.length);

        // access elements in array
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length - 1]);

        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1)); // option + return  (auto import)

        // change the element at 0-index
        arr1[0] = 7;

        // Using loops
        // 1. traditional for-loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        // 2. for each loop
        for (int elem : arr1) {
            System.out.println(elem);
        }

        // 2. create an array with "size"
        // - create a new array with size 10
        // - by default, initial values will be zero
        int[] arr2 = new int[10];
        System.out.println(Arrays.toString(arr2));

        char[] arr3 = new char[26];
        char ch = 'A';
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = ch;
            ch++;
        }
        System.out.println(Arrays.toString(arr3));

        String[] countries = {"Canada", "USA", "Mexico", "Japan", "Taiwan", "Hongkong", "Turkey", "Colombia", "Philippines"};
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
