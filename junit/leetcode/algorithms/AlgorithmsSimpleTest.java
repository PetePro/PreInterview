package leetcode.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.algorithms.simple.*;

public class AlgorithmsSimpleTest {

	private A0001 a0001 = new A0001();
	private A0007 a0007 = new A0007();
	private A0009 a0009 = new A0009();
	private A0013 a0013 = new A0013();
	private A0014 a0014 = new A0014();
	private A0020 a0020 = new A0020();
	private A0026 a0026 = new A0026();
	private A0027 a0027 = new A0027();
	private A0028 a0028 = new A0028();
	private A0035 a0035 = new A0035();
	private A0038 a0038 = new A0038();

	@Test
	public void testA0001() {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] res = { 0, 1 };
		assertArrayEquals(res, a0001.twoSum(nums, target));
	}

	@Test
	public void testA0007() {
		int x1 = 123, x2 = -123, x3 = 120;
		int res1 = 321, res2 = -321, res3 = 21;
		assertEquals(res1, a0007.reverse(x1));
		assertEquals(res2, a0007.reverse(x2));
		assertEquals(res3, a0007.reverse(x3));
	}

	@Test
	public void testA0009() {
		int x1 = 121, x2 = -121, x3 = 10;
		boolean res1 = true, res2 = false, res3 = false;
		assertEquals(res1, a0009.isPalindrome(x1));
		assertEquals(res2, a0009.isPalindrome(x2));
		assertEquals(res3, a0009.isPalindrome(x3));
	}

	@Test
	public void testA0013() {
		String s1 = "III", s2 = "IV", s3 = "IX", s4 = "LVIII", s5 = "MCMXCIV";
		int res1 = 3, res2 = 4, res3 = 9, res4 = 58, res5 = 1994;
		assertEquals(res1, a0013.romanToInt(s1));
		assertEquals(res2, a0013.romanToInt(s2));
		assertEquals(res3, a0013.romanToInt(s3));
		assertEquals(res4, a0013.romanToInt(s4));
		assertEquals(res5, a0013.romanToInt(s5));
	}

	@Test
	public void testA0014() {
		String[] strs1 = { "flower", "flow", "flight" }, strs2 = { "dog", "racecar", "car" };
		String res1 = "fl", res2 = "";
		assertEquals(res1, a0014.longestCommonPrefix(strs1));
		assertEquals(res2, a0014.longestCommonPrefix(strs2));
	}

	@Test
	public void testA0020() {
		String s1 = "()", s2 = "()[]{}", s3 = "(]", s4 = "([)]", s5 = "{[]}";
		boolean res1 = true, res2 = true, res3 = false, res4 = false, res5 = true;
		assertEquals(res1, a0020.isValid(s1));
		assertEquals(res2, a0020.isValid(s2));
		assertEquals(res3, a0020.isValid(s3));
		assertEquals(res4, a0020.isValid(s4));
		assertEquals(res5, a0020.isValid(s5));
	}

	@Test
	public void testA0026() {
		int[] nums1 = { 1, 1, 2 }, nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int res1 = 2, res2 = 5;
		assertEquals(res1, a0026.removeDuplicates(nums1));
		assertEquals(res2, a0026.removeDuplicates(nums2));
	}

	@Test
	public void testA0027() {
		int[] nums1 = { 3, 2, 2, 3 }, nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val1 = 3, val2 = 2;
		int res1 = 2, res2 = 5;
		assertEquals(res1, a0027.removeElement(nums1, val1));
		assertEquals(res2, a0027.removeElement(nums2, val2));
	}

	@Test
	public void testA0028() {
		String haystack1 = "hello", haystack2 = "aaaaa", haystack3 = "mississippi";
		String needle1 = "ll", needle2 = "bba", needle3 = "issip";
		int res1 = 2, res2 = -1, res3 = 4;
		assertEquals(res1, a0028.strStr(haystack1, needle1));
		assertEquals(res2, a0028.strStr(haystack2, needle2));
		assertEquals(res3, a0028.strStr(haystack3, needle3));
	}

	@Test
	public void testA0035() {
		int[] nums = { 1, 3, 5, 6 };
		int target1 = 5, target2 = 2, target3 = 7, target4 = 0;
		int res1 = 2, res2 = 1, res3 = 4, res4 = 0;
		assertEquals(res1, a0035.searchInsert(nums, target1));
		assertEquals(res2, a0035.searchInsert(nums, target2));
		assertEquals(res3, a0035.searchInsert(nums, target3));
		assertEquals(res4, a0035.searchInsert(nums, target4));
	}

	@Test
	public void testA0038() {
		int n1 = 1, n2 = 4;
		String res1 = "1", res2 = "1211";
		assertEquals(res1, a0038.countAndSay(n1));
		assertEquals(res2, a0038.countAndSay(n2));
	}

}
