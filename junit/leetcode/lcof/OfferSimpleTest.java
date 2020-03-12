package leetcode.lcof;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.lcof.simple.*;

public class OfferSimpleTest {

	private O003 o003 = new O003();
	private O004 o004 = new O004();
	private O005 o005 = new O005();
	private O010I o010i = new O010I();
	private O010II o010ii = new O010II();
	private O011 o011 = new O011();
	private O015 o015 = new O015();
	private O017 o017 = new O017();
	private O021 o021 = new O021();
	private O029 o029 = new O029();

	@Test
	public void testO003() {
		assertEquals(2, o003.findRepeatNumber(new int[] { 2, 3, 1, 0, 2, 5, 3 }));
	}

	@Test
	public void testO004() {
		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		assertEquals(true, o004.findNumberIn2DArray(matrix, 5));
		assertEquals(false, o004.findNumberIn2DArray(matrix, 20));
	}

	@Test
	public void testO005() {
		assertEquals("We%20are%20happy.", o005.replaceSpace("We are happy."));
	}

	@Test
	public void testO010I() {
		assertEquals(1, o010i.fib(2));
		assertEquals(5, o010i.fib(5));
	}

	@Test
	public void testO010II() {
		assertEquals(2, o010ii.numWays(2));
		assertEquals(21, o010ii.numWays(7));
	}

	@Test
	public void testO011() {
		assertEquals(1, o011.minArray(new int[] { 3, 4, 5, 1, 2 }));
		assertEquals(0, o011.minArray(new int[] { 2, 2, 2, 0, 1 }));
	}

	@Test
	public void testO015() {
		assertEquals(3, o015.hammingWeight(11));
		assertEquals(1, o015.hammingWeight(128));
	}

	@Test
	public void testO017() {
		int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertArrayEquals(expected, o017.printNumbers(1));
	}

	@Test
	public void testO021() {
		int[] expected = new int[] { 1, 3, 2, 4 };
		assertArrayEquals(expected, o021.exchange(new int[] { 1, 2, 3, 4 }));
	}

	@Test
	public void testO029() {
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				matrix2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[] expected1 = { 1, 2, 3, 6, 9, 8, 7, 4, 5 }, expected2 = { 1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7 };
		assertArrayEquals(expected1, o029.spiralOrder(matrix1));
		assertArrayEquals(expected2, o029.spiralOrder(matrix2));
	}

}
