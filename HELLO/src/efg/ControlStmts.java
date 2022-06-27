package efg;

public class ControlStmts {

	public static void main(String[] args) {
choco obj=new choco();
obj.met();
obj.met(100);
int ret=obj.met1();
int ret1=obj.met2(243498232L);
System.out.println(ret);
System.out.println(ret1);
	}
	}
class choco{
	int i=3030;
	public void met()
	{
		System.out.println("this is class choco met");
	}
	public void met(int i) {
		System.out.println("this is class choco met2"+i);
	}
	public int  met1(){
		return 500;
		}
	public int met2(long l)
	{return 1000;
}}