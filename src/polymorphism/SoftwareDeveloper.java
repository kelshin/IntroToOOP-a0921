package polymorphism;

import java.util.Date;

public class SoftwareDeveloper extends Employee {
    private static final double BONUS_RATE = 0.5;
    private String specialty;

    public SoftwareDeveloper(String employeeId, long salary, Date startDate, String specialty) {
        super(employeeId, salary, startDate);
        this.specialty = specialty;
    }

    @Override
    public long getSalary() {
        return super.getSalary() + Math.round(super.getSalary() * BONUS_RATE);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void codeReview() {
        System.out.println("Doing the code review!");
    }

    @Override
    public void work() {
        System.out.println("SoftwareDeveloper(" + getEmployeeId() + ") is working on some data.");
    }
}
