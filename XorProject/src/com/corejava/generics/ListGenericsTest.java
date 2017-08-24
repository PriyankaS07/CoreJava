package com.corejava.generics;
import java.util.*;
public class ListGenericsTest {

	public static void process(List<? extends Number> list) {
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	}

	public static void main(String[] args) {
	List<Integer> listOfInt = new ArrayList<Integer>();
	listOfInt.add(12);
	listOfInt.add(45);
	listOfInt.add(56);
	listOfInt.add(65);

	List<String> listOfStr = new ArrayList<String>();
	process(listOfInt); 
	//process(listOfStr); //Error
}

}


