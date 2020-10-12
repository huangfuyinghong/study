package java.api.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringMain06 {

	public static void main(String[] args) {
		// 정규표현식 연습 
		Scanner sc = new Scanner(System.in);
		
		
		// 입력받은 문자열이 연락처 형식인지 확인하는 코드  
        String data = sc.nextLine();
        
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        // (02|010) : 02 또는 010으로 시작  
        // - : '-' 기호 확인 
        // \d{3,4} : 3 ~ 4자리의 숫자 
        // \d{4} : 4자리의 숫자 
        boolean result = Pattern.matches(regExp, data);
        if (result) { 
        	System.out.println("정상적인 전화번호 입니다.");
        } else { 
        	System.out.println("정상적인 전화번호가 아닙니다.");
        }
        
        data = sc.nextLine(); // test@test.com
        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
    	// \w+ : 한 개 이상의 알파벳 또는 숫자
		// @ : @가 존재하는지
		// \w+ : 한 개 이상의 알파벳 또는 숫자
		// \. : .이 존재하는지
		// \w+ : 한 개 이상의 알파벳 또는 숫자
		// (\.\w+)? : \.\w+ 가 없거나 한 번 더 올 수 있음
        
        result = Pattern.matches(regExp, data);
        if (result) { 
        	System.out.println("정상적인 이메일입니다.");
        } else { 
        	System.out.println("정상적인 이메일이 아닙니다.");
        	
        String id = "Angel1004";
        String reg = "[a-zA-Z]\\W{8,12}";
        boolean isMatch = Pattern.matches(reg, id);
        System.out.println(isMatch);
        }
        

	}

}
