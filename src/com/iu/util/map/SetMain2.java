package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetMain2 {

	public static void main(String[] args) {

		//Random
		Random random = new Random();
		HashSet hashSet = new HashSet();

		
		while(hashSet.size()<6) {
			hashSet.add(random.nextInt(45)+1); 	
		}
		
		Iterator iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(hashSet);
	}

}
