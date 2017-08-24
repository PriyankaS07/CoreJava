package com.corejava.thread;

public class WaterTank implements Runnable{
    Thread t1, t2, t3;
    static int level = 50;
    static int limit = 800;

    public  WaterTank() {
          {
          t1 = new Thread(this);
          t1.setName("Inlet");
          t1.start();
          t2 = new Thread(this);
          t2.setName("Outlet");
          t2.start();
          t3 = new Thread(this);
          t3.setName("Controller");
          t3.setDaemon(false);
          t3.start();
          }
    }

          @Override
          public void run() {
                Thread currentThread = Thread.currentThread();
                if(currentThread.getName().equals("Inlet")){
                      
                      for(;;){
                            level = level + 50;
                            System.out.println("Filling : The level is :" + level);
                            try {
                                  Thread.sleep(400);
                            } catch (InterruptedException e) {
                                  e.printStackTrace();
                            }
                      }
                }
                
                else if(currentThread.getName().equals("Outlet")){
                      
                      for(;;){
                            level = level - 70;
                            System.out.println("Spilling : The level is :" + level);
                            try {
                                  Thread.sleep(400);
                            } catch (InterruptedException e) {
                                  e.printStackTrace();
                            }
                      }
                }
                
                else if(currentThread.getName().equals("Controller")){
                      for(;;){
                      if(level >=800){
                            t1.suspend();
                            t2.resume();
                      }
                      if(level <=799){
                            t1.resume();
                            t2.suspend();
                      }
                      try {
                            Thread.sleep(100);
                      } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                      }
                
          }
    }
}
          
    public static void main(String[] args) {
          new WaterTank();

    }

}

