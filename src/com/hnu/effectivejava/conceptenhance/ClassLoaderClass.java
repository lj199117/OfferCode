package com.hnu.effectivejava.conceptenhance;

public class ClassLoaderClass {

	public static void main(String[] args) throws ClassNotFoundException {
		ClassLoader loader = ClassLoaderClass.class.getClassLoader();
		System.out.println(loader);
		System.out.println(loader.getParent());
		//�ӽ����Կ�������û�л�ȡ��ExtClassLoader�ĸ�Loader��ԭ����Bootstrap Loader�������������������C����ʵ�ֵģ��Ҳ���һ��ȷ���ķ��ظ�Loader�ķ�ʽ�����Ǿͷ���null��
		System.out.println(loader.getParent().getParent());
		
		
		
		// ʹ��ClassLoader.loadClass()�������࣬����ִ�г�ʼ����
//		loader.loadClass("com.hnu.enhance.Test2");
		// ʹ��Class.forName()�������࣬Ĭ�ϻ�ִ�г�ʼ����
		Class.forName("com.hnu.enhance.Test2");
		// ʹ��Class.forName()�������࣬��ָ��ClassLoader����ʼ��ʱ��ִ�о�̬��
//		Class.forName("com.hnu.enhance.Test2", false, loader);
	}
}

class Test2 {
	static {
		System.out.println("��̬��ʼ����ִ���ˣ�");
	}
}