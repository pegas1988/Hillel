package HW9.creams;

import HW9.CreamsDecorator;
import HW9.IceCream;

public class Banan implements CreamsDecorator {

    CreamsDecorator iceCream;

    public Banan(CreamsDecorator iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void useTypeOfCream(IceCream cream) {
        System.out.println("Banan cream was added");
        if (iceCream != null)
            iceCream.useTypeOfCream(cream);
    }
}
