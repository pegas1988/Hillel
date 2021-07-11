package HW1;

class neededMethodClass {

    private static String theString = "(1)";

    static String theMethod() {
        for (int i = 2; i <= 30; i++) {
            theString = theString + "(" + i + ")";
        }
        return theString;
    }
}
//new name
