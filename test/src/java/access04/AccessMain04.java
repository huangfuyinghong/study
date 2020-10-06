package java.access04;

public class AccessMain04 {

	public static void main(String[] args) {
		// 객체 생성 및 데이터 저장 방식1 
	    Contact c1 = new Contact("아이유", "010-3242-00022-1", "iu@gmail.com");
	    c1.displayInfo();
	    
	    System.out.println();
	    c1.setPhone("010-1111-1111");
	    c1.displayInfo();
	    
	    // 객체 생성 및 데이터 저장 방식2 
	    System.out.println();
	    Contact c2 = new Contact();
	    // 본인이 좋아하는 연예인의 이름, 전화번호, 이메일을 넣어서 
	    // displayInfo()로 출력해주세요.
	    c2.setName("Mok");
		c2.setPhone("010-1111-1111");
		c2.setEmail("test@test.com");
		c2.displayInfo();
	    

	} // end main()

} // end AccessMain04
