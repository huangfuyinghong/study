package java.access010;

// - �̱��� ���� ��� ���� 
// 1. ������ �޸� ������ �� �ν��Ͻ��� �ѹ��� �����ϱ� ������ �޸� ���� ���� 
// 2. �̱��� Ŭ������ �ν��Ͻ��� ���� �Τ��Ͻ��̹Ƿ� ������ ������ ���� 
// 3. ������Ǯ, ĳ��, ��Ʈ��ũ ����, DB ���� �� ���� ��ü�� ����ؾ� �ϴ� ��Ȳ���� ��� 

public class AccessMain10 {

	public static void main(String[] args) {
		
		Test t1 = new Test(); 
		t1.setName("test");
		System.out.println(t1);  // �ּҰ�  
		System.out.println(t1.getName());
		
		Test t2 = new Test();
		t2.setName("test");
		System.out.println(t2); // �ּҰ�  
		System.out.println(t2.getName());
		
		// �ּҰ��� ������ ���� ��ü�� �ǹ� 
		System.out.println(t1 == t2);
		// * �ּҰ��� ������ ���� ��ü(�ν��Ͻ�)�� �����ϴ� �� 
		// * �ּҰ��� �ٸ��� �ٸ� ��ü(�ν��Ͻ�)�� �����ϴ� �� 
		// ���� ��ü�� �����ϴ� ���� �������� �����̳� ������ �����ϴ� ���� 
		
		
		// Captain Ŭ������ �ν��Ͻ�(��ü) ���� 
		Captain c1 = Captain.getInstance();
		c1.setName("Mok");
		System.out.println(c1);
		System.out.println(c1.getName());
		
		System.out.println();
		Captain c2 = Captain.getInstance();
		System.out.println(c2);
		System.out.println(c2.getName());
		
		System.out.println(c1 == c2);  
		// �̱��� ������ ��ü�� ������ ��ü (�ν��Ͻ�)�� ��� 
		
		c1.setName("c1��ü����");
		System.out.println(c2.getName());
		// ���� ��ü�� �����ϱ� ������, c1�� name�� ����Ǹ� c2�� name�� ���� ����ȴ� 
		

	} // end main()

} // end AccessMain10
