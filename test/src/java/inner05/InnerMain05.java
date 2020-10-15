package java.inner05;

class OuterClass { 
	
	private int value; 
	
	public OuterClass(int value) { 
		this.value = value; 
	}
	
	public void test() { 
		int x = 123; // �������� (local variable)
		
		
		// ���� ������ �����ϴ� ��ġ���� �����ϴ� Ŭ���� : ���� Ŭ���� 
		class LocalClass { 
			// ����Ŭ������ ��� ���� 
			private int value2; 
			// ���� Ŭ������ ������ 
			public LocalClass(int value2) { 
				this.value2 = value2;
			}
			
			// ���� Ŭ������ ������  
			public void display() { 
				// �ܺ� Ŭ������ ��� ������ ���� ���� 
				System.out.println("value = " + value);
				
				// �޼ҵ��� ���� ���� ��� ����  
				System.out.println("x = " + x);
				
				// ���� Ŭ������ ��� ������ ���� ���� 
				System.out.println("value2 = " + value2);
			} // end display
				
		} // end LocalClass 
		
		// ���� Ŭ������ �ν��ͽ� ���� - �޼ҵ� �ȿ����� ���� 
		LocalClass local = new LocalClass(1234);
		local.display();
		
	} // end test() 
} // end OuterClass

public class InnerMain05 {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass(100);
		outer.test();
		

	} // end main() 

} // end InnerMain05
