package polymorphism;

import java.util.Date;

public abstract class Employee {
    private String employeeId;
    private long salary;
    private Date startDate;

    public Employee(String employeeId, long salary, Date startDate) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.startDate = startDate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public long getSalary() {
        return salary;
    }

    // abstract method is a method without body, it's just a declaration.
    public abstract void work();
}
