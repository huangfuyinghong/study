package java.inheritance05;

public class InheritanceMain {

	public static void main(String[] args) {
		
		String str = new String("���ڿ�");
		System.out.println(str);
		
		Person p1 = new Person("��");
		System.out.println(p1);
		
		// �Ｎ����)
				// 1. Point Ŭ���� ����
				// - ��� ����(double x, double y)
				// - �Ű����� ������ Point(double x, double y)
				// - toString �������̵��ؼ� (x, y)������ ���ڿ��� �����ϴ� �޼ҵ� �ϼ�
				// - main() �Լ����� Point ����  �� �ν��Ͻ� �����ϰ�, �Ʒ��� ���� ���
				// - ����) (1.0, 2.0)
		
		Point pt1 = new Point(1, 2);
		System.out.println(pt1);
		System.out.println(new Point(1, 2));
		

	} // end main()

} // end inheritanceMain05
