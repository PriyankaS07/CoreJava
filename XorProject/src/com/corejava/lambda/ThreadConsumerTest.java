package com.corejava.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class MyThread implements Runnable{
	Thread t;
	List<String> list=new ArrayList<String>();
	MyThread(List<String> list){
		t=new Thread(this);
		t.start();
		this.list=list;
	}
	public void run(){
		Consumer<String> consumer = (x) -> System.out.println(x);
		this.list.forEach(consumer);
	}
	
}

public class ThreadConsumerTest{

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("a");
		list1.add("sb");
		list1.add("tbc");
		list1.add("wbcd");
		new MyThread(list1);
	}

}

