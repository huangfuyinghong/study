package java.access08;

import java.util.Scanner;

// final 수식어 
// - final : 최종적인, 변경할 수 없는 
// - 초기화 값을 바꿀 수 없음 
// - final + 멤버 변수, 지역 변수 => 상수(한 번 초기화된 값을 변경할 수 없는 변수) 
// - final + 메소드 : override 할 수 없는 메소드 
// - final + 클래스 : 상속을 허용하지 않는 클레스  

public class AccessMain08 {
	
	public static final int MENU_INSERT = 1;
	public static final int MENU_DELETE = 2;
	public static int test = 100;  // 멤버 변수 : 클래스 위치에서 선언된 변수. 클래스 내에 모든 위치에서 사용 가능 

	public static void main(String[] args) {
		
		test = 200; // 변경 가능 
		
		int x = 10; // 지역변수 : 특정 함수나 본문({})에서 선어된 변수. 특정 함수나 본문에서만 사용 가능 
		final int y = 10; // final : 더 이상 바꿀 수 없는 
		
		x = 123; 
//에러		y = 100; 
		// 일반적인 지역변수는 초기화 이후에도 언제든지 값을 변경 가능 
		// final 변수는 처음 초기화된 값을 변경할 수 없음 
		
		System.out.println(Math.PI);
		
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		switch(select) { 
		case MENU_INSERT : 
			System.out.println("입력");
			break;
			
		default :
		    break;
		}

	} // end main()

} // end AccessMain08
