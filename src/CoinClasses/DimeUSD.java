package CoinClasses;

import MainCoin.*;
import Smelting.CopperNickel1;

public class DimeUSD extends Coin {
    public DimeUSD() {
        super(CountryCodes.USD, CoinNames.Dime, 0.10, new CopperNickel1());
    }
}
