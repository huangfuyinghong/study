package java.interface02;

// Java 8 버전 부터 바뀐 인터페이스 : 
// 인터페이스가 가질 수 있는 멤버들  : 
// 1. public static final 필드(멤버 변수) - Java 7 버전과 동일 
// 2. public abstract 메소드 = Java 7 버전과 동일 
// 3. default 메소드 : 
// - 본체(body)가 구현되어 있는 메소드 
// - default 키워드를 사용하여 선언  
// - 인스턴스가 생성되어야만 사용할 수 있는 메소드 
// 4. static 메소드 
// - 본체(body)가 구현되어 있는 메소드 
// - static 키워드 사용, 인스턴스 생성 없이 사용 가능한 메소드 

public interface TestInterface {
	
	// 1. public static final 멤버 변수(필드) 
	public static final int MAX = 100;
	
	// 2. public abstract 메소드 
	public abstract int insert(String id, String pw);
	
	// 3. default 메소드 
	public default void connect() { 
		System.out.println("DB 연결 성공");
	}
	
	// 4. static 메소드 
	public static void createDB() { 
		System.out.println("DB 생성 성공");
	}
	
	// 

}
