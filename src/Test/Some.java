package Test;

@FunctionalInterface
public interface Some<T> {
    default void fromInterface() {
        System.out.println("I am default method from interface");
    }

    int compare(T o1, T o2);

    boolean equals(Object obj);

    default void newMethod() {
        System.out.println("how many default method can I create?");
    }
}
