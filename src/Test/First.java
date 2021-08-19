package Test;

import java.util.List;

public class First extends Abs implements Some{
    public void first(){
        System.out.println("first");
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    String name = NewInterface.methodStatic();
    Second second = new Second();
    public Some oneMore = second;

    @Override
    public void fromInterface() {
        System.out.println("from interface first");
        System.out.println("we have only interface methods");
    }

    @Override
    public void methodAbstract() {
        System.out.println("method from abstract");
    }

    @Override
    void main() {
        super.main();
    }

    @Override
    void addTwo(List<String> list) {
        super.addTwo(list);
    }

    @Override
    public void oneMoreFromAbstract() {
        super.oneMoreFromAbstract();
        System.out.println("hey");
    }
}
