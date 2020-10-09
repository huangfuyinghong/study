package java.inheritance02;

public class Person {
	
	// 멤버 변수 
	private String name; 
	
	// 기본 생성자 
	public Person() { 
		System.out.println("Person 생성자");
	}
	
	// 메개변수가 있는 생성자 
	public Person(String name) { 
		this.name = name; 
		System.out.println("Person(name) 생성자");
	}

	// getter / setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

} // Person
