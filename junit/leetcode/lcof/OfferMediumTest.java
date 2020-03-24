package leetcode.lcof;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.lcof.medium.*;

public class OfferMediumTest {

	private O012 o012 = new O012();
	private O013 o013 = new O013();
	private O014I o014i = new O014I();
	private O014II o014ii = new O014II();
	private O016 o016 = new O016();
	private O031 o031 = new O031();
	private O033 o033 = new O033();
	private O038 o038 = new O038();
	private O043 o043 = new O043();
	private O044 o044 = new O044();
	private O045 o045 = new O045();
	private O046 o046 = new O046();
	private O047 o047 = new O047();
	private O048 o048 = new O048();
	private O049 o049 = new O049();

	@Test
	public void testO012() {
		char[][] board1 = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } },
				board2 = { { 'a', 'b' }, { 'c', 'd' } };
		String word1 = "ABCCED", word2 = "abcd";
		assertEquals(true, o012.exist(board1, word1));
		assertEquals(false, o012.exist(board2, word2));
	}

	@Test
	public void testO013() {
		assertEquals(3, o013.movingCount(2, 3, 1));
		assertEquals(1, o013.movingCount(3, 1, 0));
	}

	@Test
	public void testO014I() {
		assertEquals(1, o014i.cuttingRope(2));
		assertEquals(36, o014i.cuttingRope(10));
	}

	@Test
	public void testO014II() {
		assertEquals(1, o014ii.cuttingRope(2));
		assertEquals(36, o014ii.cuttingRope(10));
	}

	@Test
	public void testO016() {
		assertEquals(1024.00000, o016.myPow(2.00000, 10), 0.00001);
		assertEquals(9.26100, o016.myPow(2.10000, 3), 0.00001);
		assertEquals(0.25000, o016.myPow(2.00000, -2), 0.00001);
	}

	@Test
	public void testO020() {
		assertTrue((new O020()).isNumber("+100"));
		//assertTrue((new O020()).isNumber("5e2"));
		assertTrue((new O020()).isNumber("-123"));
		assertTrue((new O020()).isNumber("3.1415926"));
		assertTrue((new O020()).isNumber("-1E-16"));
		assertFalse((new O020()).isNumber("12e"));
		assertFalse((new O020()).isNumber("1a3.14"));
		assertFalse((new O020()).isNumber("1.2.3"));
		assertFalse((new O020()).isNumber("+-5"));
		assertFalse((new O020()).isNumber("12e+5.4"));
	}

	@Test
	public void testO031() {
		assertTrue(o031.validateStackSequences(new int[] { 1, 2, 3, 4, 5 }, new int[] { 4, 5, 3, 2, 1 }));
		assertFalse(o031.validateStackSequences(new int[] { 1, 2, 3, 4, 5 }, new int[] { 4, 3, 5, 1, 2 }));
	}

	@Test
	public void testO033() {
		assertTrue(o033.verifyPostorder(new int[] { 1, 3, 2, 6, 5 }));
		assertFalse(o033.verifyPostorder(new int[] { 1, 6, 3, 2, 5 }));
	}

	@Test
	public void testO038() {
		String[] expected = { "abc", "acb", "bac", "bca", "cab", "cba" };
		assertArrayEquals(expected, o038.permutation("abc"));
	}

	@Test
	public void testO043() {
		assertEquals(5, o043.countDigitOne(12));
		assertEquals(6, o043.countDigitOne(13));
	}

	@Test
	public void testO044() {
		assertEquals(9, o044.findNthDigit(9));
		assertEquals(0, o044.findNthDigit(11));
	}

	@Test
	public void testO045() {
		assertEquals("102", o045.minNumber(new int[] { 10, 2 }));
		assertEquals("3033459", o045.minNumber(new int[] { 3, 30, 34, 5, 9 }));
	}

	@Test
	public void testO046() {
		assertEquals(5, o046.translateNum(12258));
	}

	@Test
	public void testO047() {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		assertEquals(12, o047.maxValue(grid));
	}

	@Test
	public void testO048() {
		assertEquals(3, o048.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, o048.lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, o048.lengthOfLongestSubstring("pwwkew"));
	}

	@Test
	public void testO049() {
		assertEquals(12, o049.nthUglyNumber(10));
	}

}
