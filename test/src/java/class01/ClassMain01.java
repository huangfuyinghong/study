package java.class01;

public class ClassMain01 {

	public static void main(String[] args) {
		
		// Ŭ������ "��ü(�ν��Ͻ�)"�� "����" �Ѵ�. 
		// Ŭ���� �̸� �����̸� = new ������();
		
		// ���� Ÿ�� 
				// �⺻Ÿ�Ժ��� : byte, char, int ��. ���� ���� ���� �ȿ� ����  
				// ��) int a = 3; b = 10;
				// ����Ÿ�Ժ��� �� �迭, Ŭ����, �������̽� �� �ּҸ� ���� ��ü ����(reference)
				// ��) int[] a = new int[3];  BasicTv tv = new BsicTV();
		
		BasicTv tv = new BasicTv(); 
		System.out.println(tv.channel);
		System.out.println(tv.powerOn);
		System.out.println(tv.volume);
		
		tv.displayInfo();

		// * �����ڸ� ȣ���Ͽ� ��ü�� �����ϰ� �Ǹ� Ŭ������ ��� �������� �⺻������ �ʱ�ȭ�� 
		 		// ����(int, double, ...) Ÿ���� �⺻�� : 0
		 		// boolean Ÿ���� �⺻�� : false
		 		// �� �� Ÿ��(���� Ÿ��) : null
		
// 		Basic Tv tv2 = null;
//		tv2.displayInfo();
 		// NullPointerException : ���������� null ���� ���� ��� 
 		// ��ü�� ��� ������ �޼ҵ带 ����ϸ� �߻��ϴ� ���α׷� ���� 
		
		// TV�� ���(�޼ҵ�) ��� 
		 		// => BasicTv Ŭ������ ������ �ִ� �޼ҵ� ȣ��  
		 		// ���������̸�.�޼ҵ�(�Ű�����);
		
		tv.trunOnOff();
		tv.displayInfo();
		
// 		tv.powerOn = false; // ���� off
		tv.displayInfo();
		
		tv.channelUp();
		tv.volumeUp();
		tv.displayInfo();
		
		
		

	} // end main()

} // end ClassMain01
