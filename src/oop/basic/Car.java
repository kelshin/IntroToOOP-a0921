package oop.basic;

public class Car {
    // data fields (instance variables)
    String color;
    String brand;
    int year;
    int horsePower;
    int seats;
    int price;

    // constructor: to create a new instance (object)
    // - 'initialize' instance variables
    Car(String color, String brand, int year, int horsePower, int seats, int price) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.horsePower = horsePower;
        this.seats = seats;
        this.price = price;
    }

    // "method overloading" - creating methods with the same name but different set of parameters
    Car() {
        this.brand = "Tesla";
        this.year = 2021;
        this.horsePower = 250;
        this.seats = 4;
        this.price = 45000;
    }

    // methods (behaviors)
    void drive(int speed) {
        System.out.println("Driving " + this.brand + " at " + speed + " km/h");
    }

    void drive() {
        System.out.println("Driving..." + this.brand);
    }

    void stop() {
        System.out.println("Stopping...");
    }
}
