package interfaces;

// interface is just an abstract idea
// we know what we need to be movable, not how.
public interface Movable {
    // constants
    static final String COLOR = "Gold";

    void move(int distance);
    boolean canMove();
}
