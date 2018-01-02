/**
 * 
 */
package com.xyd.test01;

/**
 * @author scott
 * @date 2017年12月21日上午9:13:10
 * @version 
 * @description 
 */
public class Student {

	private int age;
	private String name;
	
	private double salary;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
}
