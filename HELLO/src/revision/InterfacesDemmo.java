package revision;



	


interface Male1{//Role 1
public void Male1met();	//by default abstract method
}
interface Female1{//role 2
public void Female1met();
}
 class InterfacesDemmo implements Male1,Female1{
	@Override
	public void Male1met() {
		System.out.println("this is male met");
		
	}
	@Override
	public void Female1met() {
		System.out.println("this is female met");
		
	}
	public static void main(String[] args) {
		InterfacesDemmo human=new InterfacesDemmo();
		human.Male1met();
		human.Female1met();
		}
}