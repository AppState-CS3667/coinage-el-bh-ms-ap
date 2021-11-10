package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class OneEuro extends Coin {
    public OneEuro() {
        super(CountryCodes.EUR, CoinNames.OneEuro, 1.00, new UnknownSpecs());
    }
}
