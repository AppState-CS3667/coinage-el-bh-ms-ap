package CoinClasses;

import MainCoin.*;
import Smelting.CopperNickel2;

public class FiftyPence extends Coin {
    public FiftyPence() {
        super(CountryCodes.GBP, CoinNames.FiftyPence, 0.50, new CopperNickel2());
    }
}
