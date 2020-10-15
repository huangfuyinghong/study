package java.inner01;

public class InnerMain01 {
	
	private int x;  // ��� ���� 

	public static void main(String[] args) {
		
		int y; // ���� ���� 
		
		// �ܺ� Ŭ���� OuterClass�� �ν��Ͻ��� ���� 
		OuterClass out1 = new OuterClass(100); 
		out1.display();
		
		// �ܺ� Ŭ������ �ν��Ͻ��� �����ߴٰ� �ؼ� ���� Ŭ������ �ν��Ͻ����� ������ ���� �ƴ� 
		// -> �ܺ� Ŭ������ ���������� ���� Ŭ������ �޼ҵ带 ��� �� �� ���� 
		
		// ���� Ŭ������ �ν��Ͻ� ���� : 
		// (�ܺ�Ŭ���� �̸�).(���� Ŭ���� �̸�) �����̸� = 
		//        (�ܺ� Ŭ������  ���� ����).new (����Ŭ���� ������)(); 
		OuterClass.InnerClass inner1 = out1.new InnerClass(200);
		inner1.printValue();
		
		System.out.println();
		// ���� Ŭ������ �ν��Ͻ��� ���� �ܺ� Ŭ���� ������� ���� 
		inner1.setOuterValue(300);
		inner1.printValue();
		out1.display();
		
		System.out.println();
		// out1 �ν��Ͻ��� ���� �ι�° InnerClass �ν��Ͻ� ����  
		OuterClass.InnerClass inner2 = out1.new InnerClass(500);
		inner2.printValue();

	} // end main() 
 
} // end InnerMain01
