package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class TenEuroCent extends Coin {
    public TenEuroCent() {
        super(CountryCodes.EUR, CoinNames.TenEuroCent, 0.10, new UnknownSpecs());
    }
}
