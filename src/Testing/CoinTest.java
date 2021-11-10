package Testing;

import MainCoin.*;
import CoinClasses.*;
import org.junit.Assert;
import org.junit.Test;


/**
 * Testing Class for the Coins and Demoinations
 * @author Ethan Little
 */
public class CoinTest {

    private Coin coin;
	
	@Test
	public void testDimeCAD() {
	    coin = new DimeCAD();
        Assert.assertEquals(coin.getValue(), 0.10);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.CAD);
        Assert.assertEquals(coin.getName(), CoinNames.Dime);
    }


}
