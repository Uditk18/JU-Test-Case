package co.in.capgemini.calculator;
import org.junit.Test;

import co.in.capgemini.math.Maths;


import org.junit.Assert;


public class SubtractionTest {

	@Test
	public void SubtractionTestBothEqual() {
		Maths math=new Maths();
		int ans=math.sub(2,2);
		Assert.assertEquals(0, ans,0);

	}
	@Test
	public void SubtractionTestBothNegative() {
		Maths math=new Maths();
		int ans=math.sub(-2,-2);
		Assert.assertEquals(0, ans,0);

	}
	@Test
	public void SubtractionTestGreaterPositiveSmallPositive() {
		Maths math=new Maths();
		int ans=math.sub(20,2);
		Assert.assertEquals(18, ans,0);

	}
	@Test
	public void SubtractionTestSmallPositiveGreaterPositive() {
		Maths math=new Maths();
		int ans=math.sub(18,20);
		Assert.assertEquals(-2, ans,0);

	}
	@Test
	public void SubtractionTestGreaterNegativeSmallNegative() {
		Maths math=new Maths();
		int ans=math.sub(-18,-20);
		Assert.assertEquals(2, ans,0);

	}
	@Test
	public void SubtractionTestSmallNegataiveGreaterNegative() {
		Maths math=new Maths();
		int ans=math.sub(-20,-2);
		Assert.assertEquals(-18, ans,0);

	}
	

}
