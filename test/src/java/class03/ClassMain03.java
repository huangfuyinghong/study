package java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		
		// 1. �⺻�����ڸ� ����Ͽ�, MyCircle Ŭ������ �ν��Ͻ� ����
		MyCircle c1 = new MyCircle();
		
		// 2. c1 ��ü�� �������� 1.0���� �����Ͽ� ������, ���� ���
		c1.radius = 1.0;
		System.out.println("������: " + c1.radius);
		System.out.println("����: " + c1.calcArea());
		
		// 3. �Ű������� �ִ� �����ڿ� 10.0�� ������ �ְ�,
				// MyCircle c2 Ŭ���� �ν��Ͻ��� ������ ���� ������, ���� ��� 
		MyCircle c2 = new MyCircle(1.0);
		System.out.println("������: " + c2.radius);
		System.out.println("����: " + c2.calcArea());

	} // end main()

} // end ClassMain03
