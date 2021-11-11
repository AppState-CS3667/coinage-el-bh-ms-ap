package MainCoin;
//import MainCoin.*;
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
    private String smeltingSpec; //todo
    private static Coin NULL = new NullCoin(countryCode, name, value, smeltingSpec);

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

    private static class NullCoin extends Coin {
        
        public NullCoin(CountryCodes countryCode, CoinNames name, double value, String smeltingSpec) {
            super(countryCode, name, value, smeltingSpec);
        }
          
        @Override
            public double getValue() {}

        @Override
            public CountryCodes getCountryCode() {}

        @Override
            public CoinNames getName() {}

        @Override
            public String getSmeltingSpec() {}

        @Override
            public void smelt() {}

        @Override
            public void polish() {}

        @Override
            public void imprint() {}

        @Override
            public void inspect() {} 
    }
}

