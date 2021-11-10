package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class TwoEuro extends Coin {
    public TwoEuro() {
        super(CountryCodes.EUR, CoinNames.TwoEuro, 2.00, new UnknownSpecs());
    }
}
