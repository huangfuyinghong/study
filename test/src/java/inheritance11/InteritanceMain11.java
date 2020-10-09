package java.inheritance11;

// final : 최종적인, 변경할 수 없는 
// - final + 멤버 변수 or 지역변수 : 상수(한 번 초기화된 값을 변경할 수 없는 변수) 
// - final + 메소드 : override 할 수 없는 메소드  
// - final + 클래스 : 상속을 허용하지 않는 클래스 

class SuperClass { 
	public void test() { 
		System.out.println("테스트");
	} // end test()
	
	public final void testFinal() { 
		System.out.println("파이널 메소드");
	}
} // end SuperClass


class SubClass extends SuperClass { 
	@Override
	public void test() { 
	}
	
	// testFinal() // final 메소드는 변경 불가 -> override 불가능
} // end SubClass

final class FinalClass { 
	
} // end FinalClass
// final class : 변경할 수 없는 클래스  -> 상속받을 수 없는 클래스 


public class InteritanceMain11 {

	public static final int Max = 100; // final 멤버 변수 
	
	public static void main(String[] args) {
		// MAX = 100;  // 변경 불가 
		
		final int number =123;  // final 지역 변수  
//		number = 456; // 변경 불가  

	} // end main() 

} // end InheritanceMain11
