package com.corejava.collection;
import java.util.*;
public class ArrayListDemo {
public static void main(String[] args) {
	List<Integer> arrList=new ArrayList<Integer>();
	arrList.add(5);
	arrList.add(15);
	arrList.add(56);
	arrList.add(86);
	arrList.add(48);
	ListIterator<Integer> itr=arrList.listIterator(arrList.size());  
	/*System.out.println("traversing elements in forward direction...");  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	} */ 
	System.out.println("traversing elements in backward direction...");  
	while(itr.hasPrevious()){  
	System.out.println(itr.previous());  
	}    
}
}
