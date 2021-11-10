package CoinClasses;

import MainCoin.*;
import Smelting.CopperNickel1;

public class HalfDollar extends Coin {
    public HalfDollar() {
        super(CountryCodes.USD, CoinNames.HalfDollar, 0.50, new CopperNickel1());
    }
}
