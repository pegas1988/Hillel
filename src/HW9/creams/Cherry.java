package HW9.creams;

import HW9.CreamsDecorator;
import HW9.IceCream;

public class Cherry implements CreamsDecorator {
    CreamsDecorator iceCream;

    public Cherry(CreamsDecorator iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void useTypeOfCream(IceCream cream) {
        System.out.println("Cherry cream was added");
        if (iceCream != null)
            iceCream.useTypeOfCream(cream);
    }
}
