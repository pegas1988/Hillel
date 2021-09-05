package Test;

class TestStringTwo {
    public static void main(String[] args) {
        String str1 = "hello";
        final String str2 = "hel";
        String str3 = "lo";

        System.out.println(str1 == str2 + str3);
        System.out.println(str1.equals(str2 + "lo"));
    }
}
