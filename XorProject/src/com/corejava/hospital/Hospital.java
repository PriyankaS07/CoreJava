package com.corejava.hospital;

import java.util.Random;

class User1 implements Listener{
@Override
public void notify(int n) {
	System.out.println("System 1 accepted "+n);
	
	}
}


public class Hospital{
	public static void push(int val,Listener lis){
		if(val>140){
			System.out.println("Sending value "+val);	
			lis.notify(val);
		}
		else{
			System.out.println("wrong number");
		}
	}
	public static void main(String[] args) {
		Listener l[]=new Listener[3];
		l[0]=new User1();
		l[1]=new User1();
		l[2]=new User1();
	Random r=new Random();
	int val=r.nextInt(200);
	for(int i=0;i<l.length;i++){
		Hospital.push(val,l[i]);
	}
}

}
