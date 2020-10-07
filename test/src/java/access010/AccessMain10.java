package java.access010;

// - 싱글톤 패턴 사용 이유 
// 1. 고정된 메모리 영역을 얻어서 인스턴스를 한번만 생성하기 때문에 메모리 낭비 방지 
// 2. 싱글톤 클래스의 인스턴스는 전역 인ㅅ턴스이므로 데이터 공유가 쉬움 
// 3. 쓰레드풀, 캐시, 네트워크 연결, DB 연결 등 공통 객체를 사용해야 하는 사황에서 사용 

public class AccessMain10 {

	public static void main(String[] args) {
		
		Test t1 = new Test(); 
		t1.setName("test");
		System.out.println(t1);  // 주소값  
		System.out.println(t1.getName());
		
		Test t2 = new Test();
		t2.setName("test");
		System.out.println(t2); // 주소값  
		System.out.println(t2.getName());
		
		// 주소값이 같으면 같은 객체를 의미 
		System.out.println(t1 == t2);
		// * 주소값이 같으면 같은 객체(인스턴스)를 공유하는 것 
		// * 주소값이 다르면 다른 객체(인스턴스)를 공유하는 것 
		// 같은 객체를 공유하는 것은 데이터의 변경이나 삭제도 공유하는 것임 
		
		
		// Captain 클래스의 인스턴스(객체) 생성 
		Captain c1 = Captain.getInstance();
		c1.setName("Mok");
		System.out.println(c1);
		System.out.println(c1.getName());
		
		System.out.println();
		Captain c2 = Captain.getInstance();
		System.out.println(c2);
		System.out.println(c2.getName());
		
		System.out.println(c1 == c2);  
		// 싱글톤 패턴의 객체는 동일한 객체 (인스턴스)를 사용 
		
		c1.setName("c1객체변경");
		System.out.println(c2.getName());
		// 같은 객체를 공유하기 때문에, c1의 name이 변경되면 c2의 name도 같이 변경된다 
		

	} // end main()

} // end AccessMain10
