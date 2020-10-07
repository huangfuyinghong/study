package java.access_homework;

public class Point {
	
	private double x; // x��ǥ 
	private double y; // y��ǥ 
	
	// �⺻ ������ 
	public Point() {}
	
	// �Ű������� ���� ������  
	public Point(double x, double y) { 
		this.x = x; 
		this.y = y;
	}

	// getter / setter 
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	// ���� ��ǥ�� �ٸ� ��ǥ ������ �Ÿ��� �����ϴ� �޼ҵ� 
	public double distance(Point pt) { 
		double disX = x - pt.x; // a
		double disY = y - pt.y; // b
		double d = Math.sqrt(disX * disX + disY * disY); // c
		return d;
	}
	

} // end Point  
