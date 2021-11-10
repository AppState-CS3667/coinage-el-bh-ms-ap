package CoinClasses;

import MainCoin.*;
import Smelting.CopperZinc;

public class Penny extends Coin {
    public Penny() {
        super(CountryCodes.USD, CoinNames.Penny, 0.01, new CopperZinc());
    }
}
