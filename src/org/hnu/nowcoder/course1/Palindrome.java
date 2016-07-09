package org.hnu.nowcoder.course1;
/**
 * ���һ��Դstr�Լ�һ����֪�Ļ��Ĵ�strlps,��strlps��������ٵ��ַ�ʹ��strΪһ�����Ĵ�
 * �� str=1231  strlps=131  ���str Ϊ12321 or 13231 ����һ������
 * @author LJ
 * 1.�����䳤��Ϊ2*n - m�����տռ�res,�������
 * 2.���ư����:strlps�����,������str���ҵ�strlpsƥ�������һȦ1����Ȧ��ಿ����AB,�Ҳಿ����KL;
 * Ȼ��res������� ���+�Ҳ�������Ҳ��� �Ҳ�+��������
 * �ٰѴ�Ȧ1 �ֱ𿽱���res����,��Ȧ��һ������
 */
public class Palindrome{
	public static void main(String[] args) {
		new Palindrome().run();
	}
	private void run() {
		String str = "AB1C2DE34F3GHJ21KL";
		String strlps = "1234321";
		System.out.println(getPalindrome(str,strlps));
	}
	public String getPalindrome(String str, String strlps) {
		if (str == null || str.equals("")) {
			return "";
		}
		char[] chas = str.toCharArray();
		char[] lps = strlps.toCharArray();
		char[] res = new char[2 * chas.length - lps.length];
		int chasl = 0;
		int chasr = chas.length - 1;
		int lpsl = 0;
		int lpsr = lps.length - 1;
		int resl = 0;
		int resr = res.length - 1;
		int tmpl = 0;
		int tmpr = 0;
		while (lpsl <= lpsr) {
			tmpl = chasl;
			tmpr = chasr;
			while (chas[chasl] != lps[lpsl]) {
				chasl++;
			}
			while (chas[chasr] != lps[lpsr]) {
				chasr--;
			}
			set(res, resl, resr, chas, tmpl, chasl, chasr, tmpr);
			resl += chasl - tmpl + tmpr - chasr;
			resr -= chasl - tmpl + tmpr - chasr;
			res[resl++] = chas[chasl++];
			res[resr--] = chas[chasr--];
			lpsl++;
			lpsr--;
		}
		return String.valueOf(res);
	}
	public void set(char[] res, int resl, int resr, char[] chas, int ls,
			int le, int rs, int re) {
		for (int i = ls; i < le; i++) {
			res[resl++] = chas[i];
			res[resr--] = chas[i];
		}
		for (int i = re; i > rs; i--) {
			res[resl++] = chas[i];
			res[resr--] = chas[i];
		}
	}
}
