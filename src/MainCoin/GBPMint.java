package MainCoin;

import CoinClasses.*;

/**
 * Mint implementation for GBP.
 * @author Bryan Hill
 *
 */
public class GBPMint extends Mint {
    
    private static GBPMint mintInstance;

    /**
     * Method to make and return the desired coin.
     * @param countryCode: The country of origin for Coin (GBP).
     * @param denomination: The numeric value of the Coin.
     * @return
     */
    public Coin makeCoin(CountryCodes countryCode, double denomination) {
    
	if (denomination == 5.00) return new FivePound();
	if (denomination == 2.00) return new TwoPound();
        if (denomination == 1.00) return new Pound();
	if (denomination == 0.50) return new FiftyPence();
	if (denomination == 0.20) return new TwentyPence();
	if (denomination == 0.10) return new TenPence();
	if (denomination == 0.05) return new FivePence();
	if (denomination == 0.02) return new TwoPence();
	if (denomination == 0.01) return new Pence();

	return Coin.NULL;

    }
    
    public static GBPMint getInstance() {
        if (mintInstance == null) {
            mintInstance = new GBPMint();
        }
        return mintInstance;
    }

}
