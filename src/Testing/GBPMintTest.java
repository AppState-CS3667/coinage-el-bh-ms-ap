package Testing;

import MainCoin.*;
import CoinClasses.*;
import Smelting.*;
import org.junit.Assert;
import org.junit.Test;


/**
 * Testing Class GBPMint
 * @author Bryan Hill
 */
public class GBPMintTest {
	
	
	@Test
	public void testFivePoundCreation() {
		Coin coin =  GBPMint.getInstance().mintCoin(5.00);
		FivePound real = new FivePound();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testTwoPoundCreation() {
		Coin coin =  GBPMint.getInstance().mintCoin(2.00);
		TwoPound real = new TwoPound();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testPoundCreation() {
		Coin coin =  GBPMint.getInstance().mintCoin(1.00);
		Pound real = new Pound();
		Assert.assertEquals(real.toString(), coin.toString());	
	}


	@Test
	public void testFiftyPenceCreation() {
		Coin coin =  GBPMint.getInstance().mintCoin(0.50);
		FiftyPence real = new FiftyPence();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testTwentyPenceCreation() {
		Coin coin =  GBPMint.getInstance().mintCoin(0.20);
		TwentyPence real = new TwentyPence();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testTenPenceCreation() {
		Coin coin =  GBPMint.getInstance().mintCoin(0.10);
		TenPence real = new TenPence();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testFivePenceCreation() {
		Coin coin =  GBPMint.getInstance().mintCoin(0.05);
		FivePence real = new FivePence();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testTwoPenceCreation() {
		Coin coin =  GBPMint.getInstance().mintCoin(0.02);
		TwoPence real = new TwoPence();
		Assert.assertEquals(real.toString(), coin.toString());	
	}


	@Test
	public void testPenceCreation() {
		Coin coin =  GBPMint.getInstance().mintCoin(0.01);
		Pence real = new Pence();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

}