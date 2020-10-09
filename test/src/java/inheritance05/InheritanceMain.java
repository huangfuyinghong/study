package java.inheritance05;

public class InheritanceMain {

	public static void main(String[] args) {
		
		String str = new String("문자열");
		System.out.println(str);
		
		Person p1 = new Person("굿");
		System.out.println(p1);
		
		// 즉석퀴즈)
				// 1. Point 클래스 생성
				// - 멤버 변수(double x, double y)
				// - 매개변수 생성자 Point(double x, double y)
				// - toString 오버라이드해서 (x, y)형식의 문자열을 리턴하는 메소드 완성
				// - main() 함수에서 Point 변수  및 인스턴스 생성하고, 아래와 같이 출력
				// - 예시) (1.0, 2.0)
		
		Point pt1 = new Point(1, 2);
		System.out.println(pt1);
		System.out.println(new Point(1, 2));
		

	} // end main()

} // end inheritanceMain05
