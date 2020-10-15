package java.inner01;

public class InnerMain01 {
	
	private int x;  // 멤버 변수 

	public static void main(String[] args) {
		
		int y; // 지역 변수 
		
		// 외부 클래스 OuterClass의 인스턴스를 생성 
		OuterClass out1 = new OuterClass(100); 
		out1.display();
		
		// 외부 클래스의 인스턴스를 생성했다고 해서 내부 클래스의 인스턴스까지 생성된 것은 아님 
		// -> 외부 클래스의 참조변수가 내부 클래스의 메소드를 사용 할 수 없음 
		
		// 내부 클래스의 인스턴스 생성 : 
		// (외부클래스 이름).(내부 클래스 이름) 변수이름 = 
		//        (외부 클래스의  참조 변수).new (내부클래스 생성자)(); 
		OuterClass.InnerClass inner1 = out1.new InnerClass(200);
		inner1.printValue();
		
		System.out.println();
		// 내부 클래스의 인스턴스를 통한 외부 클래스 멤버변수 변경 
		inner1.setOuterValue(300);
		inner1.printValue();
		out1.display();
		
		System.out.println();
		// out1 인스턴스를 통한 두번째 InnerClass 인스턴스 생성  
		OuterClass.InnerClass inner2 = out1.new InnerClass(500);
		inner2.printValue();

	} // end main() 
 
} // end InnerMain01
