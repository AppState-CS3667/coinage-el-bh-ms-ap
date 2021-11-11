package MainCoin;

import java.util.Random;

/**
 * Mint abstraction for factory pattern implementation.
 * 
 * @author Bryan Hill
 *
 */
public abstract class Mint {

    private Coin coin;
    private static Random rand = new Random();

    /**
     * Each Mint implements this to return correct coin type depending on the Country
     * @param denomination
     * @return
     */
    protected abstract Coin mintCoin(double denomination);

    /**
     * returns False 1/odds of the time
     * @param odds
     * @return
     */
    protected boolean failure(int odds) {
        return Math.floor(rand.nextDouble() * odds) == 1;

    }

    /**
     * Public makeCoin method.
     * Uses template design pattern to do smelt() inspect() smooth() polish()
     * utilizes each Mints mintCoin() method to actually get the con object
     * 
     * @param denomination
     * @return coin on success or Coin.NULL on failure
     */
    public Coin makeCoin(double denomination) {
        coin = mintCoin(denomination);
        if (coin == Coin.NULL) {
            System.out.println("Failed to manufature coin. Invalid denomination.");
            return coin;
        }
        smelt();
        if (!inspect() || !smooth() || !polish()) {
            System.out.println("Failed to manufature coin");
            return Coin.NULL;
        }
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
    public boolean polish() {
        // todo
        System.out.print("Polishing " + coin.getName());
        if (failure(1000)) {
            System.out.println(" ...failed.");
            return false;
        }
        System.out.println(" ...completed");
        return true;
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
    public boolean inspect() {
        // todo
        System.out.print("Inspecting " + coin.getName());
        if (failure(12)) {
            System.out.println(" ...failed.");
            return false;
        }
        System.out.println(" ...completed");
        return true;
    }

    public boolean smooth() {
        System.out.print("Smoothing " + coin.getName());
        if (failure(1000)) {
            System.out.println(" ...failed.");
            return false;
        }
        System.out.println(" ...completed");
        return true;

    }

}