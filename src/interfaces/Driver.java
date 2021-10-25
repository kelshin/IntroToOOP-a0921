package interfaces;

public class Driver {
    public static void main(String[] args) {
        Car c1 = new Car("Ford");
        House h1 = new House(3);
        Caravan cr1 = new Caravan(5);

        Movable[] movables = {c1, cr1};
        Habitable[] habitables = {h1, cr1};

        for (Movable mv: movables) {
            mv.move(10);
        }

        // down-casting
        Caravan caravan = ((Caravan) movables[1]);
        System.out.println(caravan.canFit(3));

        // down-casting to wrong type
        // 'ClassCastException'
//        Car car = ((Car) movables[1]);
//        car.move(50);

    }
}
