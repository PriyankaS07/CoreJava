package com.corejava.filehandeling;
import java.io.*;
public class SequenceFile {
	public static void main(String[] args) throws Exception {

	FileInputStream fin1=new FileInputStream("D:/CoreJava/abc.txt");
	FileInputStream fin2=new FileInputStream("D:/CoreJava/pqr.txt"); 
	FileInputStream fin3=new FileInputStream("D:/CoreJava/xyz.txt"); 
	SequenceInputStream sis1=new SequenceInputStream(fin1,fin2);
	SequenceInputStream sis=new SequenceInputStream(sis1,fin3);
	int i;
	while((i=sis.read())!=-1){ 
		System.out.print((char)i);
		} 
	sis.close(); 
	fin1.close(); 
	fin2.close();
	fin3.close();
}
}