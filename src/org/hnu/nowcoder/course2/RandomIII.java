package org.hnu.nowcoder.course2;
/**
 * ��һ���ȸ���������1~M�������rand1ToM���£�
	public int rand1ToM(int m) {
		return (int) (Math.random() * m) + 1;
	}
���֮�ⲻ��ʹ���κζ���������ơ��������������ֱ�Ϊm��n��
����rand1ToM(m)ʵ�ֵȸ���������1~n�������rand1ToN��
 * @author LJ
 *
 */
public class RandomIII {
	
	//������ԭ��Math.random() * m  0-m����m����
	public int rand1ToM(int m) {
		return (int) (Math.random() * m) + 1;
	}

	public int rand1ToN(int n, int m) {
		int[] nMSys = getMSysNum(n - 1, m);
		int[] randNum = getRanMSysNumLessN(nMSys, m);
		return getNumFromMSysNum(randNum, m) + 1;
	}

	// ��valueת��m���Ƶ���
	public int[] getMSysNum(int value, int m) {
		int[] res = new int[32];
		int index = res.length - 1;
		while (value != 0) {
			res[index--] = value % m;
			value = value / m;
		}
		return res;
	}

	// �ȸ���������һ��0~nMsys��Χ�ϵ���ֻ������m���Ʊ��ġ�
	public int[] getRanMSysNumLessN(int[] nMSys, int m) {
		int[] res = new int[nMSys.length];
		int start = 0;
		while (nMSys[start] == 0) {
			start++;
		}
		int index = start;
		boolean lastEqual = true;
		while (index != nMSys.length) {
			res[index] = rand1ToM(m) - 1;
			if (lastEqual) {
				if (res[index] > nMSys[index]) {
					index = start;
					lastEqual = true;
					continue;
				} else {
					lastEqual = res[index] == nMSys[index];
				}
			}
			index++;
		}
		return res;
	}

	// ��m���Ƶ���ת��10����
	public int getNumFromMSysNum(int[] mSysNum, int m) {
		int res = 0;
		for (int i = 0; i != mSysNum.length; i++) {
			res = res * m + mSysNum[i];
		}
		return res;
	}
}
