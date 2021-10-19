package finalstatic;

import inheritance.BankAccount;

public class TimeDriver {
    public static void main(String[] args) {
        // 'final'
        // Math.PI = 3.15;
        System.out.println(Math.PI);

        Time t1 = new Time(30);
        Time t2 = new Time(14, 52, 23);
        Time t3 = new Time(23, 2, 7);
        Time t4 = new Time(22, 10);
        Time t5 = new Time();

        Time[] times = {t1, t2, t3, t4, t5};
        for (Time time : times) {
            System.out.println("--------------------");
            System.out.println(time.toUniversalForm());
            System.out.println(time.toStandardForm());
        }

        System.out.println("I created Time objects(instances) " + Time.instanceCount + " times.");
    }
}
