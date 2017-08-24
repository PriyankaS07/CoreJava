package com.corejava.thread;

public class WaterTankTest implements Runnable{
	public static int waterLevel=0;
	Thread t1;
	Thread t2;
	Thread t3;
public WaterTankTest(){
 t1 = new Thread(this);
	t1.setName("Inlet");
	t1.start();
	t2 = new Thread(this);
	t2.setName("Outlet");
	t2.start();
	 t3 = new Thread(this);
	t3.setName("Controller");
	t3.setDaemon(true);
	t3.start();
}

@Override
public void run(){
	Thread currentThread= Thread.currentThread();
	if(currentThread.getName().equals("Inlet")){
		
		for(;;){
			waterLevel=waterLevel+50;
				System.out.println("Water level after inlet is "+waterLevel);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
	else if(currentThread.getName().equals("Outlet")){
		
		for (;;) {
			
			waterLevel=waterLevel-70;
			System.out.println("Water level after outlet is "+waterLevel);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
	else if(currentThread.getName().equals("Controller")){
		for (;;) {
			if (waterLevel>=800) {
				t1.suspend();
				t2.resume();
			}
			else if (waterLevel<799) {
				t1.resume();
				t2.suspend();
			}
		}
	}
}

public static void main(String[] args) {
new	WaterTankTest();
}
}
