package revision;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo5 {
	public static void main(String[] args)throws Exception {
		ExecutorService ex=Executors.newFixedThreadPool(1);//modern way of creating threads.
		
		Future<String> future=ex.submit(new MyCallable());//future object returns the future object in string form
//12th line will call child thread
//ex.submit is used for starting the child thread
		System.out.println("main thread running...");
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
		//String result=future.get();//future.get will print line29.
		
		System.out.println(future.get());
	}
}

class MyCallable implements Callable<String>{
	@Override
	public String call() throws Exception {
		System.out.println("child thread called....");
		return "hello from call method...";
	}
}