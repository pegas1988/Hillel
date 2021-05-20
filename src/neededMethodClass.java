 class neededMethodClass {

    private static String theString = "(1)";

    private static String theMethod() {
        for (int i = 2; i <= 30; i++) {
            theString = theString + "(" + i + ")";
        }
        return theString;
    }
}
// new string
 // change the name
