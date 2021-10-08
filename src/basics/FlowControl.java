package basics;

public class FlowControl {
    public static void main(String[] args) {
        // {} -> curly braces
        // [] -> square brackets
        // () -> parenthesis
        // "" -> double quotes
        // '' -> single quote
        // &  -> ampersand
        // ;  -> semi-colon
        // :  -> colon
        // *  -> star, asterisk
        // |  -> vertical bar
        // -  -> dash
        // `  -> back tick
        // /  -> slash
        // \  -> back slash
        // ^  -> caret

        // 1. if-else statement
        int age = 21;
        if (age > 50) {
            System.out.println("age is greater than 50");
        } else if (age > 30 && age <= 50) {
            System.out.println("30 <= age <= 50");
        } else {
            System.out.println("age < 30");
        }

        // 2. switch statement
        int salary = 1_000_000;
        switch (salary) {
            case 1_000_000:
                System.out.println("Not bad!");
                break;
            case 120_000:
                System.out.println("Senior Engineer");
                break;
            case 900_000:
                System.out.println("Intermediate Engineer");
                break;
            case 60_000:
                System.out.println("Junior Engineer");
                break;
            default:
                System.out.println("Unemployed");
                break;
        }
    }
}
