package com.corejava.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
	public static void main(String[] args) {
		
	
	List<String> list=new ArrayList<String>();
	list.add("a");
	list.add("ab");
	list.add("abc");
	list.add("abcd");
	System.out.println("Before Replace "+list);
	UnaryOperator<String> unaryOpt = word-> word.toUpperCase(); 
	list.replaceAll(unaryOpt);
	System.out.println("After Replace "+list);
}
}

