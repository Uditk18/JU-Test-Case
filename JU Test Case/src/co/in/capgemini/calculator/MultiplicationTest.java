package co.in.capgemini.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import co.in.capgemini.math.Maths;

public class MultiplicationTest {

	@Test
	public void MultiplicationZero() {
		Maths math=new Maths();
		int ans=math.mul(2,0);
		Assert.assertEquals(0, ans,0);

	}
	@Test
	public void MultiplicationBothPositive() {
		Maths math=new Maths();
		int ans=math.mul(2,2);
		Assert.assertEquals(4, ans,0);

	}
	@Test
	public void MultiplicationBothNegative() {
		Maths math=new Maths();
		int ans=math.mul(-2,-20);
		Assert.assertEquals(40, ans,0);

	}
	@Test
	public void MultiplicationOnePositiveOneNegative() {
		Maths math=new Maths();
		int ans=math.mul(2,-6);
		Assert.assertEquals(-12, ans,0);

	}
}
