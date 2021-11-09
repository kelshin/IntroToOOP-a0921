package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] args) {
        Set<String> food = new HashSet<>();
        food.add("Sushi");
        food.add("Pizza");
        food.add("Burger");
        food.add("Sushi");
        food.add("Pizza");
        food.add("Burger");
        System.out.println(food.size());

        Set<String> food2 = new HashSet<>();
        food2.add("Sushi");
        food2.add("Pizza");
        food2.add("Taco");
        food2.add("BBQ");

//        food.addAll(food2);
//        food.retainAll(food2);
//        food.removeAll(food2);

        System.out.println(food);
    }
}
