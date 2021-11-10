package CoinClasses;

import MainCoin.*;
import Smelting.CopperNickel2;

public class NickelUSD extends Coin {
    public NickelUSD() {
        super(CountryCodes.USD, CoinNames.Nickel, 0.05, new CopperNickel2());
    }
}
