package com.corejava.collection;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastSafeDemo implements Runnable {
	ConcurrentHashMap<Integer,String> hmap= new ConcurrentHashMap<Integer,String>();

	public FailFastSafeDemo()
	{
		Thread t1=new Thread(this);
		t1.setName("Thread_1");
		t1.start();
		
		Thread t2=new Thread(this);
		t2.setName("Thread_2");
		t2.start();
	}
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Thread_1"))
		{
			hmap.put(1, "Xoriant");
			hmap.put(2,"Infosys");
			hmap.put(3, "TCS");
		}
		if(Thread.currentThread().getName().equals("Thread_2"))
		{
			Iterator<Integer> itr= hmap.keySet().iterator();
	        while(itr.hasNext()){  
	        	int n=itr.next();
	         System.out.println("Key: "+n+"  value: "+hmap.get(n));  
	         hmap.put(4, "TCS1");
	        }  
		}
		
	}


	public static void main(String[] args) {
		FailFastSafeDemo t1= new FailFastSafeDemo();
		

		
	}

	
}
