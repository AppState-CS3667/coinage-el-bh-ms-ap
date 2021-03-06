package MainCoin;

import Smelting.SmeltingBehavior;
/**
 * Coin.java Abstract Super Class for Coins Uses Enums for name and countryCode
 * for compile time error catching.
 * 
 * @author Max Smoot
 * 
 */
public abstract class Coin {

    private CountryCodes countryCode;
    private double value;
    private CoinNames name;
    private SmeltingBehavior smeltingSpec;
    public static Coin NULL = new NullCoin(null, null, 0, null); //pass null or 0 since it is a NullCoin

    /**
     * Constructor for Coin
     * 
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
     * 
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * Getter for the country code.
     * 
     * @return countryCode
     */
    public CountryCodes getCountryCode() {
        return countryCode;
    }

    /**
     * Geter for name
     * 
     * @return name
     */
    public CoinNames getName() {
        return name;
    }

    /**
     * Getter for smeltingSpec
     * 
     * @return smeltingSpec
     */
    public String getSmeltingSpec() {
        return smeltingSpec.getSmeltingSpecs();
    }

    public String toString() {
        return "(" + getName().toString() + ") " + getValue();
    }
    

    private static class NullCoin extends Coin {

        public NullCoin(CountryCodes countryCode, CoinNames name, double value, SmeltingBehavior smeltingSpec) {
            super(countryCode, name, value, smeltingSpec);
        }
        @Override
        public String toString() {
            return "";
        }

        @Override
        public double getValue() {
            return 0;
        }

        @Override
        public CountryCodes getCountryCode() {
            return null;
        }

        @Override
        public CoinNames getName() {
            return null;
        }

        @Override
        public String getSmeltingSpec() {
            return null;
        }

    }
}
