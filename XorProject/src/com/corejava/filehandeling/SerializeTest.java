package com.corejava.filehandeling;
import java.io.*;
import java.util.Date;
class AccTest implements Serializable{
	private int accNo;
	private String name;
	private double balance;
	transient Date dob;
	public AccTest(int accNo, String name, double balance, Date dob) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "AccTest [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", dob=" + dob + "]";
	}
	

}
public class SerializeTest implements Serializable{

	private static final long serialVersionUID = 1L;
	public static void main(String[] args) throws Exception{
	File file = new File("D:/CoreJava/date.txt");
	FileOutputStream fout = new FileOutputStream(file); 
	ObjectOutputStream out = new ObjectOutputStream(fout);
	out.writeObject(new AccTest(1, "Chair purchase", 25000,new Date(7-12-2000))); 
	out.flush(); 
	out.close();
	
	
	FileInputStream fin = new FileInputStream(file);
	ObjectInputStream in = new ObjectInputStream(fin);
	AccTest acc = (AccTest)in.readObject();
	System.out.println("Acc = " + acc);
	in.close();
	fin.close();


}

	@Override
	public String toString() {
		return "SerializeTest []";
	}
}
