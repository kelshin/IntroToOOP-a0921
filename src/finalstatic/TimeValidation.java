package finalstatic;

public class TimeValidation {
    public static void checkHour(int hour) throws IllegalArgumentException {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
    }

    public static void checkMinute(int minute) throws IllegalArgumentException {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
    }

    public static void checkSecond(int second) throws IllegalArgumentException {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("second must be 0-59");
        }
    }
}
