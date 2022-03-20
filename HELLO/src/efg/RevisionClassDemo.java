package efg;

public class RevisionClassDemo {
	
		int age=20;//simple type
		String name="knights";//simple type
		float nam=127;
		MyType obj;//complex type
		void met() {
			MyType obj=null;//inside the method we have to give null because we haven't initialise the MyType Object
			System.out.println(obj);
			System.out.println(age+":"+name+":"+nam);
			obj=new MyType();//it is  like  creating an object.
			//MyType obj1=new MyType();
			
			System.out.println(obj.height+":"+obj.weight+":"+obj.name);
		}
		public static void main(String[] args) {
			RevisionClassDemo obj=new RevisionClassDemo();
			obj.met();
		}
	}


	class MyType{
		int height=45454;
		int weight=345345;
		String name="sssssss";
}
