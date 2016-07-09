package com.hnu.designpattern.factory.simplefactory;

/**
 * �򵥹�����GoF���ǲ����ڵ�(��TVFactory=TVFactory+HaierTVFactory+ChangHongTVFactory)
 * �򵥹���������GoF���Ǵ��ڵ�(�����ڵķ�ʽTVFactory+HaierTVFactory+ChangHongTVFactory)
 * @author Administrator
 */
public class Client {

	public static void main(String[] args) {
		TVFactory tf = new ChanghongTVFactory();
		TV tv = tf.create();//�ò���TV�Ĵ������create()
		tv.open();
	}
}
