package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class QuarterCAD extends Coin {
    public QuarterCAD() {
        super(CountryCodes.CAD, CoinNames.CadQuarter, 0.25, new UnknownSpecs());
    }
}
