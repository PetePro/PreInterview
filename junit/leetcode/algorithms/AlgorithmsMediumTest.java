package leetcode.algorithms;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import leetcode.algorithms.medium.*;

public class AlgorithmsMediumTest {

	private A0003 a0003 = new A0003();
	private A0005 a0005 = new A0005();
	private A0006 a0006 = new A0006();
	private A0008 a0008 = new A0008();
	private A0011 a0011 = new A0011();
	private A0012 a0012 = new A0012();
	private A0015 a0015 = new A0015();
	private A0016 a0016 = new A0016();
	private A0017 a0017 = new A0017();
	private A0018 a0018 = new A0018();
	private A0022 a0022 = new A0022();
	private A0029 a0029 = new A0029();
	private A0031 a0031 = new A0031();
	private A0033 a0033 = new A0033();
	private A0034 a0034 = new A0034();
	private A0036 a0036 = new A0036();
	private A0039 a0039 = new A0039();
	private A0040 a0040 = new A0040();
	private A0043 a0043 = new A0043();
	private A0046 a0046 = new A0046();
	private A0047 a0047 = new A0047();
	private A0048 a0048 = new A0048();
	private A0049 a0049 = new A0049();
	private A0050 a0050 = new A0050();

	@Test
	public void testA0003() {
		assertEquals(3, a0003.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, a0003.lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, a0003.lengthOfLongestSubstring("pwwkew"));
	}

	@Test
	public void testA0005() {
		assertEquals("bab", a0005.longestPalindrome("babad"));
		assertEquals("bb", a0005.longestPalindrome("cbbd"));
	}

	@Test
	public void testA0006() {
		assertEquals("LCIRETOESIIGEDHN", a0006.convert("LEETCODEISHIRING", 3));
		assertEquals("LDREOEIIECIHNTSG", a0006.convert("LEETCODEISHIRING", 4));
	}

	@Test
	public void testA0008() {
		assertEquals(42, a0008.myAtoi("42"));
		assertEquals(-42, a0008.myAtoi("   -42"));
		assertEquals(4193, a0008.myAtoi("4193 with words"));
		assertEquals(0, a0008.myAtoi("words and 987"));
		assertEquals(-2147483648, a0008.myAtoi("-91283472332"));
	}

