package Test;
// bad
public class InitTest {
    int intVal;
    double doubleVal;
    boolean aBoolean;
}

class Testing {
    public static void main(String[] args) {
        InitTest a = new InitTest();
        System.out.println(a.doubleVal);
        System.out.println(a.intVal);
        System.out.println(a.aBoolean);

    }
}
