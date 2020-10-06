package java.access09;

// Java Runtime(실행환경, Java Virtual Machine)이 관리하는 메모리: 
// 1. Stack(스택) : 지역변수, 매개변수를 저장하는 메모리 영역  
// 2. Heap(힙) : 인스턴스(참조자료형 : 배열, 클래스 등)가 저장되는 메모리 영역  
// 3. Method(메소드) : static으로 선언된 변수, 메소드의 실행 코드들이 저장되는 메모리 영역  

// static 수식어 
// 1) 멤버 변수 또는 메소드를 선언(정의) 할 때 사용 
// - 인스턴스 생성(new) 이전에 프로그램이 처음 시작될 때 static 메모리 영역(Method)에 자동으로 생성 

// 2) 클래스 변수(static 변수) : static으로 선언한 멤버 변수 
// - 인스턴스를 생성하지 않아도 사용 가능 
// - static 변수는 생성되는 모든 인스턴스들이 공유하게 됨 
// - 클래스이름.변수이름 형식으로 사용 

// 3) 인스턴스 변수 : static이 붙이지 않은 멤버 변수  
// - 인스턴스를 생성한 후에만 사용할 수 있음 
// - 참조변수.변수이름 형식으로 사용 

// 4) 클래스 메소드(static 메소드) : static으로 선언한 메소드  
// - 인스턴스를 생성하지 않아도 사용가능한 메소드 
// - 클래스이름.메소드이름() 형식으로 사용 

// 5) 인스턴스 메소드 : static가 붙지 않은 메소드 
// - 인스턴스를 생성한 후에만 사용 할 수 있는 메소드 
// - 참조변수.메소드이름() 형식으로 사용  

public class AccessMain09 {

	public static void main(String[] args) {
		
		TestStatic test = new TestStatic(); // 인스턴스 생성 
		test.num1 = 100;
		
//에러		TestStatic.num1;  // 인스턴스 생성이 없으면 사용불가 - 인스턴스 멤버변수 
		TestStatic.num2 = 123;   // 인스턴스 생성이 없이 사용가능 - static(클래스) 멤버변수 
		
		// static 메소드 0 인스턴스 생성 없이 사용 가능 
		TestStatic.display2();

	} // end main()

} // end AccessMain09
