package com.corejava.generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashMapGenericsDemo {
	public static void process(HashMap<? extends Number,?> hmap) {
		for(Map.Entry<? extends Number,?> entry:hmap.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		}
	public static void main(String[] args) {
	HashMap<Double,Integer> hm =new HashMap<Double,Integer>();
	hm.put(45.2322,35);
	hm.put(589.2322,65);
	hm.put(48.2,356);
	hm.put(15.322,35);
	process(hm);
}
}
