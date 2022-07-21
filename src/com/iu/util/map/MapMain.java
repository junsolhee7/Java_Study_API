package com.iu.util.map;

import java.util.HashMap;
import java.util.Set;


public class MapMain {

	public static void main(String[] args) {

		HashMap<String,Integer> map = new HashMap<>();
		map.put("n1", 10);
		map.put("n2", 20);
		map.put("third", 270);
		
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		int num = map.get("n2");
		System.out.println(num);

		//1. key들을 알아내기
		boolean check = map.containsKey("n2");
		System.out.println(check);
		
		Set<String> set = map.keySet();
		
		System.out.println(map);
		
		//외위야 함map.put("n1", 10);
////		Iterator<String> it = set.iterator(); 에러
//
//		
//		while(it.hasNext()) {
//			String key = it.next();
//			System.out.println(key);
//			System.out.println(map.get(key));
//		}
		
		
		

	}

}
