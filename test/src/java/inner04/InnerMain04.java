package java.inner04;

// �ܺ� Ŭ���� 
class OuterClass { 
	
	int value; 
	static int count = 0;
	public OuterClass(int value) { 
		this.value = value;
	}
	
	// static ���� Ŭ����(��ø Ŭ����, nested class) 
	static class NestedClass { 
		
		private String name; 
		
		public NestedClass(String name) { 
			this.name = name;
		}
		
		public void display() { 
// ����			System.out.println("value = " + value);
			// �ܺ� Ŭ������ static�� �ƴ� ������ ������ �� ����! 
			
			System.out.println("count = " + count);
			// �ܺ� Ŭ�������� static���� ����� ������ ���� ���� 
			
			System.out.println("name = " + name);
		} // end display() 
	} // end NestedClass 
} // end OuterClass 

public class InnerMain04 {

	public static void main(String[] args) {
		
		// static ��� ���� ��� : (Ŭ���� �̸�).(���� �̸�) 
		OuterClass.count = 100; 
		System.out.println(OuterClass.count);
		
		// ��ø Ŭ����(static Ŭ����) 
		// (�ܺ�Ŭ���� �̸�) .(��øŬ���� �̸�) �����̸� = 
		//   new (�ܺ�Ŭ���� �̸�).(����Ŭ���� �̸�)(); 
		OuterClass.NestedClass nest = new OuterClass.NestedClass("Peter");
		nest.display();
		

	} // end main() 

} // end InnerMain04
