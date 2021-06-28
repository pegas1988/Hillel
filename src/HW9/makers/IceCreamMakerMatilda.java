package HW9.makers;

import HW9.CreamsDecorator;
import HW9.IceCream;
import HW9.fillings.fillings;
import HW9.shops.Shop;

public class IceCreamMakerMatilda implements Shop {
    private CreamsDecorator creamsDecorator;
    private fillings sweats;

    public IceCreamMakerMatilda(CreamsDecorator creamsDecorator, fillings someSweat) {
        this.creamsDecorator = creamsDecorator;
        this.sweats = someSweat;
    }

    public IceCream makeIceCream() {
        sayMyName();
        System.out.println("Hey There! Catch an ice-cream from Matilda!");
        System.out.println("All the creams will be watered with " + sweats);
        System.out.println("");
        IceCream iceCream = new IceCream();
        creamsDecorator.useTypeOfCream(iceCream);
        return iceCream;
    }

    @Override
    public void sayMyName() {
        System.out.println("         You are in \"Three Bears\" shop!");
    }
}
