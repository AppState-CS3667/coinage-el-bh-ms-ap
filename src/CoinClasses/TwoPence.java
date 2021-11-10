package CoinClasses;

import MainCoin.*;
import Smelting.CuPlatedSteel;

public class TwoPence extends Coin {
    public TwoPence() {
        super(CountryCodes.GBP, CoinNames.TwoPence, 0.02, new CuPlatedSteel());
    }
}
