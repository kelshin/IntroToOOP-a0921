package interfaces;

public class Caravan implements Movable, Habitable {
    private int maxCapacity;

    /* distance from 0(home) to current location */
    private int location;

    public Caravan(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.location = 0;
    }

    public Caravan(int maxCapacity, int location) {
        this.maxCapacity = maxCapacity;
        this.location = location;
    }

    @Override
    public void move(int distance) {
        System.out.println(COLOR); // you can access the constant defined in the interface
        location += distance;
    }

    @Override
    public boolean canMove() {
        return true;
    }

    @Override
    public boolean canFit(int inhabitants) {
        return inhabitants <= maxCapacity;
    }
}
