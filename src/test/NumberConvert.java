package test;

public class NumberConvert {

	public static long ChineseToArabic(String chinese) {
		char[] number = { '零', '一', '二', '三', '四', '五', '六', '七', '八', '九', '廿', '卅' };
		char[] unit = { '十', '百', '千', '万', '亿' };
		long[] unitLevel = { 10, 100, 1000, 10000, 100000000 };
		long res = 0;
		long level = 1;
		for (int i = chinese.length() - 1; i >= 0; i--) {
			char cur = chinese.charAt(i);
			boolean isNum = false;
			int num = 0;
			for (num = 0; num < number.length; num++) {
				if (cur == number[num]) {
					isNum = true;
					break;
				}
			}
			if (isNum) {
				if (num == 10)
					res += 20 * level;
				else if (num == 11)
					res += 30 * level;
				else
					res += num * level;
			} else {
				int u = 0;
				for (; u < unit.length; u++)
					if (cur == unit[u])
						break;
				if (level < unitLevel[u])
					level = unitLevel[u];
				else
					level *= unitLevel[u];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(ChineseToArabic("五百亿三千零八万一千零卅五"));
	}

}
