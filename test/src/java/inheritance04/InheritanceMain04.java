package java.inheritance04;

public class InheritanceMain04 {

	public static void main(String[] args) {
		
		Animal animal = new Animal("애완동물");
		animal.speak();
		
		System.out.println();
		
		Dog dog = new Dog("바둑이", "진돗개");
		dog.speak();
		
		System.out.println();
		
		Cat cat = new Cat();
		cat.speak();

	} // end main()

} // end InheritanceMain04
