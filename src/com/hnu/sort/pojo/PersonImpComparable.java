package com.hnu.sort.pojo;

public class PersonImpComparable implements Comparable<PersonImpComparable>{
	/**
	 * 这是一个可以比较的类, 这时我们可以直接用 Collections.sort( personList ) 对其排序了.
	 * 另一个类和本类,我用什么样的规则进行排序
	 */
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public PersonImpComparable(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonImpComparable [id=" + id + ", name=" + name + ", age="
				+ age + "]";
	}

	public int compareTo(PersonImpComparable o) {
		// TODO Auto-generated method stub
		if(o.getAge() < this.getAge()) return 1;
		if(o.getAge() > this.getAge()) return -1;
		return 0;
	}

	
}
