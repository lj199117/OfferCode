package org.hnu.nowcoder.course1;

public class FoldPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FoldPaper().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		foldPaper(4);
	}
	/**
	 * ��������:
5

��Ӧ���Ӧ��Ϊ:
["down","down","up","down","down","up",
"up","down","down",
"down","up","up",
"down","up","up",
"down","down","down",
"up","down","down","up","up","up","down","down",
"up","up","down","up","up"]
	 * @param n
	 * @return
	 */
    // write code here
	public void foldPaper(int N) {
		printProcess(1, N, true);
	}
	/**
	 * ÿһ�ζ��ۣ���Ȼ������һ���۹�Ļ��Ͻ��У��ǿ�����һ���Ѿ����ڵ�ĳ����A�������������ϻ������£�
	 * ��һ�ζ���ʱ��������λ����A�Ϸ�����һ����down����λ����A���·���������һ����up�ģ�
	 * ��Ҳ��Ϊʲô�ݹ��������ҪӲ�����ȡ true , false ��ԭ��
	 * @param i
	 * @param N
	 * @param isdown
	 */
	public void printProcess(int i, int N, boolean isdown) {
		if (i > N) {
			return;
		}
		printProcess(i + 1, N, true);
		System.out.print(isdown ? "down " : "up ");
		printProcess(i + 1, N, false);
	}
		
}
