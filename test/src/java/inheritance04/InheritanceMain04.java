package java.inheritance04;

public class InheritanceMain04 {

	public static void main(String[] args) {
		
		Animal animal = new Animal("�ֿϵ���");
		animal.speak();
		
		System.out.println();
		
		Dog dog = new Dog("�ٵ���", "������");
		dog.speak();
		
		System.out.println();
		
		Cat cat = new Cat();
		cat.speak();

	} // end main()

} // end InheritanceMain04
