package java.access07;

public class AccessMain07 {

	public static void main(String[] args) {
		
		MyNumber num1 = new MyNumber();
		System.out.println(num1); // �ν��Ͻ��� ������(�ּҰ�) ��� 
		System.out.println(num1.getNumber());
		
		MyNumber num2 = new MyNumber(10);
		System.out.println(num2.getNumber());
		
		// num1�� �޼ҵ� add() ȣ��  
		MyNumber result = num1.add(num2);
		System.out.println(result.getNumber());
		
		System.out.println(" ===================== ");
		MyNumber x = new MyNumber(1);
		MyNumber y = new MyNumber(2);
		MyNumber z = new MyNumber(3);
		MyNumber end = new MyNumber(4);
		
		x.add(y).add(z).add(end);
		System.out.println(x.getNumber());
		// �� ���ٷ� �ۼ��� �ڵ�� ������ ���� 
		MyNumber r1 = x.add(y);
		MyNumber r2 = r1.add(z);
		MyNumber r3 = r2.add(end);
		System.out.println(r3.getNumber());
		
	} // end main()

} // end AccessMain07
