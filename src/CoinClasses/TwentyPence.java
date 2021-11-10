package CoinClasses;

import MainCoin.*;
import Smelting.CopperNickel3;

public class TwentyPence extends Coin {
    public TwentyPence() {
        super(CountryCodes.GBP, CoinNames.TwentyPence, 0.20, new CopperNickel3());
    }
}
