package Testing;

import MainCoin.*;
import CoinClasses.*;
import Smelting.*;
import org.junit.Assert;
import org.junit.Test;


/**
 * Testing Class EURMint
 * @author Bryan Hill
 */
public class EURMintTest {
	
	
	
	@Test
	public void testTwoEuroCreation() {
		Coin coin =  EURMint.getInstance().mintCoin(2.00);
		TwoEuro real = new TwoEuro();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testOneEuroCreation() {
		Coin coin =  EURMint.getInstance().mintCoin(1.00);
		OneEuro real = new OneEuro();
		Assert.assertEquals(real.toString(), coin.toString());	
	}


	@Test
	public void testFiftyEuroCentCreation() {
		Coin coin =  EURMint.getInstance().mintCoin(0.50);
		FiftyEuroCent real = new FiftyEuroCent();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testTwentyEuroCentCreation() {
		Coin coin =  EURMint.getInstance().mintCoin(0.25);
		TwentyEuroCent real = new TwentyEuroCent();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testTenEuroCentCreation() {
		Coin coin =  EURMint.getInstance().mintCoin(0.10);
		TenEuroCent real = new TenEuroCent();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testFiveEuroCentCreation() {
		Coin coin =  EURMint.getInstance().mintCoin(0.05);
		FiveEuroCent real = new FiveEuroCent();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testTwoEuroCentCreation() {
		Coin coin =  EURMint.getInstance().mintCoin(0.02);
		TwoEuroCent real = new TwoEuroCent();
		Assert.assertEquals(real.toString(), coin.toString());	
	}


	@Test
	public void testEuroCentCreation() {
		Coin coin =  EURMint.getInstance().mintCoin(0.01);
		EuroCent real = new EuroCent();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

}