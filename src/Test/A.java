package Test;

public class A {
    public static void isStatic(){
        System.out.println("it A");
    }

    public void that() {
        System.out.println("that A");
    }
}

class B extends A {
    public static void isStatic(){
        System.out.println("it B");
    }

    @Override
    public void that(){
        System.out.println("that B");
    }
}

class TestingClass {
    public static void main(String[] args) {
        A a = new A();
        a.that();
        a.isStatic();

        A aa = new B();
        aa.that();
        aa.isStatic();

        B b = new B();
        b.that();
        b.isStatic();
    }
}
