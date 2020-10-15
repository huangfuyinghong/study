package java.inner01;

// ���� ���� : 
// 1. ��� ����(�ʵ�) : Ŭ�������� ����� ���� 
// - Ŭ���� ���� ��� �������� ����� �� �ִ� ���� 
// - ���ľ�(public, private, static, ...)�� ����� �� ����  
// 2. ���� ���� : �޼ҵ� �ȿ��� �����ϴ� ����  
// - ���� ������ ����� ������ ���� ������ ���� ����� ������ ������ ����� �� �ִ� ���� 
// - ���� ���ľ�(public, private, static, ...)�� ����� �� ���� 
// - final�� ��� ���� 

// ���� Ŭ����(Inner Class) : �ٸ� Ŭ���� ���ο��� ���ǵ� Ŭ���� 
// 1. ��� ���� Ŭ����(mEMBER inner class) 
// - ��� ������ �����ϴ� ��ġ���� �����ϴ� ���� Ŭ����
// - �ܺ� Ŭ������ �ν��Ͻ��� �����Ǿ�߸� ��ü ������ ������  
// 2. static ���� Ŭ����(static inner class), ��ø Ŭ����(nested class) 
// - ��� ������ �����ϴ� ��ġ���� static���� ������ ���� Ŭ���� 
// - �ܺ� Ŭ������ �ν��Ͻ��� �������� �ʾƵ� ��ü ������ ������ 
// - �ܺ� Ŭ������ ����� ���� Ŭ������� �����ص� �� 
// 3. ���� ���� Ŭ����(local inner class) : �޼ҵ� �ȿ��� �����ϴ� Ŭ���� 
// 1) �̸��� �ִ� local class 
// 2) �̸��� ���� local class : �͸� Ŭ����(anonymous class) 
//    -> ���� ǥ����(lamdba expression)

public class OuterClass {
	
	// ��� ����  
	private int value1; 
	
	// ������ 
	public OuterClass(int v) { 
		this.value1 = v; 
	}
	
	// �޼ҵ�  
	public void display() { 
		System.out.println("value1 = " + value1);
	} // end display() 
	
	// ��� ���� Ŭ����(member inner class) 
	class InnerClass { 
		private int value2; 
		
		public InnerClass(int v) { 
			this.value2 = v;
		}
		
		// �ܺ�Ŭ������ ��� ������ ���� Ŭ�������� ���� ����� ���� 
		public void setOuterValue(int value) { 
			value1 = value; 
		}
		
		public void printValue() { 
			// �ܺ� Ŭ������ ��� ���� ��� 
			System.out.println("outer value : " + value1);
			
			// ���� Ŭ������ ��� ���� ��� 
			System.out.println("inner value : " + value2);
			
		}
		
	} // end InnerClass 

	
} // end OuterClass 
