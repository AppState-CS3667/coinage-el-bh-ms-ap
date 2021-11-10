package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class FiftyEuroCent extends Coin {
    public FiftyEuroCent() {
        super(CountryCodes.EUR, CoinNames.FiftyEuroCent, 0.50, new UnknownSpecs());
    }
}
