package java.method01;

public class MethodMain01 {
	
	// �Լ� ����  
	public static void sayHello(String name) { 
		// String name : �ܺ��� ���� ����,�Լ� �������� ��� ���� 
		// parameter : �Ű�����_�ܺο��� ���޹��� ���� �Լ� ���� �����ϴ� �뵵 
		System.out.println("�ȳ��ϼ���~");
		System.out.println("����" + name + "�Դϴ�.");
	} // end sayHello()
	
	public static void sayAge(int age) {
		System.out.println("�� ���̴� " + age + "�Դϴ�.");
	} // end sayAge()
	
	// static ���ľ� : ���α׷��� ����� �� ���� ���� �����ϵ��� �����ϴ� Ű����  
	// static �޼ҵ忡���� static���� ������� �޼ҵ常 ȣ�� ����  
	// main �Լ�() : JVM�� ���� ���� ȣ���ϴ� �Լ� 

	public static void main(String[] args) {
		System.out.println();
		System.out.println("�ȳ��ϼ��� ~ ");
		System.out.println("���� �丣�Դϴ�.");
		
		sayHello("������");
		sayHello("���̾��");
		// "���̾��" : ���ڰ�
		// argument " ����.�����ϴ� ��
		
		sayAge(20);

	} // end main()

} // end MethodMain01
