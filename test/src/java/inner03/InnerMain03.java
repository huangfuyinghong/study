package java.inner03;

// 외부 클래스 
class OuterTest { 
	
	private int value; 
	public OuterTest(int value) { 
		this.value = value;
	}
	
	public void printValue() { 
		System.out.println("value = " + value);
	}
	
	// 멤버 내부 클래스 
	class InnerTest { 
		private int value;
		
		InnerTest(int value) { 
			this.value = value;
		}
		
		// 외부 클래스의 멤버 변수 이름과 내부 클래스의 멤버변수 이름이 같을 때 
		// 외부 클래스의 멤버 변수를 참조하는 방법  
		public void displayValue() { 
			System.out.println("value = " + value);
			System.out.println("this.value = " + this.value);
			System.out.println("OuterTest.this.value = " + OuterTest.this.value);
		}
		
	} // end InnerTest
	
} // end OuterTest

public class InnerMain03 {

	public static void main(String[] args) {
		// OuterTest 클래스의 인스턴스 생성 
		OuterTest out = new OuterTest(100);
		out.printValue();
		
		System.out.println();
		OuterTest.InnerTest inner = out.new InnerTest(200);
		inner.displayValue();
		

	} // end main() 

} // end InnerMain03
