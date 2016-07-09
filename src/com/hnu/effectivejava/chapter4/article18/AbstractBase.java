package com.hnu.effectivejava.chapter4.article18;

/**
 * 这是一个骨架类
 * 骨架类（AbstractBase）是个抽象类，它实现了IBase接口，但是可以选择地实现它的方法，并不需要全部实现，因为接口本质上也是抽象类。
 * 
 * Interface缺点是无法拥有方法的实现。而抽象骨架实现的优点在于为抽象类提供实现上的帮助，也避免了抽象类作为类型定义时所特有的限制。
 * @author LJ
 *
 */
public abstract class AbstractBase implements IBase {
	//下面set get是模仿新增的公有的方法；
	//公开的接口，一旦投入使用就不能再更改了，如IBase是不能修改的，以后我发现还有些公共的东西能加进来，怎么办呢？
	//我可以在骨架类（AbstractBase）中设置新的方法，让子类继承就ok了，如例子中的setVal()和getVal()方法
	private String val;

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	//implenments the method of IBase interface,
	//可以选择性地实现接口中的一些方法,子类可以直接继承到，不像接口，接口无法拥有方法的实现
	public void baseMethodA() {
		System.out.println("AbstractBase Method");
	}

	public void baseMethodB() {
		
	}

	

}
