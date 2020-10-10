package java.interface01;

import java.util.Scanner;

// �������̽�(Interface) : 
// 1. �������̽��� ��� �޼ҵ�� public abstract�� ����(Java 7������) 
// -> public abstract ���ľ� ���� ���� 
// 2. �������̽��� ��� ��� ������ public static final�� ����  
// -> public static final ���ľ�� ���� ���� 
// 3. �������̽��� ������ ���� interface Ű���� ���  
// 4. �������̽��� ����(���)�ϴ� Ŭ������ implements Ű���� ��� 
// 5. Ŭ������ ���� ����� �Ұ��� 
//    ��) class Child extends Parent2(x)
// 6. �������̽��� �����ϴ� ���ڿ��� ������ ���� 
//    ��) class Child implements Inter1, Inter2, ... (o)

public class InterfaceMain01 {

	public static void main(String[] args) {
		System.out.println("DB Version : " + DatabaseQuery.DATABASE_VERSION);
		
		// ����ڷ� ���� id, pw�� �Է¹��� 
		// �Է¹��� �����͸� DB���� �ۼ��� insert(id, pw) �޼ҵ�� ���� 
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է�>");
		String id = sc.nextLine();
		System.out.println("��й�ȣ �Է�>");
		String pw = sc.nextLine();
		sc.close();
		
		DatabaseQuery db = new OracleDatabaseQuery();
		int result = db.insert(id, pw);
		if (result > 0) { 
			System.out.println("Insert ����");
		} else { 
			System.out.println("Insert ����");
		}

	} // end main() 
 
} // end InterfaceMain01
