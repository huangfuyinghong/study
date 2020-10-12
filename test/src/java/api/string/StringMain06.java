package java.api.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringMain06 {

	public static void main(String[] args) {
		// ����ǥ���� ���� 
		Scanner sc = new Scanner(System.in);
		
		
		// �Է¹��� ���ڿ��� ����ó �������� Ȯ���ϴ� �ڵ�  
        String data = sc.nextLine();
        
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        // (02|010) : 02 �Ǵ� 010���� ����  
        // - : '-' ��ȣ Ȯ�� 
        // \d{3,4} : 3 ~ 4�ڸ��� ���� 
        // \d{4} : 4�ڸ��� ���� 
        boolean result = Pattern.matches(regExp, data);
        if (result) { 
        	System.out.println("�������� ��ȭ��ȣ �Դϴ�.");
        } else { 
        	System.out.println("�������� ��ȭ��ȣ�� �ƴմϴ�.");
        }
        
        data = sc.nextLine(); // test@test.com
        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
    	// \w+ : �� �� �̻��� ���ĺ� �Ǵ� ����
		// @ : @�� �����ϴ���
		// \w+ : �� �� �̻��� ���ĺ� �Ǵ� ����
		// \. : .�� �����ϴ���
		// \w+ : �� �� �̻��� ���ĺ� �Ǵ� ����
		// (\.\w+)? : \.\w+ �� ���ų� �� �� �� �� �� ����
        
        result = Pattern.matches(regExp, data);
        if (result) { 
        	System.out.println("�������� �̸����Դϴ�.");
        } else { 
        	System.out.println("�������� �̸����� �ƴմϴ�.");
        	
        String id = "Angel1004";
        String reg = "[a-zA-Z]\\W{8,12}";
        boolean isMatch = Pattern.matches(reg, id);
        System.out.println(isMatch);
        }
        

	}

}
