package java.class03;

public class MyCircle {
	
	// ��� ����
	double radius;
	
	// �⺻������
	public MyCircle() {}
	
	// �Ű������� �ִ� ������ 
	public MyCircle(double radius) {
		this.radius = radius; // this : �ڱ� �ڽ�(MyCircle Ŭ����)
	}
	
	public double calcArea() { 
		return 3.14 * radius * radius;
	}

} // MyCircle
