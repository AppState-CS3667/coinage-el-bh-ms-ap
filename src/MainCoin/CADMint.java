package MainCoin;

import CoinClasses.*;

/**
 * Mint implementation for CAD.
 * @author Bryan Hill
 *
 */
public class CADMint extends Mint {
    
    private static CADMint mintInstance;

    /**
     * Method to make and return the desired coin.
     * @param countryCode: The country of origin for Coin (CAD).
     * @param denomination: The numeric value of the Coin.
     * @return
     */
    public Coin makeCoin(CountryCodes countryCode, double denomination) {

        if (denomination == 2.00) return new Toonie();
        if (denomination == 1.00) return new Loonie();
	if (denomination == 0.50) return new FiftyCent();
	if (denomination == 0.25) return new QuarterCAD();
	if (denomination == 0.10) return new DimeCAD();
	if (denomination == 0.05) return new NickelCAD();

	//TODO: Change to NullCoin.
	return null;
    }
    
    public static CADMint getInstance() {
        if (mintInstance == null) {
            mintInstance = new CADMint();
        }
        return mintInstance;
    }

}
