package org.hnu.nowcoder.offer;

public class FoldPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FoldPaper().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		String[] result = this.foldPaper(4);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
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
	public String[] foldPaper(int n) {
        // write code here
		
		if(n <= 0)
			return null;
		if(n == 1) {
			String[] str = {"down"};
			return str;
		}
		if(n == 2){
			String[] str = {"down","down","up"};
			return str;
		}
		//ǰ���down  �����up
		if(n > 1){
			String[] str = foldPaper(n-1);
			String[] strtemp = new String[3 * (str.length-1) + 1];
			for(int i=0,j=0;i<str.length-1;i++){
				strtemp[j] = "down";
				strtemp[j+1] = str[i];
				strtemp[j+2] = "up";
				j+=3;
			}
			strtemp[strtemp.length-1] = "up";
			return strtemp;
		}
		return null;
    }
}
