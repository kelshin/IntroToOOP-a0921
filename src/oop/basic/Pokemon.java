package oop.basic;

public class Pokemon {
    // data fields (attributes) - instance variables
    String name;
    String type;
    int healthPoints;
    int attackPoints;

    // Constructor: a special method to create an instance (object)
    // - default constructor: a constructor without any parameters
    // - default constructor is given by the compiler if you don't define any constructor yourself
    Pokemon(String name, String type, int healthPoints, int attackPoints) {
        // Initialize our data fields (instance variables)
        // 'this' : "self-reference"
        this.name = name;
        this.type = type;
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
    }

    // methods (behaviours) - instance method (non-static method)
    void attack(Pokemon enemy) {
        if (enemy.dodge()) {
            System.out.println(enemy.name + " dodged my attack!");
        } else {
            System.out.println("Attack has been successful! -" + this.attackPoints);
            enemy.healthPoints -= this.attackPoints; // this refers to the instance(object) that called this method
        }
    }

    boolean dodge() {
        // you have 50 % chance of dodging (randomly)
        // Math.random(): returns a random double value from 0.0 to 1.0
        return Math.random() <= 0.5;
    }

    void evolve() {
        System.out.println(this.name + " is evolving...");
        this.attackPoints += 20;
        this.healthPoints += 20;
        System.out.println("AP : " + this.attackPoints);
        System.out.println("HP : " + this.healthPoints);
    }
}
