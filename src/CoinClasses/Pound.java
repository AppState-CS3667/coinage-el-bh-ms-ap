package CoinClasses;

import MainCoin.*;
import Smelting.CopperZincNickel;

public class Pound extends Coin {
    public Pound() {
        super(CountryCodes.GBP, CoinNames.Pound, 1.00, new CopperZincNickel());
    }
}
