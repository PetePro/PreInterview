package leetcode.lcof;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.lcof.simple.*;

public class OfferSimpleTest {

	private O003 o003 = new O003();
	private O004 o004 = new O004();
	private O005 o005 = new O005();

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

}
