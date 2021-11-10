package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class Loonie extends Coin {
    public Loonie() {
        super(CountryCodes.CAD, CoinNames.Loonie, 1.00, new UnknownSpecs());
    }
}
