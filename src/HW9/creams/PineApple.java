package HW9.creams;

import HW9.CreamsDecorator;
import HW9.IceCream;

public class PineApple implements CreamsDecorator {
    CreamsDecorator iceCream;

    public PineApple(CreamsDecorator iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void useTypeOfCream(IceCream cream) {
        System.out.println("Pineapple cream was added");
        if (iceCream != null)
            iceCream.useTypeOfCream(cream);
    }
}
