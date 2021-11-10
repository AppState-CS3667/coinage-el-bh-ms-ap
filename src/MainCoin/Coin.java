package MainCoin;

import Smelting.SmeltingBehavior;
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
    private SmeltingBehavior smeltingSpec;

    /**
     * Constructor for Coin
     * @param countryCode
     * @param value
     */
    public Coin(CountryCodes countryCode, CoinNames name, double value, SmeltingBehavior smeltingSpec) {
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
        return smeltingSpec.getSmeltingSpecs();
    }

    /**
     * Calls smelt on the smelt object
     * @todo
     */
    public void smelt() {
        //todo
    }

    /**
     * Polish Method
     * @todo
     */
    public void polish() {
        //todo
    }

    /**
     * Imprint method
     * @todo
     */
    public void imprint() {
        //todo
    }
    
    /**
     * Inspect method
     * @todo
     */
    public void inspect() {
        //todo
    }

}
