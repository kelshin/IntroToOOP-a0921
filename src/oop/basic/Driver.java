package oop.basic;

public class Driver {
    public static void main(String[] args) {
//        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 35, 55);
//        Pokemon charizard = new Pokemon("Charizard", "Fire", 50, 35);
//        pikachu.attack(charizard);
//        System.out.println(charizard.healthPoints);
//        pikachu.evolve();

        Car c1 = new Car("Black", "Mercedes", 2021, 500, 2, 200000);
        c1.drive(250);
        c1.drive();
        c1.stop();

        Car c2 = new Car();
        c2.drive(120);
        c2.stop();
    }
}
