package Test;

public class StringSumm {
    public static void main(String[] args) {
        System.out.println(getsum1("75", "25"));
        System.out.println(getsum2("75", "25"));
    }

    public static Integer getsum1(String first, String second) {
        return Integer.parseInt(first + second);
    }

    public static String getsum2(String first, String second) {
        return Integer.valueOf(first + second).toString();
    }
}
