package com.hnu.effectivejava.pratice;

/**
 * 实现过程：
 * 1.一个静态的内部类
 * 2.外部类与内部类都拥有相同的属性
 * @author LJ
 *
 */
public class NutritionFacts {
	private final int id;
	private final int size;
	
	private int fat;
	private int col;
	private int carbo;
	
	public NutritionFacts(Builder builder) {
		this.id = builder.id;
		this.size = builder.size;
		this.fat = builder.fat;
		this.col = builder.col;
		this.carbo = builder.carbo;
	}
	
	static class Builder{
		private final int id;
		private final int size;
		
		private int fat;
		private int col;
		private int carbo;
		public Builder(int id,int size) {
			this.id = id;
			this.size = size;
		}
		public Builder setFat(int fat){
			this.fat = fat;
			return this;
		}
		public Builder setCol(int col){
			this.col = col;
			return this;
		}
		public Builder setCarbo(int carbo){
			this.carbo = carbo;
			return this;
		}
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
	}
	
	public static void main(String[] args) {
		new NutritionFacts.Builder(100, 1).setFat(20).build();
	}
}
