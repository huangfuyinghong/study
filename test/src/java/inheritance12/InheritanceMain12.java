package java.inheritance12;

// abstract : 추상적인, 실체가 없는 

// abstract 메소드(추상 메소드) : 
// - 메소드의 원형(prototype : 리턴타입, 이름, 매개변수)만 선언하고 
//   메소드의 본체(body : {})를 구현하지 않는 메소드 
// - { ... }이 없음 
// - 선언 타입 
//   abstract 리턴타입 메소드이름(매개변수1, 매개변수2, ...};

// abstract 클래스(추상 클래스) : 
// - 추상 메소드를 하나라도 가지고 있는 클래스 
// - 선언 타입 
//   abstract class 클래스이름 {...}
// - 추상 클래스는 인스턴스를 생성할 수 없음 (생성자를 호출할 수 없음) 
// - 상속받은 클래스에서 메소드를 override하면 인스턴스를 생성할 수 있음 

abstract class TestAbstract { 
	
	// 멤버 변수 
	private int x; 
	
	// 메소드 
	public int getX() { 
		return x;
	}
	
	public void setX(int X) { 
		this.x = x;
	}
	
	// 추상 메소드 : 본체가 없는 메소드 
	public abstract void hello();
}

class TestChild extends TestAbstract { 
	@Override
	public void hello() { 
		System.out.println("안녕하세요!");
	}
}

public class InheritanceMain12 {

	public static void main(String[] args) {
		// 추상 클래스는 인스턴스를 생성할 수 없음 
//		TestAbstract test1 = new TestAbstract();
		
		TestChild child = new TestChild();
		child.setX(100);
		System.out.println("x =" + child.getX());
		child.hello();
		
		
		
		
		

	} // end main() 
} // end InheritanceMain12
 