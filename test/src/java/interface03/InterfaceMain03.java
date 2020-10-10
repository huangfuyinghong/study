package java.interface03;

// Ŭ������ ���� ����� �Ұ���������, �������̽��� �������� ����(���)�ϴ� ���� ���� 
interface Test1 { 
	public abstract void test1();
} // end Test1

interface Test2 { 
	public abstract void test2();
} // end Test2 

class TestImple implements Test1, Test2 { 
	
	@Override
	public void test2() { 
		System.out.println("�׽�Ʈ2");
	}
	
	@Override
	public void test1() { 
		System.out.println("�׽�Ʈ1");
	}
	
}

public class InterfaceMain03 {

	public static void main(String[] args) {
		TestImple imple1 = new TestImple();
		imple1.test1();
		imple1.test2();
		
		// �������̽��� ������ : 
		// - ������ Ŭ������ ��ü�� �������̽� Ÿ���� ���� ������ ���� ���� 
		Test1 imple2 = new TestImple();
		imple2.test1();
		((Test2) imple2).test2();
		// ������ Test1�� �����߱� ������ Test2�� �޼ҵ� ��� �� �� ����  
		// Test2�� �޼ҵ带 ����ϱ� ���ؼ��� ���� ����ȯ(casting)�� �ϸ� ��  

	} // end main()

} // end InterfaceMain03
