package MainCoin;

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
        // TODO Auto-generated method stub
        return null;
    }
    
    public static USDMint getInstance() {
        if (mintInstance == null) {
            mintInstance = new USDMint();
        }
        return mintInstance;
    }

}
