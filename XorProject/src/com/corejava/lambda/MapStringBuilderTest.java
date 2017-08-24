package com.corejava.lambda;

import java.util.HashMap;
import java.util.Map;

public class MapStringBuilderTest {

	public static void main(String[] args) {
			Map<Integer,String> hashMap=new HashMap<Integer,String>();
			hashMap.put(1, "ONE");
			hashMap.put(2,"TWO");
			hashMap.put(3,"Three");
			StringBuilder sb=new StringBuilder();
			
			for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
				 sb.append(entry.getKey());
				 sb.append(entry.getValue());

			}
			System.out.println(sb);

	}

}
