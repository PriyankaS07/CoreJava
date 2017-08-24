package com.corejava.filehandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteTest {
public static void main(String[] args) throws Exception {
	File file=new File("D:\\CoreJava\\abc.txt");
	File writefile=new File("D:\\CoreJava\\pqr.txt");
	FileInputStream fis=new FileInputStream(file);
	StringBuilder sb=new StringBuilder("");
	int i=0;
	do {
		i=fis.read();
		if(i!=-1)
			sb.append((char)i);
	} while (i!=-1);
	System.out.println(sb);
	FileOutputStream fos = new FileOutputStream(writefile);
	fos.write(sb.toString().getBytes());
	fis.close();
	fos.flush();
	fos.close();
}
}
