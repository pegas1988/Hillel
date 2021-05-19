public class neededMethodClass {

    static String theString = "(1)";

    public static String theMethod() {
        for (int i = 2; i <= 30; i++) {
            theString = theString + "(" + i + ")";
        }
        return theString;
    }
}
