package java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		
		// 1. 기본생성자를 사용하여, MyCircle 클래스의 인스턴스 생성
		MyCircle c1 = new MyCircle();
		
		// 2. c1 객체의 반지름에 1.0값을 저장하여 반지름, 면적 출력
		c1.radius = 1.0;
		System.out.println("반지름: " + c1.radius);
		System.out.println("면적: " + c1.calcArea());
		
		// 3. 매개변수가 있는 생성자에 10.0을 값으로 주고,
				// MyCircle c2 클래스 인스턴스를 생성한 다음 반지름, 면적 출력 
		MyCircle c2 = new MyCircle(1.0);
		System.out.println("반지름: " + c2.radius);
		System.out.println("면적: " + c2.calcArea());

	} // end main()

} // end ClassMain03
