package java.inheritance02;

public class Person {
	
	// ��� ���� 
	private String name; 
	
	// �⺻ ������ 
	public Person() { 
		System.out.println("Person ������");
	}
	
	// �ް������� �ִ� ������ 
	public Person(String name) { 
		this.name = name; 
		System.out.println("Person(name) ������");
	}

	// getter / setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

} // Person
