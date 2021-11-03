/**
 * Coin.java Abstract Super Class for Coins
 * 
 * @author Max Smoot
 * 
 */
public abstract class Coin {

    private CountryCodes countryCode;
    private double value;
    private String name;
    private String smeltingSpec;

    /**
     * Constructor for Coin
     * @param countryCode
     * @param value
     */
    public Coin(CountryCodes countryCode, String name, double value, String smeltingSpec) {
        this.countryCode = countryCode;
        this.value = value;
        this.name = name;
        this.smeltingSpec = smeltingSpec;
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
