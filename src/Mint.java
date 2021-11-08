/**
 * Mint abstraction for factory pattern implementation.
 * @author Bryan Hill
 *
 */
public abstract class Mint {
    
    /**
     * Abstract method to make and return the desired coin.
     * @param countryCode: The country of origin for Coin.
     * @param denomination: The numeric value of the Coin.
     * @return Coin: The coin to be created.
     */
    public abstract Coin makeCoin(CountryCodes countryCode, double denomination);
    
}