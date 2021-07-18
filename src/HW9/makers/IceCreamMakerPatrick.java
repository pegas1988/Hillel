package HW9.makers;

import HW9.CreamsDecorator;
import HW9.IceCream;
import HW9.fillings.Fillers;
import HW9.shops.Shop;

public class IceCreamMakerPatrick extends TheGodOfIceCreamMakers{
    private CreamsDecorator creamsDecorator;
    private Fillers sweats;

    public IceCreamMakerPatrick(CreamsDecorator creamsDecorator, Fillers someSweat) {
        this.creamsDecorator = creamsDecorator;
        this.sweats = someSweat;
    }

    public IceCream makeIceCream() {
        sayMyName();
        System.out.println("If you wish the best ice-cream of this city call Patrick!");
        System.out.println("All the creams will be watered with " + sweats);
        System.out.println("");
        IceCream iceCream = new IceCream();
        creamsDecorator.useTypeOfCream(iceCream);
        return iceCream;
    }

    @Override
    public void sayMyName() {
        System.out.println("         This is \"Beavers&Co\" shop");
    }
}
