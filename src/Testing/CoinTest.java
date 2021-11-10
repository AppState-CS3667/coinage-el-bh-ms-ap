package Testing;

import MainCoin.*;
import CoinClasses.*;
import Smelting.*;
import org.junit.Assert;
import org.junit.Test;


/**
 * Testing Class for the Coins and Demoinations
 * @author Ethan Little
 */
public class CoinTest {
	
	private Coin coin;
	
	private final SmeltingBehavior copperNickel1 = new CopperNickel1();
	private final SmeltingBehavior copperNickel2 = new CopperNickel2();
	private final SmeltingBehavior copperNickel3 = new CopperNickel3();
	private final SmeltingBehavior copperZincMnNickel = new CopperZincMnNickel();
	private final SmeltingBehavior copperZincNickel = new CopperZincNickel();
	private final SmeltingBehavior copperZinc = new CopperZinc();
	private final SmeltingBehavior unknownSpecs = new UnknownSpecs();
	private final SmeltingBehavior twoRings = new TwoRings();
	private final SmeltingBehavior cuPlatedSteel = new CuPlatedSteel();
	
	/*
		USD Coins
	*/
	@Test
	public void testDollar() {
	    coin = new Dollar();
        Assert.assertTrue(coin.getValue() == 1.00);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.USD);
        Assert.assertEquals(coin.getName(), CoinNames.Dollar);
        Assert.assertEquals(coin.getSmeltingSpec(), copperZincMnNickel.getSmeltingSpecs());
    }
	
	@Test
	public void testHalfDollar() {
	    coin = new HalfDollar();
        Assert.assertTrue(coin.getValue() == 0.50);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.USD);
        Assert.assertEquals(coin.getName(), CoinNames.HalfDollar);
        Assert.assertEquals(coin.getSmeltingSpec(), copperNickel1.getSmeltingSpecs());
    }
	
	@Test
	public void testQuarterUSD() {
	    coin = new QuarterUSD();
        Assert.assertTrue(coin.getValue() == 0.25);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.USD);
        Assert.assertEquals(coin.getName(), CoinNames.Quarter);
        Assert.assertEquals(coin.getSmeltingSpec(), copperNickel1.getSmeltingSpecs());
    }
	
	@Test
	public void testDimeUSD() {
	    coin = new DimeUSD();
        Assert.assertTrue(coin.getValue() == 0.10);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.USD);
        Assert.assertEquals(coin.getName(), CoinNames.Dime);
        Assert.assertEquals(coin.getSmeltingSpec(), copperNickel1.getSmeltingSpecs());
    }
	
	@Test
	public void testNickelUSD() {
	    coin = new NickelUSD();
        Assert.assertTrue(coin.getValue() == 0.05);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.USD);
        Assert.assertEquals(coin.getName(), CoinNames.Nickel);
        Assert.assertEquals(coin.getSmeltingSpec(), copperNickel2.getSmeltingSpecs());
    }
	
	@Test
	public void testPenny() {
	    coin = new Penny();
        Assert.assertTrue(coin.getValue() == 0.01);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.USD);
        Assert.assertEquals(coin.getName(), CoinNames.Penny);
        Assert.assertEquals(coin.getSmeltingSpec(), copperZinc.getSmeltingSpecs());
    }
	
	
	/*
		CAD Coins
	*/
}