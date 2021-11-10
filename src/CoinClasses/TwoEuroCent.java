package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class TwoEuroCent extends Coin {
    public TwoEuroCent() {
        super(CountryCodes.EUR, CoinNames.TwoEuroCent, 0.02, new UnknownSpecs());
    }
}
