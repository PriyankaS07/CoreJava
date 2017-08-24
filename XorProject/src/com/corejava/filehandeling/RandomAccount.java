package com.corejava.filehandeling;

import java.io.File;
import java.io.RandomAccessFile;

class Acc{
	private int no;
	private String name;
	private Double sal;
	public Acc(int no, String name, Double sal) {
		this.no = no;
		this.name = name;
		this.sal = sal;
	}
public static void read()throws Exception{
	File file=new File("D:/CoreJava/acc.txt");
	RandomAccessFile raf = new RandomAccessFile(file, "rw"); 
	 raf.writeInt(23); 
	 raf.writeUTF("Tom");
	 raf.writeDouble(12000.85);
	 raf.writeInt(22); 
	 raf.writeUTF("Jerry");
	 raf.writeDouble(456.232);
	 long currentPosition = raf.getFilePointer(); 
	 raf.seek(0);  
	
	 do {
		 int id = raf.readInt();
		 String name = raf.readUTF();
		 double salary = raf.readDouble();
		 System.out.println(id+" "+name+" "+salary+" ");
		
		 if (salary>500.00) {
			System.out.println(id);
		}
	} while (currentPosition!=raf.length());
	 raf.close();
}

public static void update(){
	
}
	@Override
	public String toString() {
		return "Acc [no=" + no + ", name=" + name + ", sal=" + sal + "]";
	}
}
public class RandomAccount {
public static void main(String[] args)throws Exception {
	Acc.read();
	Acc.update();
	
}
}
