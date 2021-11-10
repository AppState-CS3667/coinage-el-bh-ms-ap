package Testing;

import Smelting.*;
import org.junit.Assert;
import org.junit.Test;

public class SmeltingTest
{

	@Test
	public void testCopperNickel1()
	{
		SmeltingBehavior specs = new CopperNickel1();
		Assert.assertEquals(specs.getSmeltingSpecs(), "91.67% Cu 8.33% Ni");
	}
	
	@Test
	public void testCopperNickel2()
	{
		SmeltingBehavior specs = new CopperNickel2();
		Assert.assertEquals(specs.getSmeltingSpecs(), "75% Cu 25% Ni");
	}
	
	@Test
	public void testCopperNickel3()
	{
		SmeltingBehavior specs = new CopperNickel3();
		Assert.assertEquals(specs.getSmeltingSpecs(), "84% Cu 16% Ni");
	}
	
	@Test
	public void testCopperZincMnNickel()
	{
		SmeltingBehavior specs = new CopperZincMnNickel();
		Assert.assertEquals(specs.getSmeltingSpecs(), "88.5% Cu 6% Zi 3.5% Mn 2% Ni");
	}
	
	@Test
	public void testCopperZincNickel()
	{
		SmeltingBehavior specs = new CopperZincNickel();
		Assert.assertEquals(specs.getSmeltingSpecs(), "70% Cu 24.5% Zi 5.5% Ni");
	}
	
	@Test
	public void testCuPlatedSteel()
	{
		SmeltingBehavior specs = new CuPlatedSteel();
		Assert.assertEquals(specs.getSmeltingSpecs(), "Cu plated steel");
	}
	
	@Test
	public void testTwoRings()
	{
		SmeltingBehavior specs = new TwoRings();
		Assert.assertEquals(specs.getSmeltingSpecs(), "Outer ring: 76% Cu 20% Zi 4% Ni\n Inner ring: 75% Cu 25% Ni");
	}
	
	@Test
	public void testUnknownSpecs()
	{
		SmeltingBehavior specs = new UnknownSpecs();
		Assert.assertEquals(specs.getSmeltingSpecs(), "Unknown");
	}


}
