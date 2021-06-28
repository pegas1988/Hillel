package HW9.creams;

import HW9.CreamsDecorator;
import HW9.IceCream;

public class BlackBerry implements CreamsDecorator {
    CreamsDecorator iceCream;

    public BlackBerry(CreamsDecorator iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void useTypeOfCream(IceCream cream) {
        System.out.println("Blackberry cream was added");
        if (iceCream != null)
            iceCream.useTypeOfCream(cream);
    }
}
