package java.interface04;

// 상속받는 인터페이스의 구현(implementation)

// 부모 인터페이스를 구현하는 클래스 
class TestImple1 implements ParentInterface { 
	
	@Override
	public void test1() { 
		System.out.println("부모 인터페이스 메소드1");
	}
}

// 자식 인터페이스를 구현하는 클래스 
class TestImple2 implements ChildInterface { 
	
	@Override
	public void test1() { 
		System.out.println("부모 인터페이스 메소드2");
	}
	
	@Override
	public void test2() { 
		System.out.println("자식 인터페이스 메소드1");
	}
}


public class InterfaceMain04 {

	public static void main(String[] args) {
		
		TestImple1 imple1 = new TestImple1();
		imple1.test1();
		
		System.out.println();
		
		TestImple2 imple2 = new TestImple2();
		imple2.test1();
		imple2.test2();

	} // end main()

} // end InterfaceMain04
