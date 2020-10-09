package java.inheritance04;

public class Animal {
	
	// 멤버 변수
	private String name; 
	
	// 생성자 
	public Animal() {} 
	public Animal(String name) {
		this.name = name;
	}
	
	// 메소드 
	public void speak() { 
		System.out.println("동물이 말합니다.");
	}
	

} // end Aminal
