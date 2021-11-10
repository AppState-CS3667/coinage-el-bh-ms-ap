package CoinClasses;

import MainCoin.*;
import Smelting.CopperNickel2;

public class FivePound extends Coin {
    public FivePound() {
        super(CountryCodes.GBP, CoinNames.FivePound, 5.00, new CopperNickel2());
    }
}
