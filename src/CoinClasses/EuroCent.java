package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class EuroCent extends Coin {
    public EuroCent() {
        super(CountryCodes.EUR, CoinNames.EuroCent, 0.01, new UnknownSpecs());
    }
}
