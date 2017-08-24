package com.corejava.thread;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinForDirSize {

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		long totalDirSize = forkJoinPool.invoke(new SizeOfDirTask(new File("D:/Softwares_for_freshers_training")));
		System.out.println("Directory size: " + totalDirSize);
		forkJoinPool.shutdown();
		System.out.println("Steal count: " + forkJoinPool.getStealCount());
		System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
	}

}

class SizeOfDirTask extends RecursiveTask<Long> {

	File rootDir;
	
	public SizeOfDirTask(File rootDir) {
		this.rootDir = rootDir;	
	}
	
	@Override
	protected Long compute() {
		System.out.println("Computing sise of " + rootDir.getAbsolutePath());
		if(this.rootDir.isFile())
			return rootDir.length();
		
		File childrenFiles[] = rootDir.listFiles();
		List<SizeOfDirTask> tasks = new ArrayList<SizeOfDirTask>();
		
		for(File file: childrenFiles) {
			SizeOfDirTask sizeOfDirTask = new SizeOfDirTask(file);
			sizeOfDirTask.fork();
			tasks.add(sizeOfDirTask);
		}
		long totalDirSize = 0;
		for(SizeOfDirTask sizeOfDirTask: tasks) {
			totalDirSize = totalDirSize + sizeOfDirTask.join();
		}
		return totalDirSize;
	}
	
}