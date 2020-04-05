package leetcode.lcof;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.lcof.simple.*;

public class OfferSimpleTest {

	@Test
	public void testO003() {
		O003 o003 = new O003();
		assertEquals(2, o003.findRepeatNumber(new int[] { 2, 3, 1, 0, 2, 5, 3 }));
	}

	@Test
	public void testO004() {
		O004 o004 = new O004();
		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		assertEquals(true, o004.findNumberIn2DArray(matrix, 5));
		assertEquals(false, o004.findNumberIn2DArray(matrix, 20));
	}

	@Test
	public void testO005() {
		O005 o005 = new O005();
		assertEquals("We%20are%20happy.", o005.replaceSpace("We are happy."));
	}

	@Test
	public void testO010I() {
		O010I o010i = new O010I();
		assertEquals(1, o010i.fib(2));
		assertEquals(5, o010i.fib(5));
	}

	@Test
	public void testO010II() {
		O010II o010ii = new O010II();
		assertEquals(2, o010ii.numWays(2));
		assertEquals(21, o010ii.numWays(7));
	}

	@Test
	public void testO011() {
		O011 o011 = new O011();
		assertEquals(1, o011.minArray(new int[] { 3, 4, 5, 1, 2 }));
		assertEquals(0, o011.minArray(new int[] { 2, 2, 2, 0, 1 }));
	}

	@Test
	public void testO015() {
		O015 o015 = new O015();
		assertEquals(3, o015.hammingWeight(11));
		assertEquals(1, o015.hammingWeight(128));
	}

	@Test
	public void testO017() {
		O017 o017 = new O017();
		int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertArrayEquals(expected, o017.printNumbers(1));
	}

	@Test
	public void testO021() {
		O021 o021 = new O021();
		int[] expected = new int[] { 1, 3, 2, 4 };
		assertArrayEquals(expected, o021.exchange(new int[] { 1, 2, 3, 4 }));
	}

	@Test
	public void testO029() {
		O029 o029 = new O029();
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				matrix2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[] expected1 = { 1, 2, 3, 6, 9, 8, 7, 4, 5 }, expected2 = { 1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7 };
		assertArrayEquals(expected1, o029.spiralOrder(matrix1));
		assertArrayEquals(expected2, o029.spiralOrder(matrix2));
	}

	@Test
	public void testO039() {
		O039 o039 = new O039();
		assertEquals(2, o039.majorityElement(new int[] { 1, 2, 3, 2, 2, 2, 5, 4, 2 }));
	}

	@Test
	public void testO040() {
		O040 o040 = new O040();
		assertArrayEquals(new int[] { 0 }, o040.getLeastNumbers(new int[] { 0, 1, 2, 1 }, 1));
		assertArrayEquals(new int[] { 1, 2 }, o040.getLeastNumbers(new int[] { 1, 2, 3 }, 2));
	}

	@Test
	public void testO042() {
		O042 o042 = new O042();
		assertEquals(6, o042.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

	@Test
	public void testO050() {
		O050 o050 = new O050();
		assertEquals('b', o050.firstUniqChar("abaccdeff"));
		assertEquals(' ', o050.firstUniqChar(""));
	}

	@Test
	public void testO053I() {
		O053I o053i = new O053I();
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		assertEquals(2, o053i.search(nums, 8));
		assertEquals(0, o053i.search(nums, 6));
	}

	@Test
	public void testO053II() {
		O054II o053ii = new O054II();
		assertEquals(8, o053ii.missingNumber(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 9 }));
		assertEquals(2, o053ii.missingNumber(new int[] { 0, 1, 3 }));
	}

	@Test
	public void testO057() {
		O057 o057 = new O057();
		assertEquals(30, o057.twoSum(new int[] { 10, 26, 30, 31, 47, 60 }, 40)[1]);
	}

	@Test
	public void testO058I() {
		O058I o058i = new O058I();
		assertEquals("blue is sky the", o058i.reverseWords("the sky is blue"));
		assertEquals("world! hello", o058i.reverseWords("  hello world!  "));
		assertEquals("example good a", o058i.reverseWords("a good   example"));
	}

	@Test
	public void testO058II() {
		O058II o058ii = new O058II();
		assertEquals("cdefgab", o058ii.reverseLeftWords("abcdefg", 2));
		assertEquals("umghlrlose", o058ii.reverseLeftWords("lrloseumgh", 6));
	}

	@Test
	public void testO059I() {
		O059I o059i = new O059I();
		assertArrayEquals(new int[] { 3, 3, 5, 5, 6, 7 },
				o059i.maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3));
	}

	@Test
	public void testO060() {
		O060 o060 = new O060();
		assertArrayEquals(new double[] { 0.02778, 0.05556, 0.08333, 0.11111, 0.13889, 0.16667, 0.13889, 0.11111,
				0.08333, 0.05556, 0.02778 }, o060.twoSum(2), 0.00001);
	}

	@Test
	public void testO061() {
		O061 o061 = new O061();
		assertTrue(o061.isStraight(new int[] { 0, 0, 1, 2, 5 }));
	}

	@Test
	public void testO062() {
		O062 o062 = new O062();
		assertEquals(2, o062.lastRemaining(10, 17));
	}

	@Test
	public void testO066() {
		O066 o066 = new O066();
		assertArrayEquals(new int[] { 120, 60, 40, 30, 24 }, o066.constructArr(new int[] { 1, 2, 3, 4, 5 }));
	}

}
