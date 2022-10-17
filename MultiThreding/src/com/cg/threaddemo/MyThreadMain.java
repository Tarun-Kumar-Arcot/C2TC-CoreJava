package com.cg.threaddemo;

public class MyThreadMain {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread("firstThread");
		thread1.start();
	}

}
