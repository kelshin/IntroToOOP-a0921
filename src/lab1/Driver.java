package lab1;

public class Driver {
    public static void main(String[] args) {
        Model susan = new Model("Susan", "Smith", 70, 120,true,false);
        Model woods = new Model("Tiger", "Woods", 72, 190, true, false);

        Model[] models = {
                new Model("Susan", "Smith", 70, 120,true,false),
                new Model("Tiger", "Woods", 72, 190, true, false),
        };

//        susan.printDetails();
//        woods.printDetails();

        susan.displayModelDetails();
        woods.displayModelDetails();
    }
}
