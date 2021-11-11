package MainCoin;
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
    private Coin coin;

    protected abstract Coin mintCoin(double denomination);

    public Coin makeCoin(double denomination) {
        coin = mintCoin(denomination);
        smelt();
        inspect();
        smooth();
        polish();
        return coin;
    }
    /**
     * Calls smelt on the smelt object
     * 
     * @todo
     */
    public void smelt() {
        // todo
        System.out.println("Smelting " + coin.getName() + "...completed");
        System.out.println(coin.getSmeltingSpec());
    }

    /**
     * Polish Method
     * 
     * @todo
     */
    public void polish() {
        // todo
        System.out.println("Polishing " + coin.getName() + "... completed");
    }

    /**
     * Imprint method
     * 
     * @todo
     */
    public void imprint() {
        // todo
        System.out.println("Imprinting " + coin.getName() + " ...completed.");
    }

    /**
     * Inspect method
     * 
     * @todo
     */
    public void inspect() {
        // todo
        System.out.println("Inspecting " + coin.getName() + " ...completed.");
    }

    public void smooth() {
        System.out.println("Smoothing " + coin.getName() + " ...completed.");
    }
    
}