package Test;

public class Second implements Some, NewInterface {
    @Override
    public void fromInterface() {

    }

    @Override
    public void notDefault() {

    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public void second() {
        System.out.println("second");
    }
}
