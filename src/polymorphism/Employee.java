package polymorphism;

import java.util.Date;

public class Employee {
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

    public void work() {
        System.out.println("Employee ID: " + employeeId + " is working...");
    }
}
