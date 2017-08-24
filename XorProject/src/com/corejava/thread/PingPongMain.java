package com.corejava.thread;

public class PingPongMain implements Runnable {
	public PingPongMain(){
		Thread t1 = new Thread(this);
		t1.setName("PING");
		t1.start();
		Thread t2 = new Thread(this);
		t2.setName("PONG");
		t2.start();
		Thread t3 = new Thread(this);
		t3.setName("TONG");
		t3.start();
	}
	@Override
	public void run(){
		Thread currentThread= Thread.currentThread();
		if(currentThread.getName().equals("PING")){
			for(int i=0;i<10;i++){
				System.out.println("PING");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}}
			else if(currentThread.getName().equals("PONG")){
				for(int i=0;i<10;i++){
					System.out.println("\tPONG");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}}
			else if(currentThread.getName().equals("TONG")){
					for(;;){
						System.out.println("\tTONG");
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
			}
		}
	}
public static void main(String[] args) {
	new PingPongMain();
}
}

