package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class DimeCAD extends Coin {
    public DimeCAD() {
        super(CountryCodes.CAD, CoinNames.Dime, 0.10, new UnknownSpecs());
    }
}
