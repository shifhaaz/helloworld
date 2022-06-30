package gtweb3;
import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

public class ThreadDemo3{
public ThreadDemo3() {
	ExecutorService es= Executors.newFixedThreadPool(1);// 1 means one thread
	//es.execute(new MyRunnable());use lamda approach
	es.execute(()->{System.out.println("Child thread logic goes here");});
	es.shutdown();
}
public static void main(String[] args) {
	new ThreadDemo3();
	for (int i=0;i<5;i++) {
	
		try {
			Thread.sleep(3000);
			System.out.println("main thread"+i);
		}catch(Exception e) {}
		
	}
}
//class MyRunnable implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("child thread logic goes here");
//	}
//}
}