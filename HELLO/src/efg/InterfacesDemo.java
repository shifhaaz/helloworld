package efg;

public class InterfacesDemo {
public static void main(String[] args) {
	Human1 human  =new Human1();
	Animal animal = new Animal();
	human.FemaleMet();
	human.MaleMet();
	animal.Catmet();
}
}
interface Cat{
	public void Catmet();
}
interface Male{
	public void MaleMet();
}
interface Female{
	public void FemaleMet();
}
class Human1 implements Male,Female{
	 @Override
	public void FemaleMet() {
		System.out.println("female method called");
		
	}@Override
	public void MaleMet() {
		System.out.println("male method called");
		
	}
}
class Animal implements Cat{
	@Override
	public void Catmet() {
		System.out.println("cat method called");
		
	}
}