package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class FiveEuroCent extends Coin {
    public FiveEuroCent() {
        super(CountryCodes.EUR, CoinNames.FiveEuroCent, 0.05, new UnknownSpecs());
    }
}
