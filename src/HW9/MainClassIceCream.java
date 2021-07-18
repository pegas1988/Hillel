package HW9;

import HW9.makers.IceCreamMakerJohny;
import HW9.makers.IceCreamMakerMatilda;
import HW9.makers.IceCreamMakerPatrick;
import HW9.creams.AppleJuice;
import HW9.creams.Cherry;
import HW9.creams.PineApple;
import HW9.creams.BlackBerry;
import HW9.fillings.Fillers;

public class MainClassIceCream {
    public static void main(String[] args) {
        IceCreamMakerJohny iceCreamMakerJohny = new IceCreamMakerJohny(new PineApple(new BlackBerry(new AppleJuice(null))), Fillers.IRISH);
        IceCreamMakerMatilda iceFromMatilda = new IceCreamMakerMatilda(new AppleJuice(new Cherry(null)), Fillers.CHOCOLATE);
        IceCreamMakerPatrick iceFromPatrick = new IceCreamMakerPatrick(new Cherry(new Cherry(new PineApple(null))), Fillers.HUZZELNUT);

        IceCream ice = iceCreamMakerJohny.makeIceCream();
        System.out.println(ice);
        System.out.println("");
        IceCream iceMatilda = iceFromMatilda.makeIceCream();
        System.out.println(iceMatilda);
        System.out.println("");
        IceCream icePatrick = iceFromPatrick.makeIceCream();
        System.out.println(icePatrick);

    }
}
