package leetcode.algorithms.difficult;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * 30. 串联所有单词的子串
 * 给定一个字符串 s 和一些长度相同的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。
 * 
 * 示例 1：
 * 输入：
 *   s = "barfoothefoobarman",
 *   words = ["foo","bar"]
 * 输出：[0,9]
 * 解释：
 * 从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
 * 输出的顺序不重要, [9,0] 也是有效答案。
 * 示例 2：
 * 输入：
 *   s = "wordgoodgoodgoodbestword",
 *   words = ["word","good","best","word"]
 * 输出：[]
 * 
 * 思路：假设words数组长度为L，word单词长度为WL,遍历字符串s, 下标记做i，
 *     需要比对的单词起始坐标则为 [i, i+WL, i+2WL ... i+(L-1)*WL]
 *     如果i满足条件，各个单词的第k位之和一定相等
 *     即：words[0][k] + words[1][k] + ... + words[L-1][k] == s[i + k] + s[i+WL + k] + ... + s[i+(L-1)*WL + k]
 *     反之，若对于i，满足后者条件的i则可能为正确结果，这个时候直接校验即可。
 *     总结：先找出符合特征的下标，再对符合下标的结果进行校验，完全符合则输出。
 *
 */

public class A0030 {

	public List<Integer> findSubstring2(String s, String[] words) {
		List<Integer> res = new ArrayList<>();
		if (words == null || words.length == 0)
			return res;
		int wLen = words[0].length();
		int wTotalLen = words[0].length() * words.length;
		int sLen = s.length();
		int[] flagArray = new int[wLen];
		for (int i = 0; i < wLen; i++) {
			int flag = 0;
			for (String word : words)
				flag += word.charAt(i);
			flagArray[i] = flag;
		}

		BitSet bs = new BitSet(words.length);
		for (int i = 0; i <= sLen - wTotalLen; i++) {
			int j = 0;
			for (; j < wLen; j++) {
				int sumFlag = 0;
				for (int k = 0; k < words.length; k++)
					sumFlag += s.charAt(i + k * wLen + j);
				if (sumFlag != flagArray[j])
					break;
			}
			if (j == wLen) {
				// 可能匹配
				bs.clear();
				for (int k = 0; k < words.length; k++) {
					String w = s.substring(i + k * wLen, i + (k + 1) * wLen);
					int n = 0;
					for (; n < words.length; n++) {
						if (!bs.get(n) && words[n].equals(w)) {
							bs.set(n);
							break;
						}
					}
					if (n == words.length)
						break;
				}
				if (bs.cardinality() == words.length)
					res.add(i);
			}
		}
		return res;
	}

	private boolean[] used;

	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> res = new ArrayList<Integer>();
		if (s.length() == 0 || words.length == 0 || s.length() < words.length * words[0].length())
			return res;
		List<String> substringList = new ArrayList<String>();
		used = new boolean[words.length];
		permutation(substringList, "", words, 0);
		for (int i = 0; i < substringList.size(); i++) {
			int pos = 0;
			while (pos != s.length()) {
				int ans = s.indexOf(substringList.get(i), pos);
				if (ans != -1 && !res.contains(ans))
					res.add(ans);
				pos++;
			}
		}
		return res;
	}

	public void permutation(List<String> res, String s, String[] words, int k) {
		if (k == words.length) {
			res.add(s);
			return;
		}
		for (int i = 0; i < words.length; i++) {
			String x = words[i];
			if (!used[i]) {
				s += x;
				used[i] = true;
				permutation(res, s, words, k + 1);
				s = s.substring(0, s.length() - words[0].length());
				used[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		String s = "pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybwvvsrfequzkhossmootkmyxgjgfordrpapjuunmqnxxdrqrfgkrsjqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnwpizlwszrtyclhgilklydbmfhuywotjmktnwrfvizvnmfvvqfiokkdprznnnjycttprkxpuykhmpchiksyucbmtabiqkisgbhxngmhezrrqvayfsxauampdpxtafniiwfvdufhtwajrbkxtjzqjnfocdhekumttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhducesctufqbumxbamalqudeibljgbspeotkgvddcwgxidaiqcvgwykhbysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhbhctcvubnhqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombiamxvauuitoltyymsarqcuuoezcbqpdaprxmsrickwpgwpsoplhugbikbkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixnsqsxacfwndzvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjynrhtcvxcobxbcjjivtfjiwmduhzjokkbctweqtigwfhzorjlkpuuliaipbtfldinyetoybvugevwvhhhweejogrghllsouipabfafcxnhukcbtmxzshoyyufjhzadhrelweszbfgwpkzlwxkogyogutscvuhcllphshivnoteztpxsaoaacgxyaztuixhunrowzljqfqrahosheukhahhbiaxqzfmmwcjxountkevsvpbzjnilwpoermxrtlfroqoclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybtyheqgcpwogdcjlnlesefgvimwbxcbzvaibspdjnrpqtyeilkcspknyylbwndvkffmzuriilxagyerjptbgeqgebiaqnvdubrtxibhvakcyotkfonmseszhczapxdlauexehhaireihxsplgdgmxfvaevrbadbwjbdrkfbbjjkgcztkcbwagtcnrtqryuqixtzhaakjlurnumzyovawrcjiwabuwretmdamfkxrgqgcdgbrdbnugzecbgyxxdqmisaqcyjkqrntxqmdrczxbebemcblftxplafnyoxqimkhcykwamvdsxjezkpgdpvopddptdfbprjustquhlazkjfluxrzopqdstulybnqvyknrchbphcarknnhhovweaqawdyxsqsqahkepluypwrzjegqtdoxfgzdkydeoxvrfhxusrujnmjzqrrlxglcmkiykldbiasnhrjbjekystzilrwkzhontwmehrfsrzfaqrbbxncphbzuuxeteshyrveamjsfiaharkcqxefghgceeixkdgkuboupxnwhnfigpkwnqdvzlydpidcljmflbccarbiegsmweklwngvygbqpescpeichmfidgsjmkvkofvkuehsmkkbocgejoiqcnafvuokelwuqsgkyoekaroptuvekfvmtxtqshcwsztkrzwrpabqrrhnlerxjojemcxel";
		String[] words = { "dhvf", "sind", "ffsl", "yekr", "zwzq", "kpeo", "cila", "tfty", "modg", "ztjg", "ybty",
				"heqg", "cpwo", "gdcj", "lnle", "sefg", "vimw", "bxcb" };
		System.out.println(new A0030().findSubstring(s, words).toString());
	}

}
