package oop.encapsulation;

public class Person {
    private String username;
    private String sin;

    public Person(String username) {
        this.username = username;
        this.sin = generateSIN();
    }

    // (int) min <= (int) Math.random() * (max - min + 1) + min < (int) (max + 1)
    private String generateSIN() {
        int randomInt = (int)(Math.random() * ((999999999 - 100000000) + 1)) + 100000000;
        return String.valueOf(randomInt);
    }

    public String getUsername() {
        return username;
    }
}

