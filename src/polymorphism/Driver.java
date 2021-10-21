package polymorphism;

import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        //                      Employee
        // DataScientist, Designer, ProductManager, SoftwareDeveloper
        // Inheritance => is-a relationship => "Software Developer is an Employee"
        Employee kelbin = new SoftwareDeveloper("e123", 70_000, new Date(), "Java");
        Employee gabo = new Designer("e124", 70_000, new Date(), true);
        Employee sena = new DataScientist("e125", 70_000, new Date(), "#123");
        Employee sasa = new ProductManager("e126", 70_000, new Date(), "#abc");

        Employee[] dreamTeam = {kelbin, gabo, sena, sasa};
        int totalSalary = 0;
        for (Employee employee : dreamTeam) {
            // Polymorphsim "Same type but different methods"
            // dynamically (at runtime)
            // it calls getSalary() from each instance
            System.out.println(employee.getSalary());
            totalSalary += employee.getSalary();
        }
        System.out.println("Total Salary: " + totalSalary);

        // "hey compiler! trust me Kelbin is a software developer object"
        // kelbin.codeReview(); -> compile error
        // Compile-time -> kebin is Employee type
        // Run-time     -> since kebin is an instance of SoftwareDeveloper, we can down-cast kelbin to SoftwareDeveloper
        ((SoftwareDeveloper) dreamTeam[0]).codeReview();

        // How to check the type of an object?
        // method 1
        if (gabo instanceof SoftwareDeveloper) {
            ((SoftwareDeveloper) gabo).codeReview();
        }
        // method 2
        if (SoftwareDeveloper.class.isInstance(gabo)) {
            ((SoftwareDeveloper) gabo).codeReview();
        }
        // method 3
        if (SoftwareDeveloper.class.isAssignableFrom(gabo.getClass())) {
            ((SoftwareDeveloper) gabo).codeReview();
        }
        // method 4
        try {
            ((SoftwareDeveloper) gabo).codeReview();
        } catch (ClassCastException e) {
            System.out.println("Gabo is not a software developer yet!");
            System.out.println(e.getLocalizedMessage());
        }

        for (Employee employee : dreamTeam) {
            employee.work();
        }
    }
}
