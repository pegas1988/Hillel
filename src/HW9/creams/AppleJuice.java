package HW9.creams;

import HW9.CreamsDecorator;
import HW9.IceCream;

public class AppleJuice implements CreamsDecorator {
    CreamsDecorator iceCream;

    public AppleJuice(CreamsDecorator iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void useTypeOfCream(IceCream cream) {
        System.out.println("Applejuice cream was added");
        if (iceCream != null)
            iceCream.useTypeOfCream(cream);
    }
}
