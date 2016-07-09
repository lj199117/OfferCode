package com.hnu.effectivejava.chapter2;

/**
 * 遇到多个构造器参数时要考虑用构建器
 * 假如遇到一个问题:一个产品有许多配料,我在new 这个产品的时候, 用其构造方法则显得十分不方便,有的配料是必须的,有的又是可选的
 * @author LJ 
 * 思想：
 * 不直接生成想要的对象,而是让客户端利用那些必要的参数调用构造器,得到一个builder对象,
 * 然后客户端在builder对象上调用类似setter的方法来设置可选参数,最后用无参的build()方法生成对象
 */
public class BuilderPattern {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	//有意思的构造器
	public BuilderPattern(Builder builder) {
		servingSize  = builder.servingSize;
        servings     = builder.servings;
        calories     = builder.calories;
        fat          = builder.fat;
        sodium       = builder.sodium;
        carbohydrate = builder.carbohydrate;
	}
	static class Builder {
		// Required parameters
		private final int servingSize;
		private final int servings;

		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;
		//这是必选的参数
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		//相当于链式
		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		//有意思设计手段
		public BuilderPattern build(){
			return new BuilderPattern(this);
		}
		
	}
	
	public String toString() {
		return "BuilderPattern [servingSize=" + servingSize + ", servings="
				+ servings + ", calories=" + calories + ", fat=" + fat
				+ ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}

	public static void main(String[] args) {
		BuilderPattern builderPattern = new BuilderPattern.Builder(240, 8).
	            calories(100).sodium(35).carbohydrate(27).build();
		System.out.println(builderPattern);
	}

}
