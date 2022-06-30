package gtweb3;

public class ThreadDemo2 {
public ThreadDemo2() {
	Thread t=new Thread(new MyRunnable());//creating of child thread
	t.start();//this will call the run method
}
public static void main(String[] args) {
	new ThreadDemo2();
	System.out.println("main thread");
}
}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		//job of the thread
		System.out.println("job of the child thread is writtenhere");		
	}
}