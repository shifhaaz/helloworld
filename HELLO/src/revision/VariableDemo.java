package revision;

public class VariableDemo {

	public static void main(String[] args) {
		VariableDemo obj= new VariableDemo();
		Laddu laddu= new Laddu();
		System.out.println("Before Passing "+laddu.size);
		obj.pbv(laddu.size);
		System.out.println("After Passing "+laddu.size);
		
		//System.out.println("Before Passing "+laddu.size);
		//obj.pbr(laddu);
		//System.out.println("After Passing "+laddu.size);
		
	
	}
	void pbr(Laddu laddu) {
		laddu.size=5;
	}
	void pbv(int size) {
		size=5;
	}
}
	class Laddu{
		int size= 10;
	}

