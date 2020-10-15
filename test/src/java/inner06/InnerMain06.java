package java.inner06; 

class Person { 
	// 멤버 변수 
	private String name;  
	
	// 생성자 
	public Person(String name) { 
		this.name = name; 
	}
	
	// 메소드 
	public PersonInterface setAge(int age) { // 리턴 타입 : PersonInterface
	     // 지역 클래스 정의 
		 class PersonWitAge implements PersonInterface { 
			 // 지역 클래스의 멤버 변수 
			 private int age; 
			 // 생성자 
			 public PersonWitAge(int age) { 
				 this.age = age; 
			 }
			 
			 @Override
			 public void showInfo() { 
				 System.out.println("이름 : " + name); 
				 System.out.println("나이 : " + age);
			 }
			 
			 @Override
			 public void hello() { 
				 System.out.println("안녕하세요!");
			 }
			 
		 } // end PersonWitAge 
		 
		 // 지역 클래스 객체(내용)을 모두 저장 
		 PersonWitAge instance = new PersonWitAge(age);
		 
		 // 지역 클래스 객체(내용)을 리턴  
		 return instance; 
		
} // end setAge() 
	
} // end Person() 

interface PersonInterface { 
	
	public abstract void showInfo(); 
	public abstract void hello();
}


public class InnerMain06 {

	public static void main(String[] args) {
		
		// 지역 클래스의 메소드를 외부에서 사용하는 방법 : 
		// 1. 지역 클래스의 메소드들을 선언한 인터페이스를 정의 
		// 2. 지역 클래스가 인터페이스를 구현하도록 정의  
		// 3. 다형성을 사용하여 메소드의 리턴타입으로 인터페이스를 사용할 수 있음  
		
		Person p = new Person("목쌤"); 
		PersonInterface instance  = p.setAge(20);
		instance.showInfo();
		instance.hello();
		

	} // end main() 

} // end InnerMain06
