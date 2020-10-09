package java.inheritance08;

public class Employee {

	// 멤버 변수 
	private String name; 
	
	// 생성자 
	public Employee(String name) { 
		this.name = name;
	}
	
	public String getName() { 
		return name;
	}
	
	// 메소드 
	public void test() { 
		System.out.println("직원");
	}
	
	
	
} // end Employee 
