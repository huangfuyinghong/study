package java.access01;

/*
접근 제한 수식어(Access Modifier)
1. 종류 : private, (package), protected, public 
2. 기능 : 
       1) 멤버 변수에 대한 접근 권한을 설정  
       2) 메소드에 대한 접근 권한을 설정 
       3) 생성자에 대한 접근 권한을 설정 
       4) 클래스에 대한 접근 권한을 설정(package, public만 사용 가능) 
 3. 의미 
       1) private : 선언(정의)된 클래스 안에서만 직접 접근(사용)이 가능 
       2) (package) : 같은 패키지에 있는 클래스들에서 직접 접근(사용)이 가능 
       3) protected : 같은 패키지에 있거나 상속받는 클래스들에서 직접 접근(사용)이 가능 
       4) public : 어디서든지 직접 접근(사용) 가능 
 4. 사용범위 : 
       private < (package) < protected < public 
*/
public class AccessMain01 {

	public static void main(String[] args) {
		// test01 클래스의 인스턴트 생성 
		Test01 t1 = new Test01(); 
//		t1.n1 = 100; 
		// 에러 -> class Test01에 있는  n1변수는 Private 멤버 변수 이기 때문이다. 
		// private 멤버 변수는 다른 클래스에서 직접 접근이 불가능(보이지 않음) 
		// -> 값을 변경하거나 읽어오지 못함 
		t1.n2 = 200; // (package) : 같은 패키지에 있기 때문에 접근 가능 
		t1.n3 = 300; // protected : 같은 패키지에 있기 때문에 접근 가능
		t1.n4 = 400; // public : 어디서든지 접근 가능 
		t1.display();
		
	} // end main() 

} // end AccessMain01 
