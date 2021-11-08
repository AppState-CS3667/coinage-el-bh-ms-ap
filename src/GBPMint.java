
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
        // TODO Auto-generated method stub
        return null;
    }
    
    public static GBPMint getInstance() {
        if (mintInstance == null) {
            mintInstance = new GBPMint();
        }
        return mintInstance;
    }

}
