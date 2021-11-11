package MainCoin;

import CoinClasses.*;

/**
 * Mint implementation for USD.
 * @author Bryan Hill
 *
 */
public class USDMint extends Mint {
    
    private static USDMint mintInstance;

    /**
     * Method to make and return the desired coin.
     * @param countryCode: The country of origin for Coin (USD).
     * @param denomination: The numeric value of the Coin.
     * @return
     */
    public Coin makeCoin(CountryCodes countryCode, double denomination) {
        
        if (denomination == 1.00) return new Dollar();
	if (denomination == 0.50) return new HalfDollar();
	if (denomination == 0.25) return new QuarterUSD();
	if (denomination == 0.10) return new DimeUSD();
	if (denomination == 0.05) return new NickelUSD();
	if (denomination == 0.01) return new Penny();

	return Coin.NULL;
    }    
	
    
    public static USDMint getInstance() {
        if (mintInstance == null) {
            mintInstance = new USDMint();
        }
        return mintInstance;
    }

}
