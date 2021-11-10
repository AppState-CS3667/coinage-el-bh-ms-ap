package CoinClasses;

import MainCoin.*;
import Smelting.CopperNickel2;

public class FivePence extends Coin {
    public FivePence() {
        super(CountryCodes.GBP, CoinNames.FivePence, 0.05, new CopperNickel2());
    }
}
