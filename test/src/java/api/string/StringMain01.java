package java.api.string;

// API(Application Programming Interface ) : ���α׷��� �� � ü���� �����ϴ� ����� ����� �� �ְ� ���� �������̽�

public class StringMain01 {

	public static void main(String[] args) {
		String str1 = "�ȳ��ϼ���"; // ���ڿ� ���: �⺻Ÿ��.char, int, double
		System.out.println(str1);
		System.out.println("���ڿ��� ���� : " + str1.length());
		
		System.out.println();
		String str2 = new String("�ȳ��ϼ���."); // ����Ÿ��.�迭, ��ü �� 
		System.out.println(str2);
		
		if (str1 == str2) { 
			System.out.println("���� ����");
		} else { 
			System.out.println("�ٸ� ����");
		}
		// String�� �����ϴ� ���� �������� ���ڿ��� �ִ� �ּҰ��� ����� 
		// �񱳿�����(==, !=)�� �ܼ� �ּҰ��� �� 
		// -> ���� ���ڿ��� ������ ������ '�ּҰ��� �ٸ���'��� ����� �� �� ����  
		// ����, ���ڿ��� ������ ������ �ٸ��� ���� ���� equals() �޼ҵ带 ����ؾ� �� 
		
		if(str1.equals(str2)) { 
			System.out.println("���� ����");
		} else { 
			System.out.println("�ٸ� ����");
		}
		

	} // end main() 

} // end StringMain01
