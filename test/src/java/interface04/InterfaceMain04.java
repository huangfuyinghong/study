package java.interface04;

// ��ӹ޴� �������̽��� ����(implementation)

// �θ� �������̽��� �����ϴ� Ŭ���� 
class TestImple1 implements ParentInterface { 
	
	@Override
	public void test1() { 
		System.out.println("�θ� �������̽� �޼ҵ�1");
	}
}

// �ڽ� �������̽��� �����ϴ� Ŭ���� 
class TestImple2 implements ChildInterface { 
	
	@Override
	public void test1() { 
		System.out.println("�θ� �������̽� �޼ҵ�2");
	}
	
	@Override
	public void test2() { 
		System.out.println("�ڽ� �������̽� �޼ҵ�1");
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
