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
	@Test
	public void testToonie() {
	    coin = new Toonie();
        Assert.assertTrue(coin.getValue() == 2.00);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.CAD);
        Assert.assertEquals(coin.getName(), CoinNames.Toonie);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testLoonie() {
	    coin = new Loonie();
        Assert.assertTrue(coin.getValue() == 1.00);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.CAD);
        Assert.assertEquals(coin.getName(), CoinNames.Loonie);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testFiftyCent() {
	    coin = new FiftyCent();
        Assert.assertTrue(coin.getValue() == 0.50);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.CAD);
        Assert.assertEquals(coin.getName(), CoinNames.FiftyCent);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testQuarterCAD() {
	    coin = new QuarterCAD();
        Assert.assertTrue(coin.getValue() == 0.25);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.CAD);
        Assert.assertEquals(coin.getName(), CoinNames.CadQuarter);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testDimeCAD() {
	    coin = new DimeCAD();
        Assert.assertTrue(coin.getValue() == 0.10);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.CAD);
        Assert.assertEquals(coin.getName(), CoinNames.CadDime);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testNickelCAD() {
	    coin = new NickelCAD();
        Assert.assertTrue(coin.getValue() == 0.05);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.CAD);
        Assert.assertEquals(coin.getName(), CoinNames.CadNickel);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	/*
		EUR Coins
	*/
	@Test
	public void testTwoEuro() {
	    coin = new TwoEuro();
        Assert.assertTrue(coin.getValue() == 2.00);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.EUR);
        Assert.assertEquals(coin.getName(), CoinNames.TwoEuro);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testOneEuro() {
	    coin = new OneEuro();
        Assert.assertTrue(coin.getValue() == 1.00);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.EUR);
        Assert.assertEquals(coin.getName(), CoinNames.OneEuro);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testFiftyEuroCent() {
	    coin = new FiftyEuroCent();
        Assert.assertTrue(coin.getValue() == 0.50);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.EUR);
        Assert.assertEquals(coin.getName(), CoinNames.FiftyEuroCent);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testTwentyEuroCent() {
	    coin = new TwentyEuroCent();
        Assert.assertTrue(coin.getValue() == 0.25);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.EUR);
        Assert.assertEquals(coin.getName(), CoinNames.TwentyEuroCent);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testTenEuroCent() {
	    coin = new TenEuroCent();
        Assert.assertTrue(coin.getValue() == 0.10);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.EUR);
        Assert.assertEquals(coin.getName(), CoinNames.TenEuroCent);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testFiveEuroCent() {
	    coin = new FiveEuroCent();
        Assert.assertTrue(coin.getValue() == 0.05);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.EUR);
        Assert.assertEquals(coin.getName(), CoinNames.FiveEuroCent);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testTwoEuroCent() {
	    coin = new TwoEuroCent();
        Assert.assertTrue(coin.getValue() == 0.02);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.EUR);
        Assert.assertEquals(coin.getName(), CoinNames.TwoEuroCent);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
	
	@Test
	public void testEuroCent() {
	    coin = new EuroCent();
        Assert.assertTrue(coin.getValue() == 0.01);
        Assert.assertEquals(coin.getCountryCode(), CountryCodes.EUR);
        Assert.assertEquals(coin.getName(), CoinNames.EuroCent);
        Assert.assertEquals(coin.getSmeltingSpec(), unknownSpecs.getSmeltingSpecs());
    }
}