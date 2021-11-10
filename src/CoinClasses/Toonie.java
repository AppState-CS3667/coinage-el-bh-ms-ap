package CoinClasses;

import MainCoin.*;
import Smelting.UnknownSpecs;

public class Toonie extends Coin {
    public Toonie() {
        super(CountryCodes.CAD, CoinNames.Toonie, 2.00, new UnknownSpecs());
    }
}
