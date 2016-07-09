package com.hnu.effectivejava.conceptenhance;

public class OuterClass {
	private int age;
	private String name;
	public InnerClass getInnerClass(){
//		return new InnerClass();
		return OuterClass.this.new InnerClass();
	}
	
	public int OutMethod(){
		return 0;
	}
	
	//����һ���Ǿ�̬�ĳ�Ա��,�������ⲿ��ʵ����ڵ�����²��ܴ���
	class InnerClass{
		public InnerClass() {
			age = 23;
			name = "lj";
		}
		public void innerDisplay(){
			OutMethod();//�ڲ������ֱ�����ⲿ��ķ���
			System.out.println(name + ":" +age);
		}
		//.this���÷�,ͨ��this�����Χʵ�������
		public OuterClass getOutClass(){
			return OuterClass.this;
		}
	}

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();  
		//.new ���÷�
        OuterClass.InnerClass inner = outer.new InnerClass();  
        inner.innerDisplay();  
        
        OuterClass.InnerClass inner1 = outer.getInnerClass();  
        inner1.innerDisplay();
	}
}
