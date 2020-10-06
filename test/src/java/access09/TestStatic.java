package java.access09;

public class TestStatic {
	
	int num1; // 인스턴스 멤버 변수 
	static int num2; // 클래스 멤버 변수  
	
	// 인스턴스 메소드 
	public void display1() { 
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
	
	// 클래스(static) 메소드 
	public static void display2() { 
		// static 메소드는 인스턴스 생성 없이 사용 가능 
		// 그런데, 인스턴스 멤버변수는 인스턴스가 생서된 후에만 사용 가능 
		// 그래서, static 메소드에서 static이 아닌 멤버변수 접근은 불가능  
		
//		System.out.println("num1 = " + num1); // 에러 발생 
		System.out.println("num2 = " + num2);
	}

} // end TestStatic
