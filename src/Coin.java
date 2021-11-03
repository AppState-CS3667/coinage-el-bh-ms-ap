/**
 * Coin.java Abstract Super Class for Coins
 * 
 * @author Max Smoot
 * 
 */
public abstract class Coin {

    private CountryCodes countryCode;
    private double value;

    /**
     * Constructor for Coin
     * @param countryCode
     * @param value
     */
    public Coin(CountryCodes countryCode, double value) {
        this.countryCode = countryCode;
        this.value = value;
    }

    /**
     * public getter for the coin's value.
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * Public Getter for the country code.
     * @return countryCode
     */
    public CountryCodes getCountryCode() {
        return countryCode;
    }

}
