package com.corejava.generics;

public class GenericTest<T> {
		private T t; 
		public void set(T t) { 
			this.t = t; 
			}  
		public T get() { 
			return t; 
			} 
	
	 public static void main(String[] args) {
		GenericTest<Integer> box = new GenericTest<Integer>();
		GenericTest<String> box1 = new GenericTest<String>();
		box.set(12); 
		box1.set("Hello");
		int x = box.get(); 
		System.out.println(x);
		String s=box1.get();
		System.out.println(s);
}
}
