
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
        // TODO Auto-generated method stub
        return null;
    }
    
    public static EURMint getInstance() {
        if (mintInstance == null) {
            mintInstance = new EURMint();
        }
        return mintInstance;
    }

}
