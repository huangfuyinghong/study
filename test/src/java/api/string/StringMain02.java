package java.api.string;

public class StringMain02 {

	public static void main(String[] args) {
		
		// String literal�� ������ ȣ���� ���� 
		// - �����ڴ� ȣ���� �� ���� ���ο� �ν��Ͻ��� ������(�ּҰ��� �ٸ�) 
		String str1 = new String("abc");
		String str2 = new String("abc");
		if (str1 == str2) { 
			System.out.println("���� ����");
		} else { 
			System.out.println("�ٸ� ����");
		}
		
		// ���ڿ� ���ͷ��� ����Ͽ� �ʱ�ȭ�ϴ� ��� 
		// ���ͷ��� ������ ���� �ν��Ͻ��� ����������  
		// �̹� ���ͷ��� ������� �ִ� ���� 
		// �ν��Ͻ��� �������� �Ȱ�, ������ �ν��Ͻ��� ��Ȱ�� 
		String str3 = "abc";
		String str4 = "abc";
		if(str3 == str4) { 
			System.out.println("���� ����");
		} else { 
			System.out.println("�ٸ� ����");
		}

	} // end main() 

} // end StringMain02
