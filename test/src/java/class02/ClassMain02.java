package java.class02;

public class ClassMain02 {

	public static void main(String[] args) {
	
		// �⺻ �����ڸ� ����Ͽ� MyRectangle Ŭ������ �ν��Ͻ� ���� 
		MyRectangle rect1 = new MyRectangle();
		rect1.width = 3.0;
		rect1.height = 4.0;
		System.out.println("����: " + rect1.width);
		System.out.println("����: " + rect1.height);
		System.out.println("����: " + rect1.calcArea());
		
		System.out.println("=========================");
		
		// �Ű������� �ִ� �����ڸ� ȣ���ؼ� ��ü(�ν��Ͻ�) ����
		MyRectangle rect2 = new MyRectangle(3.0, 4.0);
		System.out.println("����: " + rect2.width);
		System.out.println("����: " + rect2.height);
		System.out.println("����: " + rect2.calcArea());

	} // end main()

} // end ClassMain02
