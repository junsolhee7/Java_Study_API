package com.iu.thread;

public class ThreadMain {

	public static void main(String[] args) {


		ThreadTest1 test1 = new ThreadTest1();
		ThreadTest2 test2 = new ThreadTest2();
		Thread t = new Thread(test2);
		
//		test1.getNum();
//		test2.getAlpa();
		
		// 개발자가 직접 호출이 아니라 
		// os에게 실행 부탁
		test1.start();
		test2.getAlpa();

	}

}
