package CoinClasses;

import MainCoin.*;
import Smelting.CopperZincMnNickel;

public class Dollar extends Coin {
    public Dollar() {
        super(CountryCodes.USD, CoinNames.Dollar, 1.00, new CopperZincMnNickel());
    }
}
