package java.inner02;

// ��� ���� Ŭ����(member inner class)�� ����ϴ� ��� : 
// ��Ӱ���δ� ���� �� ������, 
// A��� ��ü�� ������ ���Ŀ��� ������ �� �ִ� B��� ��ü�� �ִٸ�  B�� A�� ���� Ŭ������ ���� 
// ��) �ڵ��� - Ÿ�̾�, PC - CPU/RAM ��  

public class Car {
	
	private String name; 
	
	public Car(String name) { 
		this.name = name; 
	}
	
	// ��� ���� Ŭ���� (member inner class) 
	public class Tire { 
		
		private int size;
		
		public Tire(int size) { 
			this.size = size; 
		}
		
		public void display() { 
			System.out.println(" --- �ڵ��� --- ");
			System.out.println("�ڵ��� �̸� : " + name);
			System.out.println("Ÿ�̾� ũ�� : " + size);
		} // end display() 
		
	} // end Tire

} // end Car 
