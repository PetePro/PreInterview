package leetcode.algorithms;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import leetcode.algorithms.difficult.*;

public class AlgorithmsDifficultTest {

	private A0004 a0004 = new A0004();
	private A0010 a0010 = new A0010();
	private A0030 a0030 = new A0030();
	private A0032 a0032 = new A0032();
	private A0037 a0037 = new A0037();
	private A0041 a0041 = new A0041();
	private A0042 a0042 = new A0042();
	private A0044 a0044 = new A0044();
	private A0045 a0045=new A0045();

	@Test
	public void testA0004() {
		int[] nums11 = { 1, 3 }, nums12 = { 2 };
		int[] nums21 = { 1, 2 }, nums22 = { 3, 4 };
		assertEquals(2.0, a0004.findMedianSortedArrays(nums11, nums12), 0.1);
		assertEquals(2.5, a0004.findMedianSortedArrays(nums21, nums22), 0.1);
	}

	@Test
	public void testA0010() {
		String s1 = "aa", s2 = "aa", s3 = "ab", s4 = "aab", s5 = "mississippi";
		String p1 = "a", p2 = "a*", p3 = ".*", p4 = "c*a*b", p5 = "mis*is*p*.";
		assertEquals(false, a0010.isMatch(s1, p1));
		assertEquals(true, a0010.isMatch(s2, p2));
		assertEquals(true, a0010.isMatch(s3, p3));
		assertEquals(true, a0010.isMatch(s4, p4));
		assertEquals(false, a0010.isMatch(s5, p5));
	}

	@Test
	public void testA0030() {
		String s1 = "barfoothefoobarman", s2 = "wordgoodgoodgoodbestword";
		String[] words1 = { "foo", "bar" }, words2 = { "word", "good", "best", "word" };
		List<Integer> res1 = new ArrayList<Integer>(), res2 = new ArrayList<Integer>();
		res1.add(9);
		res1.add(0);
		assertEquals(res1, a0030.findSubstring(s1, words1));
		assertEquals(res2, a0030.findSubstring(s2, words2));
	}

	@Test
	public void testA0032() {
		String s1 = "(()", s2 = ")()())", s3 = "(())";
		assertEquals(2, a0032.longestValidParentheses(s1));
		assertEquals(4, a0032.longestValidParentheses(s2));
		assertEquals(4, a0032.longestValidParentheses(s3));
	}

	@Test
	public void testA0037() {
		char[][] board = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		PrintStream console = System.out;
		System.setOut(new PrintStream(bytes));
		a0037.solveSudoku(board);
		String res = "5 3 4 6 7 8 9 1 2 \n"
				+ "6 7 2 1 9 5 3 4 8 \n"
				+ "1 9 8 3 4 2 5 6 7 \n"
				+ "8 5 9 7 6 1 4 2 3 \n"
				+ "4 2 6 8 5 3 7 9 1 \n"
				+ "7 1 3 9 2 4 8 5 6 \n"
				+ "9 6 1 5 3 7 2 8 4 \n"
				+ "2 8 7 4 1 9 6 3 5 \n"
				+ "3 4 5 2 8 6 1 7 9";
		assertEquals(res, bytes.toString().trim().replace("\r", ""));
		System.setOut(console);
	}

	@Test
	public void testA0041() {
		int[] nums1 = { 1, 2, 0 }, nums2 = { 3, 4, -1, 1 }, nums3 = { 7, 8, 9, 11, 12 };
		assertEquals(3, a0041.firstMissingPositive(nums1));
		assertEquals(2, a0041.firstMissingPositive(nums2));
		assertEquals(1, a0041.firstMissingPositive(nums3));
	}

	@Test
	public void testA0042() {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		assertEquals(6, a0042.trap(height));
	}

	@Test
	public void testA0044() {
		String s1 = "aa", s2 = "aa", s3 = "cb", s4 = "adceb", s5 = "acdcb";
		String p1 = "a", p2 = "*", p3 = "?a", p4 = "*a*b", p5 = "a*c?b";
		assertEquals(false, a0044.isMatch(s1, p1));
		assertEquals(true, a0044.isMatch(s2, p2));
		assertEquals(false, a0044.isMatch(s3, p3));
		assertEquals(true, a0044.isMatch(s4, p4));
		assertEquals(false, a0044.isMatch(s5, p5));
	}
	
	@Test
	public void testA0045() {
		int[] nums= {2,3,1,1,4};
		assertEquals(2, a0045.jump(nums));
	}

}
