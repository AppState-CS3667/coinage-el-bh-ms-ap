package CoinClasses;

import MainCoin.*;
import Smelting.TwoRings;

public class TwoPound extends Coin {
    public TwoPound() {
        super(CountryCodes.GBP, CoinNames.TwoPound, 2.00, new TwoRings());
    }
}
