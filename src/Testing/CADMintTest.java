package Testing;

import MainCoin.*;
import CoinClasses.*;
import Smelting.*;
import org.junit.Assert;
import org.junit.Test;


/**
 * Testing Class CADMint
 * @author Bryan Hill
 */
public class CADMintTest {
	
	
	
	@Test
	public void testToonieCreation() {
		Coin coin =  CADMint.getInstance().mintCoin(2.00);
		Toonie real = new Toonie();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testLoonieCreation() {
		Coin coin =  CADMint.getInstance().mintCoin(1.00);
		Loonie real = new Loonie();
		Assert.assertEquals(real.toString(), coin.toString());	
	}


	@Test
	public void testFiftyCentCreation() {
		Coin coin =  CADMint.getInstance().mintCoin(0.50);
		FiftyCent real = new FiftyCent();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testQuarterCreation() {
		Coin coin =  CADMint.getInstance().mintCoin(0.25);
		QuarterCAD real = new QuarterCAD();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testDimeCreation() {
		Coin coin =  CADMint.getInstance().mintCoin(0.10);
		DimeCAD real = new DimeCAD();
		Assert.assertEquals(real.toString(), coin.toString());	
	}

	@Test
	public void testNickelCreation() {
		Coin coin =  CADMint.getInstance().mintCoin(0.05);
		NickelCAD real = new NickelCAD();
		Assert.assertEquals(real.toString(), coin.toString());	
	}
}