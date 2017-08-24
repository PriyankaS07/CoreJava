package com.corejava.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.*;

public class StringConstruct {
	
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("Orange");
	list.add("Key");
	list.add("Apple");
	list.add("Yes");
	StringBuilder s1 =new StringBuilder();
	for(String s:list)
	{
		s1.append(s.substring(0,1));
	}
	//System.out.println(s1);
	Consumer<StringBuilder> consumer=(StringBuilder x)->System.out.println(x);
	consumer.accept(s1);
}

}
