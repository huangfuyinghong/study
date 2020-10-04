package java.class03;

public class MyCircle {
	
	// 멤버 변수
	double radius;
	
	// 기본생성자
	public MyCircle() {}
	
	// 매개변수가 있는 생성자 
	public MyCircle(double radius) {
		this.radius = radius; // this : 자기 자신(MyCircle 클래스)
	}
	
	public double calcArea() { 
		return 3.14 * radius * radius;
	}

} // MyCircle
