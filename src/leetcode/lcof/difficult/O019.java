package leetcode.lcof.difficult;

/**
 * 面试题19. 正则表达式匹配
 * 请实现一个函数用来匹配包含'.'和'*'的正则表达式。
 * 模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。
 *
 */

public class O019 {

	public boolean isMatch(String s, String p) {
		if (p.isEmpty())
			return s.isEmpty();
		boolean first_match = !s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');
		if (p.length() >= 2 && p.charAt(1) == '*')
			return (isMatch(s, p.substring(2)) || first_match && isMatch(s.substring(1), p));
		else
			return first_match && isMatch(s.substring(1), p.substring(1));
	}

}
