package Test;

import java.util.ArrayList;
import java.util.List;

public abstract class Abs {
    private void fromAbstract() {
        System.out.println("private from abstract");
    }

    public void oneMoreFromAbstract(){
        System.out.println("i am not abstract method");
    }

    public abstract void methodAbstract();
    void main() {
        List<String> list = new ArrayList<>();
        list.add("1");
        addTwo(list);
        System.out.println(list);
    }

    void addTwo(List<String> list) {
        list.add("2");
    }
}
