package Test;

public class Superclass {
    public void call(){
        System.out.println("from superclass");
    }
    public void callParent(){
        super.hashCode();
    }
}
class SubClass extends Superclass{
    @Override
    public void call(){
        System.out.println("call from subclass");
    }
    @Override
    public void callParent(){
        super.call();
    }
}

class SuperSubClassTesting {
    public static void main(String[] args) {
        SubClass a = (SubClass) new Superclass();

        a.call();
        a.callParent();

        Superclass b = new SubClass();
        b.call();
        b.callParent();

    }
}
