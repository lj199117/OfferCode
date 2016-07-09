package com.hnu.effectivejava.conceptenhance;

class A {
    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    } 
    
    //4-- ���B and B ��Ϊthis.show(O) this���A,Ȼ���ٿ�ָ������������û����д������Ǹ�����,���Ե���B���B and B
//    public String show(B obj){
//        return ("A and B");
//    }

}

class B extends A{
    public String show(B obj){
        return ("B and B");
    }
    
    public String show(A obj){
        return ("B and A");
    } 
    //6-- ��� B and D:��Ϊ��д�˸���ķ���
//    public String show(D obj){
//        return ("B and D");
//    }
}

class C extends B{

}

class D extends B{

}

/**
 * �������Ƿ���5��a2.show(c)��a2��A���͵����ñ���������this�ʹ����A��a2.show(c),
 * ����A�����ҷ���û���ҵ������ǵ�A�ĳ�������(super)������Aû�г��ࣨObject���⣩��
 * ���������Ҳ����this.show((super)O)��C�ĳ�����B��A������(super)OΪB��A��thisͬ����A��������A���ҵ���show(A obj)��
 * ͬʱ����a2��B���һ��������B����д��show(A obj)��������ջ��������B���show(A obj)���������Ҳ����B and A��
 * @author LJ
 * 
 * Ҳ����˵thisһֱ�Ǹ��������,Ȼ���ٿ�ָ������������û����д������Ǹ�����
 * ��ʵ�ڼ̳����ж��󷽷��ĵ��ô���һ�����ȼ���this.show(O)��super.show(O)��this.show((super)O)��super.show((super)O)��
 *
 */
public class Polymorphism {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        
        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));      
    }
}

