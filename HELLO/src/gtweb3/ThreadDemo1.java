package gtweb3;

public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		met1();
		met2();
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
//explanation of the program is when you create a thread is called child thread and all java prg
//runs on main thread is called mother thread or life of the java program
//in this program we have not created child thread this sonly thhe mai thread which is running accordingly.
