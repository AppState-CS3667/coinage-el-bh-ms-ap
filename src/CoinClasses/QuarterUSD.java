package CoinClasses;

import MainCoin.*;
import Smelting.CopperNickel1;

public class QuarterUSD extends Coin {
    public QuarterUSD() {
        super(CountryCodes.USD, CoinNames.Quarter, 0.25, new CopperNickel1());
    }
}
