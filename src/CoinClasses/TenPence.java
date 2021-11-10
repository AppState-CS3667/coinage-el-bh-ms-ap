package CoinClasses;

import MainCoin.*;
import Smelting.CopperNickel2;

public class TenPence extends Coin {
    public TenPence() {
        super(CountryCodes.GBP, CoinNames.TenPence, 0.10, new CopperNickel2());
    }
}