	@Test
	public void testA0011() {
		assertEquals(49, a0011.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}

	@Test
	public void testA0012() {
		assertEquals("III", a0012.intToRoman(3));
		assertEquals("IV", a0012.intToRoman(4));
		assertEquals("IX", a0012.intToRoman(9));
		assertEquals("LVIII", a0012.intToRoman(58));
		assertEquals("MCMXCIV", a0012.intToRoman(1994));
	}

	@Test
	public void testA0015() {
		assertEquals("[[-1, -1, 2], [-1, 0, 1]]", a0015.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }).toString());
	}

	@Test
	public void testA0016() {
		assertEquals(2, a0016.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
	}

	@Test
	public void testA0017() {
		assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", a0017.letterCombinations("23").toString());
	}

	@Test
	public void testA0018() {
		assertEquals("[[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]",
				a0018.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0).toString());
	}

	@Test
	public void testA0022() {
		List<String> res = a0022.generateParenthesis(3);
		List<String> expect = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
		assertEquals(expect.size(), res.size());
		assertTrue(res.containsAll(expect));
	}

	@Test
	public void testA0029() {
		assertEquals(3, a0029.divide(10, 3));
		assertEquals(-2, a0029.divide(7, -3));
	}

	@Test
	public void testA0031() {
		int[] nums1 = { 1, 2, 3 }, nums2 = { 3, 2, 1 }, nums3 = { 1, 1, 5 };
		a0031.nextPermutation(nums1);
		a0031.nextPermutation(nums2);
		a0031.nextPermutation(nums3);
		/*assertEquals(new int[] { 1, 3, 2 }, nums1);
		assertEquals(new int[] { 1, 2, 3 }, nums2);
		assertEquals(new int[] { 1, 5, 1 }, nums3);*/
	}

	@Test
	public void testA0033() {
		assertEquals(4, a0033.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
		assertEquals(-1, a0033.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
	}

	@Test
	public void testA0034() {
		assertArrayEquals(new int[] { 3, 4 }, a0034.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8));
		assertArrayEquals(new int[] { -1, -1 }, a0034.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6));
	}

	@Test
	public void testA0036() {
		char[][] board1 = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } },
				board2 = new char[][] { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
						{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
						{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
						{ '8', '.', '.', '.', '6', '.', '.', '.', '3' },
						{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
						{ '7', '.', '.', '.', '2', '.', '.', '.', '6' },
						{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
						{ '.', '.', '.', '4', '1', '9', '.', '.', '5' },
						{ '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		assertEquals(true, a0036.isValidSudoku(board1));
		assertEquals(false, a0036.isValidSudoku(board2));
	}

	@Test
	public void testA0039() {
		List<List<Integer>> res1 = a0039.combinationSum(new int[] { 2, 3, 6, 7 }, 7),
				res2 = a0039.combinationSum(new int[] { 2, 3, 5 }, 8);
		List<List<Integer>> expect1 = Arrays.asList(Arrays.asList(7), Arrays.asList(2, 2, 3)),
				expect2 = Arrays.asList(Arrays.asList(2, 2, 2, 2), Arrays.asList(2, 3, 3), Arrays.asList(3, 5));
		assertEquals(expect1.size(), res1.size());
		assertTrue(res1.containsAll(expect1));
		assertEquals(expect2.size(), res2.size());
		assertTrue(res2.containsAll(expect2));
	}

	@Test
	public void testA0040() {
		List<List<Integer>> res1 = a0040.combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8),
				res2 = a0040.combinationSum2(new int[] { 2, 5, 2, 1, 2 }, 5);
		List<List<Integer>> expect1 = Arrays.asList(Arrays.asList(1, 7), Arrays.asList(1, 2, 5), Arrays.asList(2, 6),
				Arrays.asList(1, 1, 6)), expect2 = Arrays.asList(Arrays.asList(1, 2, 2), Arrays.asList(5));
		assertEquals(expect1.size(), res1.size());
		assertTrue(res1.containsAll(expect1));
		assertEquals(expect2.size(), res2.size());
		assertTrue(res2.containsAll(expect2));
	}

	@Test
	public void testA0043() {
		assertEquals("6", a0043.multiply("2", "3"));
		assertEquals("56088", a0043.multiply("123", "456"));
	}

	@Test
	public void testA0046() {
		List<List<Integer>> res = a0046.permute(new int[] { 1, 2, 3 });
		List<List<Integer>> expect = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2),
				Arrays.asList(2, 1, 3), Arrays.asList(2, 3, 1), Arrays.asList(3, 1, 2), Arrays.asList(3, 2, 1));
		assertEquals(expect.size(), res.size());
		assertTrue(res.containsAll(expect));
	}

	@Test
	public void testA0047() {
		List<List<Integer>> res = a0047.permuteUnique(new int[] { 1, 1, 2 });
		List<List<Integer>> expect = Arrays.asList(Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 1),
				Arrays.asList(2, 1, 1));
		assertEquals(expect.size(), res.size());
		assertTrue(res.containsAll(expect));
	}

	@Test
	public void testA0048() {
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				matrix2 = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		int[][] expect1 = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } },
				expect2 = { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } };
		a0048.rotate(matrix1);
		a0048.rotate(matrix2);
		assertArrayEquals(expect1, matrix1);
		assertArrayEquals(expect2, matrix2);
	}

	@Test
	public void testA0049() {
		List<List<String>> res = a0049.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
		List<List<String>> expect = Arrays.asList(Arrays.asList("ate", "eat", "tea"), Arrays.asList("nat", "tan"),
				Arrays.asList("bat"));
		assertEquals(expect.size(), res.size());
		// assertTrue(res.containsAll(expect));
	}

	@Test
	public void testA0050() {
		assertEquals(1024.00000, a0050.myPow(2.00000, 10), 0.00001);
		assertEquals(9.26100, a0050.myPow(2.10000, 3), 0.00001);
		assertEquals(0.25000, a0050.myPow(2.00000, -2), 0.00001);
	}

}
