package java.inheritance11;

// final : ��������, ������ �� ���� 
// - final + ��� ���� or �������� : ���(�� �� �ʱ�ȭ�� ���� ������ �� ���� ����) 
// - final + �޼ҵ� : override �� �� ���� �޼ҵ�  
// - final + Ŭ���� : ����� ������� �ʴ� Ŭ���� 

class SuperClass { 
	public void test() { 
		System.out.println("�׽�Ʈ");
	} // end test()
	
	public final void testFinal() { 
		System.out.println("���̳� �޼ҵ�");
	}
} // end SuperClass


class SubClass extends SuperClass { 
	@Override
	public void test() { 
	}
	
	// testFinal() // final �޼ҵ�� ���� �Ұ� -> override �Ұ���
} // end SubClass

final class FinalClass { 
	
} // end FinalClass
// final class : ������ �� ���� Ŭ����  -> ��ӹ��� �� ���� Ŭ���� 


public class InteritanceMain11 {

	public static final int Max = 100; // final ��� ���� 
	
	public static void main(String[] args) {
		// MAX = 100;  // ���� �Ұ� 
		
		final int number =123;  // final ���� ����  
//		number = 456; // ���� �Ұ�  

	} // end main() 

} // end InheritanceMain11
