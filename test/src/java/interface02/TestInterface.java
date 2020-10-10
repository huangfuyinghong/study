package java.interface02;

// Java 8 ���� ���� �ٲ� �������̽� : 
// �������̽��� ���� �� �ִ� �����  : 
// 1. public static final �ʵ�(��� ����) - Java 7 ������ ���� 
// 2. public abstract �޼ҵ� = Java 7 ������ ���� 
// 3. default �޼ҵ� : 
// - ��ü(body)�� �����Ǿ� �ִ� �޼ҵ� 
// - default Ű���带 ����Ͽ� ����  
// - �ν��Ͻ��� �����Ǿ�߸� ����� �� �ִ� �޼ҵ� 
// 4. static �޼ҵ� 
// - ��ü(body)�� �����Ǿ� �ִ� �޼ҵ� 
// - static Ű���� ���, �ν��Ͻ� ���� ���� ��� ������ �޼ҵ� 

public interface TestInterface {
	
	// 1. public static final ��� ����(�ʵ�) 
	public static final int MAX = 100;
	
	// 2. public abstract �޼ҵ� 
	public abstract int insert(String id, String pw);
	
	// 3. default �޼ҵ� 
	public default void connect() { 
		System.out.println("DB ���� ����");
	}
	
	// 4. static �޼ҵ� 
	public static void createDB() { 
		System.out.println("DB ���� ����");
	}
	
	// 

}
