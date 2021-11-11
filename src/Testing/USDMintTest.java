package Testing;

import MainCoin.*;
import CoinClasses.*;
import Smelting.*;
import org.junit.Assert;
import org.junit.Test;


/**
 * Testing Class USDMint
 * @author Bryan Hill
 */
public class USDMintTest {
	
	
	
	@Test
	public void testDollarCreation() {
		Coin coin =  USDMint.getInstance().mintCoin(1.00);
		Dollar real = new Dollar();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testHalfDollarCreation() {
		Coin coin =  USDMint.getInstance().mintCoin(0.50);
		HalfDollar real = new HalfDollar();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testQuarterCreation() {
		Coin coin =  USDMint.getInstance().mintCoin(0.25);
		QuarterUSD real = new QuarterUSD();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testDimeCreation() {
		Coin coin =  USDMint.getInstance().mintCoin(0.10);
		DimeUSD real = new DimeUSD();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testNickelCreation() {
		Coin coin =  USDMint.getInstance().mintCoin(0.05);
		NickelUSD real = new NickelUSD();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testPennyCreation() {
		Coin coin =  USDMint.getInstance().mintCoin(0.01);
		Penny real = new Penny();
		Assert.assertEquals(real.toString(), coin.toString());	
	}





}