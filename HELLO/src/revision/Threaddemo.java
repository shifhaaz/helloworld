package revision;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//https://fluvid.com/videos/detail/P5OY2TnxyvTP456nE#.YlGdE1SDsrk.link
public class Threaddemo {
	public static void main(String[] args)throws Exception{
		ExecutorService es=Executors.newFixedThreadPool(1);//modern way of creating of one thread.
		es.execute(new MyThreadJob());//it will call the runnable method(this will starts the execution of the thread.
		
		//Thread t=Thread.currentThread();//capture main thread and current thread.
		//System.out.println(t);//it will print the name of the main thread , priorityof thread and group which it belongs to.
		for(int i=0;i<5;i++) {	//main thread		
			System.out.println(i);
			Thread.sleep(1000);//sleep for 1 second(main thread)
		}
		es.shutdown();
	}
}

//job of thread

class MyThreadJob implements Runnable{//Runnable is a void method it will define the work of thread
	//by using runnable method we assign job to the child thread.
	@Override
	public void run() {
		System.out.println("child thread logic goes here...");
	}
}