package leetcode.lcof.simple;

/**
 * 面试题05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 */

public class O005 {

	public String replaceSpace(String s) {
		return s.replaceAll(" ", "%20");
	}

}
