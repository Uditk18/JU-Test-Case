package co.in.capgemini.calculator;

import org.junit.Assert;
//import inc.co.cg.calc.Maths;

import org.junit.Test;

import co.in.capgemini.math.Maths;

public class AdditionTest {

	@Test
	public void AdditionTestBothP() {
		Maths math = new Maths();
		int ans = math.add(2, 2);
		Assert.assertEquals(4, ans, 0);
	}

	@Test
	public void AdditionTestBothN() {
		Maths math = new Maths();
		int ans = math.add(-2, -2);
		Assert.assertEquals(-4, ans, 0);
	}

	@Test
	public void AdditionTestBothZero() {
		Maths math = new Maths();
		int ans = math.add(0, 0);
		Assert.assertEquals(0, ans, 0);
	}

	@Test
	public void AdditionTestOnePOneN() {
		Maths math = new Maths();
		int ans = math.add(-2, 4);
		Assert.assertEquals(2, ans, 0);
	}

	@Test
	public void AdditionTestOneNOneP() {
		Maths math = new Maths();
		int ans = math.add(-4, 2);
		Assert.assertEquals(-2, ans, 0);
	}

}
