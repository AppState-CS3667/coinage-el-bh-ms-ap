package MainCoin;

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
        // TODO Auto-generated method stub
        return null;
    }
    
    public static CADMint getInstance() {
        if (mintInstance == null) {
            mintInstance = new CADMint();
        }
        return mintInstance;
    }

}
