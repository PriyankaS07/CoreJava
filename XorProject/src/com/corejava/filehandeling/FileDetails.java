package com.corejava.filehandeling;
import java.io.*;
public class FileDetails {
	public static void main(String[] args) {
		
	
	File folder = new File("D:/CoreJava/Assignments");
	File[] listOfFiles = folder.listFiles();

	for (File file : listOfFiles) {
	    if (file.isFile()) {
	        System.out.println(file.getName());
	        System.out.println(file.getTotalSpace());
	        System.out.println(file.getAbsolutePath());
	        System.out.println(file.getFreeSpace());
	    }
	}
	}
}
