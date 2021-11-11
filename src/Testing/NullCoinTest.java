package Testing;

import CoinClasses.Dollar;
import MainCoin.*;
import Smelting.UnknownSpecs;
import org.junit.Assert;
import org.junit.Test;


/**
 * Testing Class for the Coins and Demoinations
 * @author Ethan Little
 */
public class NullCoinTest {
	
	@Test
	public void testNullCoin()
	{
		Coin coin = Coin.NULL;
		Assert.assertTrue(coin.getValue() == 0);
		Assert.assertNull(coin.getCountryCode());
		Assert.assertNull(coin.getName());
		Assert.assertNull(coin.getSmeltingSpec());
	}
}
