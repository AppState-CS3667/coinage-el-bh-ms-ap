/**
 * Coin.java Abstract Super Class for Coins
 * Uses Enums for name and countryCode for compile time error catching.
 * @author Max Smoot
 * 
 */
public abstract class Coin {

    private CountryCodes countryCode;
    private double value;
    private CoinNames name;
    private String smeltingSpec;

    /**
     * Constructor for Coin
     * @param countryCode
     * @param value
     */
    public Coin(CountryCodes countryCode, CoinNames name, double value, String smeltingSpec) {
        this.countryCode = countryCode;
        this.value = value;
        this.name = name;
        this.smeltingSpec = smeltingSpec;
    }

    /**
     * Getter for the coin's value.
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * Getter for the country code.
     * @return countryCode
     */
    public CountryCodes getCountryCode() {
        return countryCode;
    }

    /**
     * Geter for name
     * @return name 
     */
    public CoinNames getName() {
        return name;
    }

    /**
     * Getter for smeltingSpec
     * @return smeltingSpec
     */
    public String getSmeltingSpec() {
        return smeltingSpec;
    }

}
