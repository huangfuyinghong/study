package java.access08;

import java.util.Scanner;

// final ���ľ� 
// - final : ��������, ������ �� ���� 
// - �ʱ�ȭ ���� �ٲ� �� ���� 
// - final + ��� ����, ���� ���� => ���(�� �� �ʱ�ȭ�� ���� ������ �� ���� ����) 
// - final + �޼ҵ� : override �� �� ���� �޼ҵ� 
// - final + Ŭ���� : ����� ������� �ʴ� Ŭ����  

public class AccessMain08 {
	
	public static final int MENU_INSERT = 1;
	public static final int MENU_DELETE = 2;
	public static int test = 100;  // ��� ���� : Ŭ���� ��ġ���� ����� ����. Ŭ���� ���� ��� ��ġ���� ��� ���� 

	public static void main(String[] args) {
		
		test = 200; // ���� ���� 
		
		int x = 10; // �������� : Ư�� �Լ��� ����({})���� ����� ����. Ư�� �Լ��� ���������� ��� ���� 
		final int y = 10; // final : �� �̻� �ٲ� �� ���� 
		
		x = 123; 
//����		y = 100; 
		// �Ϲ����� ���������� �ʱ�ȭ ���Ŀ��� �������� ���� ���� ���� 
		// final ������ ó�� �ʱ�ȭ�� ���� ������ �� ���� 
		
		System.out.println(Math.PI);
		
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		switch(select) { 
		case MENU_INSERT : 
			System.out.println("�Է�");
			break;
			
		default :
		    break;
		}

	} // end main()

} // end AccessMain08
