package java.interface01;

import java.util.Scanner;

// 인터페이스(Interface) : 
// 1. 인터페이스의 모든 메소드는 public abstract로 선언(Java 7번까지) 
// -> public abstract 수식어 생략 가능 
// 2. 인터페이스의 모든 멤버 변수는 public static final로 선언  
// -> public static final 수식어는 생략 가능 
// 3. 인터페이스를 선언할 때는 interface 키워드 사용  
// 4. 인터페이스를 구현(상속)하는 클래스는 implements 키워드 사용 
// 5. 클래스는 다중 상속이 불가능 
//    예) class Child extends Parent2(x)
// 6. 인터페이스를 구현하는 숫자에는 제한이 없음 
//    예) class Child implements Inter1, Inter2, ... (o)

public class InterfaceMain01 {

	public static void main(String[] args) {
		System.out.println("DB Version : " + DatabaseQuery.DATABASE_VERSION);
		
		// 사용자로 부터 id, pw를 입력받음 
		// 입력받은 데이터를 DB팀이 작성할 insert(id, pw) 메소드로 전송 
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력>");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력>");
		String pw = sc.nextLine();
		sc.close();
		
		DatabaseQuery db = new OracleDatabaseQuery();
		int result = db.insert(id, pw);
		if (result > 0) { 
			System.out.println("Insert 성공");
		} else { 
			System.out.println("Insert 실패");
		}

	} // end main() 
 
} // end InterfaceMain01
