package collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        for (int y = year + 1; y <= 10234; y++) {
            String strYear = String.valueOf(y);
            HashSet<Character> set = new HashSet<>();
            for (Character ch : strYear.toCharArray()) {
                if (!set.add(ch)) {
                    break;
                }
            }
            if (strYear.length() == set.size()) {
                System.out.println(strYear);
                break;
            }
        }
        in.close();
    }
}
