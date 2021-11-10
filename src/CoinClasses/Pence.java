package CoinClasses;

import MainCoin.*;
import Smelting.CuPlatedSteel;

public class Pence extends Coin {
    public Pence() {
        super(CountryCodes.GBP, CoinNames.Pence, 0.01, new CuPlatedSteel());
    }
}
