package Test;
// bad
public class X {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            badMethod();
        }
        catch (Exception e) {
            System.out.println("B");
        }
        catch (Throwable e) {
            System.out.println("C");
        }
        finally {
            System.out.println("D");
        }
        System.out.println("E");
    }

    public static void badMethod() {
        throw new Error();
    }
}
