package Test;

// bad
public class AA {
    public boolean isExist() {
        System.out.println("A");
        return true;
    }
}

class TestOperator {
    public static void main(String[] args) {
        AA a = null;
        if (a == null || !a.isExist())
            System.out.println("B");

        a = new AA();
        if (a == null && !a.isExist())
            System.out.println("C");

        if (a.isExist())
            System.out.println("D");
    }
}