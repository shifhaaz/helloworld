package revision;

public class Constructor {
	String s;
 Constructor() {
	System.out.println("constructor get called");//constructor logic is use to the main survival of the current object.
}
  Constructor(String s){
	System.out.println("this is constructor with one parameter:"+"\t"+s);
	this.s=s;
	System.out.println(this.s);

}
Constructor(String s,float f){
	System.out.println("this is another constructor with 2 parameters:"+s+"\t"+f);
}
	public static void main(String[] args) {
//	new Constructor();
//	new Constructor("world");	
//	new Constructor("hello",3.14f);	
		Constructor obj= new Constructor();
	}

}
