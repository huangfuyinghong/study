package java.inheritance12;

// abstract : �߻�����, ��ü�� ���� 

// abstract �޼ҵ�(�߻� �޼ҵ�) : 
// - �޼ҵ��� ����(prototype : ����Ÿ��, �̸�, �Ű�����)�� �����ϰ� 
//   �޼ҵ��� ��ü(body : {})�� �������� �ʴ� �޼ҵ� 
// - { ... }�� ���� 
// - ���� Ÿ�� 
//   abstract ����Ÿ�� �޼ҵ��̸�(�Ű�����1, �Ű�����2, ...};

// abstract Ŭ����(�߻� Ŭ����) : 
// - �߻� �޼ҵ带 �ϳ��� ������ �ִ� Ŭ���� 
// - ���� Ÿ�� 
//   abstract class Ŭ�����̸� {...}
// - �߻� Ŭ������ �ν��Ͻ��� ������ �� ���� (�����ڸ� ȣ���� �� ����) 
// - ��ӹ��� Ŭ�������� �޼ҵ带 override�ϸ� �ν��Ͻ��� ������ �� ���� 

abstract class TestAbstract { 
	
	// ��� ���� 
	private int x; 
	
	// �޼ҵ� 
	public int getX() { 
		return x;
	}
	
	public void setX(int X) { 
		this.x = x;
	}
	
	// �߻� �޼ҵ� : ��ü�� ���� �޼ҵ� 
	public abstract void hello();
}

class TestChild extends TestAbstract { 
	@Override
	public void hello() { 
		System.out.println("�ȳ��ϼ���!");
	}
}

public class InheritanceMain12 {

	public static void main(String[] args) {
		// �߻� Ŭ������ �ν��Ͻ��� ������ �� ���� 
//		TestAbstract test1 = new TestAbstract();
		
		TestChild child = new TestChild();
		child.setX(100);
		System.out.println("x =" + child.getX());
		child.hello();
		
		
		
		
		

	} // end main() 
} // end InheritanceMain12
 