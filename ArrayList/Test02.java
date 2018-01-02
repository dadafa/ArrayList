/**
 * 
 */
package com.xyd.test01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author scott
 * @date 2017年12月21日上午9:18:44
 * @version
 * @description 用一个List 封装一个行数据
 */
public class Test02 {

	public static void main(String[] args) {

		//内部List 封装一行数据
		//外部List 是容器
		List<List<String>> list = new ArrayList<>();
		
		List<String> p1 = new ArrayList<>();
		p1.add("张飞");
		p1.add("33");
		p1.add("4000");
		list.add(p1);
		
		List<String> p2 = new ArrayList<>();
		p2.add("刘备");
		p2.add("35");
		p2.add("6000");
		
		list.add(p2);
		List<String> p3 = new ArrayList<>();
		
		p3.add("关羽");
		p3.add("30");
		p3.add("5000");
		
		list.add(p3);
		
		System.out.println("name\tage\tsalary");
		for (List p : list) {
			
			System.out.println(p.get(0) + "\t" + p.get(1) + "\t" + p.get(2));
			
		}
	}
}
