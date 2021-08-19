package Test;

@FunctionalInterface
public interface NewInterface {
    default void implement() {
        System.out.println("some code from default method");
    }

    default void fromInterface() {
        System.out.println("I am default method from interface");
    }

    default void implementOne() {
        System.out.println("some code from another default method");
    }

    void notDefault();

    static String methodStatic() {
        return "I am static method!";
    }

    static void methodStaticTwo() {
        System.out.println("I am another static method from functional interface");
    }
}
