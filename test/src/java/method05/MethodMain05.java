package java.method05;

//�޼ҵ� overloading
//1. �Ű������� ������ �ٸ��ų� 
//2. �Ű������� Ÿ���� �ٸ� ��� 
//���� �̸����� �޼ҵ带 ������ �� ����  
//�̸� �޼ҵ� �����ε��̶�� �θ� 
//(����) �޼ҵ��� ����Ÿ�Ը� �ٸ� ���� ���� �̸����� �޼ҵ带 ������ �� ����  
//�޼ҵ� �����ε� : Ŭ���� ������ ���� �̸����� ���� ���� �޼ҵ带 �����ϴ� �� 

public class MethodMain05 {

	public static void main(String[] args) {
		// �׽�Ʈ
		System.out.println();
		System.out.println("���ڿ�");
		System.out.println(1);
		System.out.println(1.0);
		System.out.println(true);
		
		sayHello();
		sayHello("���ڿ�");
		sayHello(20, "���");
		sayHello("���", 20);
		
	} // end main()
	
	
	public static void sayHello() {
		System.out.println("�ȳ��ϼ���.");
	}
	
	public static void sayHello(String name) { 
		System.out.println("�� �̸��� " + name + " �Դϴ�.");
	}
	
	public static void sayHello(String name, int age) { 
		System.out.println("�̸�: " + name); 
		System.out.println("����: " + age);
	}
	
	public static void sayHello(int age, String name) { 
		System.out.println("�� ���̴�: " + age);
		System.out.println("�� �̸���: " + name);
	}

} // end MethodMain05
