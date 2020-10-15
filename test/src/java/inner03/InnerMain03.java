package java.inner03;

// �ܺ� Ŭ���� 
class OuterTest { 
	
	private int value; 
	public OuterTest(int value) { 
		this.value = value;
	}
	
	public void printValue() { 
		System.out.println("value = " + value);
	}
	
	// ��� ���� Ŭ���� 
	class InnerTest { 
		private int value;
		
		InnerTest(int value) { 
			this.value = value;
		}
		
		// �ܺ� Ŭ������ ��� ���� �̸��� ���� Ŭ������ ������� �̸��� ���� �� 
		// �ܺ� Ŭ������ ��� ������ �����ϴ� ���  
		public void displayValue() { 
			System.out.println("value = " + value);
			System.out.println("this.value = " + this.value);
			System.out.println("OuterTest.this.value = " + OuterTest.this.value);
		}
		
	} // end InnerTest
	
} // end OuterTest

public class InnerMain03 {

	public static void main(String[] args) {
		// OuterTest Ŭ������ �ν��Ͻ� ���� 
		OuterTest out = new OuterTest(100);
		out.printValue();
		
		System.out.println();
		OuterTest.InnerTest inner = out.new InnerTest(200);
		inner.displayValue();
		

	} // end main() 

} // end InnerMain03
