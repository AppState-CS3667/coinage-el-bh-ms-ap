package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class FiftyCent extends Coin {
    public FiftyCent() {
        super(CountryCodes.CAD, CoinNames.FiftyCent, 0.50, new UnknownSpecs());
    }
}
