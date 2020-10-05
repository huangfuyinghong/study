package java.access02;

import java.access01.Test01; // 다른 package에 있는 변수를 생성 시 ... 

// 다른 package에 있는 변수를 불러 오기 

public class AccessMain02 {

	public static void main(String[] args) {
		
		Test01 t2 = new Test01();
		t2.display();
//		t2.n1 = 100; // private : 접근 불가, 같은 클래스에서만 접근 가능 
//		t2.n2 = 200; // (package) : 다른 패키지에 있으므로 접근 불가
//		t2.n3 = 300; // protected : 다른 패키지이고, 상속받지 않았으므로 접근 불가 
		t2.n4 = 400; // public : 어디서든 접근 가능 
		t2.display();
		
		
	} // end main()
 
} // end AccessMain02
