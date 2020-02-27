package leetcode.algorithms.difficult;

/**
 * 44. 通配符匹配
 * 给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
 * '?' 可以匹配任何单个字符。
 * '*' 可以匹配任意字符串（包括空字符串）。
 * 两个字符串完全匹配才算匹配成功。
 * 说明:
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 *。
 * 
 * 示例 1:
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 * 示例 2:
 * 输入:
 * s = "aa"
 * p = "*"
 * 输出: true
 * 解释: '*' 可以匹配任意字符串。
 * 示例 3:
 * 输入:
 * s = "cb"
 * p = "?a"
 * 输出: false
 * 解释: '?' 可以匹配 'c', 但第二个 'a' 无法匹配 'b'。
 * 示例 4:
 * 输入:
 * s = "adceb"
 * p = "*a*b"
 * 输出: true
 * 解释: 第一个 '*' 可以匹配空字符串, 第二个 '*' 可以匹配字符串 "dce".
 * 示例 5:
 * 输入:
 * s = "acdcb"
 * p = "a*c?b"
 * 输出: false
 * 
 * 思路：
 * dp[0][0]一定是true，因为s空串和p空串是可以匹配成功的；
 * dp[1][0]~dp[s.length][0]一定都是false，因为s不为空串而p为空串是不能匹配成功的。
 * dp[0][1]~dp[0][p.length]当s为空串的时候，而p不是空串的时候，当且仅当p的j字符以及前面都为'*'才为true。
 * 状态转移方程：
 * 当s[i]==p[j]或者p[j]=='?'，则dp[i][j]=dp[i-1][j-1]。可以理解为当前字符成功匹配后，只需要考虑之前的字符串是否匹配即可；也可以理解为当前字符匹配成功之后，"移除"当前元素(即不需要再考虑当前元素)。
 * 当p[j]=='*'，则dp[i][j]=dp[i-1][j]||dp[i][j-1]。可以理解为当字符为'*'的时候会出现两种情况，第一种是'*'需要作为一个字母与s[i]进行匹配；第二种是'*'需要作为空字符(即不需要'*'可以直接"移除")，所以dp[i][j-1]；用逻辑或将两种情况连接，是因为只要有一种情况可以匹配成功则当前匹配成功，有点暴力算法的感觉。
 * 当s[i]!=p[j]&&p[j]!='*'，dp[i][j]=false。这步可以省略，因为dp数组元素的默认值就是false，所以不必要进行显式的赋值为false。
 * 
 */

public class A0044 {

	public boolean isMatch(String s, String p) {
		int slen = s.length(), plen = p.length();
		boolean[][] dp = new boolean[slen + 1][plen + 1];
		dp[0][0] = true;
		// dp[0][1]~dp[0][p.length]只有p的j字符以及前面所有字符都为'*'才为true
		for (int j = 1; j <= plen; j++)
			dp[0][j] = p.charAt(j - 1) == '*' && dp[0][j - 1];
		// 填写dp数组剩余部分
		for (int i = 1; i <= slen; i++) {
			for (int j = 1; j <= plen; j++) {
				char si = s.charAt(i - 1), pj = p.charAt(j - 1);
				if (si == pj || pj == '?')
					dp[i][j] = dp[i - 1][j - 1];
				else if (pj == '*')
					dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
			}
		}
		return dp[slen][plen];
	}

	public static void main(String[] args) {
		String s="acdcb";
		String p="a*c?b";
		System.out.println(new A0044().isMatch(s, p));
	}

}
