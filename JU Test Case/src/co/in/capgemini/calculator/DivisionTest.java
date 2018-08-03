package co.in.capgemini.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import co.in.capgemini.math.Maths;

import org.junit.Test;

import co.in.capgemini.math.Maths;


public class DivisionTest {

	@Test
	public void DivisionTestBothPositive() {
		Maths math=new Maths();
		int ans=math.div(2,1);
		Assert.assertEquals(2,ans,0);
	}
	@Test
	public void DivisionTestBothNegative() {
		Maths math=new Maths();
		int ans=math.div(-22,-11);
		Assert.assertEquals(2,ans,0);
	}
	@Test
	public void DivisionTestOnepositiveOneNegative() {
		Maths math=new Maths();
		int ans=math.div(2,-1);
		Assert.assertEquals(-2,ans,0);
	}
	@Test
	public void DivisionTestOnePositiveOneZero() {
		Maths math=new Maths();
		int ans=math.div(2,0);
		Assert.assertEquals(0,ans,0);
	}
	@Test
	public void DivisionTestOneZeroOnePositive() {
		Maths math=new Maths();
		int ans=math.div(0,10);
		Assert.assertEquals(0,ans,0);
	}
}
