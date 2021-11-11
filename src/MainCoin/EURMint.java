package MainCoin;

import CoinClasses.*;

/**
 * Mint implementation for EUR.
 * @author Bryan Hill
 *
 */
public class EURMint extends Mint {
    
    private static EURMint mintInstance;

    /**
     * Method to make and return the desired coin.
     * @param countryCode: The country of origin for Coin (EUR).
     * @param denomination: The numeric value of the Coin.
     * @return
     */
    public Coin makeCoin(CountryCodes countryCode, double denomination) {

	if (denomination == 2.00) return new TwoEuro();
        if (denomination == 1.00) return new OneEuro();
	if (denomination == 0.50) return new FiftyEuroCent();
	if (denomination == 0.25) return new TwentyEuroCent();
	if (denomination == 0.10) return new TenEuroCent();
	if (denomination == 0.05) return new FiveEuroCent();
	if (denomination == 0.02) return new TwoEuroCent();
	if (denomination == 0.01) return new EuroCent();

	//TODO: Change to NullCoin.
	return null;
    }
    
    public static EURMint getInstance() {
        if (mintInstance == null) {
            mintInstance = new EURMint();
        }
        return mintInstance;
    }

}
