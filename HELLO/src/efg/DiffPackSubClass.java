package efg;

import abc.AccessDemo;

public class DiffPackSubClass extends AccessDemo {

	void met2()

{
		System.out.println(pri);	
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
}
}
 class DiffPackNonSubClass {
	void met2()

{
		AccessDemo obj= new AccessDemo();
		System.out.println(obj.pri);	
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
}
}
