package finalstatic;

import static finalstatic.TimeValidation.checkHour;
import static finalstatic.TimeValidation.checkMinute;
import static finalstatic.TimeValidation.checkSecond;

// universalForm = 21:45:20
// standardForm = 9:45:20 PM
public class Time {
    public static int instanceCount = 0;

    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    // designated constructor: initializes all instance variables
    public Time(int hour, int minute, int second) {
        checkHour(hour);
        checkMinute(minute);
        checkSecond(second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        instanceCount++;
    }

    // universalForm = 21:45:20
    public String toUniversalForm() {
        // "%02d" : decimal 2 digits padding 0 to the left
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // standardForm = 9:45:20 PM
    public String toStandardForm() {
        // ternary operator
        int h = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String unit = (hour < 12) ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", h, minute, second, unit);
    }

    public int getHour() {
        return hour;
    }

    public final void setHour(int hour) {
        checkHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public final void setMinute(int minute) {
        checkMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public final void setSecond(int second) {
        checkSecond(second);
        this.second = second;
    }
}
