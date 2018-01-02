/**
 * 
 */
package com.xyd.test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author scott
 * @date 2017年12月21日上午9:25:53
 * @version 
 * @description  用map封装 一行数据
 */
public class Test03 {

	public static void main(String[] args) {
		
		List<Map<String,String>> list = new ArrayList<>();
		
		Map<String,String> map1 = new HashMap<>();
		
		map1.put("name", "令狐冲");
		map1.put("age", "34");
		map1.put("salary", "1000");
		
		list.add(map1);
		Map<String,String> map2 = new HashMap<>();
		
		map2.put("name", "任盈盈");
		map2.put("age", "33");
		map2.put("salary", "600");
		
		list.add(map2);
		
		Map<String,String> map3 = new HashMap<>();
		
		map3.put("name", "风清扬");
		map3.put("age", "60");
		map3.put("salary", "800");
		
		list.add(map3);
		
		System.out.println("name\tage\tsalary");
		for (Map<String, String> map : list) {
			
			System.out.println(map.get("name") + "\t" + map.get("age") + "\t" + map.get("salary"));
			
		}
		
	}
}
