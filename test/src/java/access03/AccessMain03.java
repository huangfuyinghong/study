package java.access03;

// ĸ��ȭ(encapsulation)
// Ŭ�������� ������ ��, ��� ����(�ʵ�)���� private���� �����Ͽ� 
// �ܺ� Ŭ�������� �ʵ���� ���� �����ؼ� �аų� ���� ���ϰ� �ϴ� �� 
// �ʿ��� ��쿡 ���ؼ� public �޼ҵ带 �����Ͽ� 
// private ��� ������ ���������� �аų� ���� ���� �����ϰ� �� �� ���� 

public class AccessMain03 {

	public static void main(String[] args) {
		
		// MyNumber Ŭ������ �ν��Ͻ� ���� 
		MyNumber num = new MyNumber(100);
		System.out.println("number = " + num.getNumber());
		num.setNumber(10);
		System.out.println("number = " + num.getNumber());
		num.setNumber(2);
		System.out.println();
		
		

	} // end main()

} // end AccessMain03
