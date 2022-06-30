package gtweb3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		met1();
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(()->{met2();});
		es.shutdown();
		met3();
	}

static void met1(){
	System.out.println("met 1 called....");
}
static void met2() {
	System.out.println("met 2 called....");
	try {
		Thread.sleep(5000);
	}catch(Exception e) {}
	System.out.println("met 2 finished....");
}
static void met3() {
	System.out.println("met 3 called....");
}
}
