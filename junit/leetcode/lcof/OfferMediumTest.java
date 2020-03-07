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

}
