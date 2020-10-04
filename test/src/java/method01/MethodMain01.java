package java.method01;

public class MethodMain01 {
	
	// 함수 선언  
	public static void sayHello(String name) { 
		// String name : 외부의 값을 저장,함수 내에서만 사용 가능 
		// parameter : 매개변수_외부에서 전달받은 값을 함수 내에 전달하는 용도 
		System.out.println("안녕하세요~");
		System.out.println("저는" + name + "입니다.");
	} // end sayHello()
	
	public static void sayAge(int age) {
		System.out.println("제 나이는 " + age + "입니다.");
	} // end sayAge()
	
	// static 수식어 : 프로그램이 실행될 때 가장 먼저 생성하도록 선언하는 키워드  
	// static 메소드에서는 static으로 성ㄴ언된 메소드만 호출 가능  
	// main 함수() : JVM이 가장 먼저 호출하는 함수 

	public static void main(String[] args) {
		System.out.println();
		System.out.println("안녕하세요 ~ ");
		System.out.println("저는 토르입니다.");
		
		sayHello("목진혁");
		sayHello("아이언맨");
		// "아이언맨" : 인자값
		// argument " 인자.전달하는 값
		
		sayAge(20);

	} // end main()

} // end MethodMain01
