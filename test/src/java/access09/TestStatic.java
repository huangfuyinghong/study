package java.access09;

public class TestStatic {
	
	int num1; // �ν��Ͻ� ��� ���� 
	static int num2; // Ŭ���� ��� ����  
	
	// �ν��Ͻ� �޼ҵ� 
	public void display1() { 
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
	
	// Ŭ����(static) �޼ҵ� 
	public static void display2() { 
		// static �޼ҵ�� �ν��Ͻ� ���� ���� ��� ���� 
		// �׷���, �ν��Ͻ� ��������� �ν��Ͻ��� ������ �Ŀ��� ��� ���� 
		// �׷���, static �޼ҵ忡�� static�� �ƴ� ������� ������ �Ұ���  
		
//		System.out.println("num1 = " + num1); // ���� �߻� 
		System.out.println("num2 = " + num2);
	}

} // end TestStatic
