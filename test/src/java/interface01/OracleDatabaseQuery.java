package java.interface01;

public class OracleDatabaseQuery implements DatabaseQuery  { // DatabaseQuery 인터페이스를 구현
	
	// abstract 클래스를 강제적으로 override 함 
	
	@Override
	public int insert(String id, String pw) { 
		System.out.println("오라클 DB 연결");
	    System.out.println("SQL 문장 작성/실행");
	    System.out.println("SQL 실행 결과 처리");
	    return 1; 
	}

}
