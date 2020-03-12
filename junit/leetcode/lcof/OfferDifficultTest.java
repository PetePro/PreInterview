package leetcode.lcof;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.lcof.difficult.O019;

public class OfferDifficultTest {

	private O019 o019 = new O019();

	@Test
	public void testO019() {
		String s1 = "aa", s2 = "aa", s3 = "ab", s4 = "aab", s5 = "mississippi";
		String p1 = "a", p2 = "a*", p3 = ".*", p4 = "c*a*b", p5 = "mis*is*p*.";
		assertEquals(false, o019.isMatch(s1, p1));
		assertEquals(true, o019.isMatch(s2, p2));
		assertEquals(true, o019.isMatch(s3, p3));
		assertEquals(true, o019.isMatch(s4, p4));
		assertEquals(false, o019.isMatch(s5, p5));
	}

}
