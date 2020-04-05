package leetcode.lcof.simple;

/**
 * 面试题58 - I. 翻转单词顺序
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student. "，则输出"student. a am I"。
 *
 */

public class O058I {
	
	public String reverseWords(String s) {
		String[] words=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			if(words[i].equals(""))
				continue;
			sb.append(words[i].trim()+" ");
		}
		return sb.toString().trim();
    }

}
