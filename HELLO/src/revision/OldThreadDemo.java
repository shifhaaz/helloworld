package revision;

import java.util.concurrent.Callable;

public class OldThreadDemo {
	public OldThreadDemo() {//constructor
		Thread t=new Thread(new MyThreadJob5());//old way of creating thread,creating of 5 threads
		
		//Thread t=new Thread(new MyThreadJob6());
		t.start();//child thread will start from here.
	}
	public static void main(String[] args) {
		new OldThreadDemo();//object of parent class OldThreadDemo
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

class MyThreadJob5 implements Runnable{	//runnable supports old and new (both) thread
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}

class MyThreadJob6 implements Callable<String>{//callable class is generic class if you want to return something then you can use callable interface
	//callable supports new thread
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "child thread with call called...";
	}
}