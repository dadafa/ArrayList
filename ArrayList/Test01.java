/**
 * 
 */
package com.xyd.test01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author scott
 * @date 2017年12月21日上午9:12:06
 * @version 
 * @description  用面向对象的思想来操作
 */
public class Test01 {

	public static void main(String[] args) {
		
		List<Student> arrayList = new ArrayList<>();
		
		arrayList.add(new Student(40, "乔峰", 400d));
		arrayList.add(new Student(25, "虚竹", 300d));
		arrayList.add(new Student(27, "段誉", 300d));
		
		System.out.println("name\tage\tsalary");
		for (Student stu : arrayList) {
			System.out.println(stu.getName() + "\t" + stu.getAge() + "\t" + stu.getSalary());
		}
		
		
	}
}
