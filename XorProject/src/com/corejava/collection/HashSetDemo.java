package com.corejava.collection;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(9);
		hset.add(8);
		hset.add(5);
		hset.add(7);
		Iterator<Integer> itr=hset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();
		lhset.add(92);
		lhset.add(81);
		lhset.add(50);
		Iterator<Integer> itr1=lhset.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		
	}
}
