package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class TwentyEuroCent extends Coin {
    public TwentyEuroCent() {
        super(CountryCodes.EUR, CoinNames.TwentyEuroCent, 0.20, new UnknownSpecs());
    }
}
