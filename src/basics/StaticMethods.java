package basics;

public class StaticMethods {
    public static int addTwo(int a, int b) {
        return a + b;
    }

    public static String fullName(String first, String last) {
        return first + " " + last;
    }

    public static void main(String[] args) {
        int res = addTwo(10, 20);
        System.out.println(res);
        System.out.println(fullName("Derrick", "Park"));
    }
}
/*
def add_two(a: int, b: int) -> int:
    return a + b

def full_name(fn: str, ln: str) -> str:
    return fn + " " + ln;

 */