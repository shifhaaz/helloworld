package gtweb3;

public class LamdaDemo {
public static void main(String[] args) {
	
FuncInter fc1=()->{System.out.println("this is met logic here");};
fc1.met();

FuncInter2 fc2=()->{return "hello world";};
System.out.println(fc2.met2());

FuncInter3 fc3=(i,s)->{System.out.println("this is met3 logic here...");};
fc3.met3(100, "shifha");

FuncInter4 fc4=(i,s)->{return  3.14F;};
System.out.println(fc4.met4(1000, "shif"));

}
}
interface FuncInter{
	public void met();
}
interface FuncInter2{
	public String met2();
}
interface FuncInter3{
	public void met3(int i,String s);
}
interface FuncInter4{
	public float met4(int i,String s);}