package java.api.wrapper;

// Wrapper Ŭ���� : �ڹ��� �⺻ ������ Ÿ���� ���δ� Ŭ���� 
// - �⺻ �ڷ��� : boolean, byte, short, int, long, char, float, double
//- Wrapper Ŭ���� : Boolean, Byte, Short, Integer, Long, Character, Float, Double
// - Wrapper Ŭ������ ����ϴ� ���� : 
// 1. Ŭ������ �޼ҵ�(���), ���(public static final)�� ����ϱ� ���ؼ� 
// 2. �Ű����� Object�� ���� �޼ҵ��� ���ڰ����� ����ϱ� ���ؼ� 
// 3. �÷��� �����ӿ�ũ���� ����ϱ� ���ؼ�  

public class WapperMain01 {

	public static void main(String[] args) {
		// Wrapper Ŭ������ ��� 
		System.out.println("byte Ÿ���� �ּҰ� : " + Byte.MIN_VALUE );
		System.out.println("byte Ÿ���� �ִ밪 : " + Byte.MAX_VALUE);
		System.out.println("int Ÿ���� �ּҰ� : " + Integer.MIN_VALUE);
		System.out.println("int Ÿ���� �ִ밪 : " + Integer.MAX_VALUE);
		
		System.out.println();
		int n1 = 123; // �⺻�ڷ���  
		Integer num1 = new Integer(123); // wrapper Ŭ���� 
		System.out.println("num1 = " + num1);
		
		int value1 = num1.intValue();
		System.out.println("value1 = " + value1) ;
		
		System.out.println();
		Double num2 = new Double(1.23);
		System.out.println("num2 = " + num2);
		
		double value2 = num2.doubleValue();
		System.out.println("value2 = " + value2);
		
		System.out.println();
		// Wrapper Ŭ������ �ִ� static �޼ҵ带 ����Ͽ� �ν��Ͻ� ���� 
		// valueOf() �Լ� 
		Integer num3 = Integer.valueOf(100); // int Ÿ���� ���� Integer Ÿ���� ������ ���� 
		System.out.println("num3 = " + num3);
		
		Double num4 = Double.valueOf(3.14); // double Ÿ���� ���� Double Ÿ���� ������ ���� 
		System.out.println("num4 = " + num4 );
		
		Integer num5 = Integer.valueOf("200"); // ���ڿ� ������ '����'�� Integer Ÿ���� ������ ���� 
		System.out.println("num5 = " + num5);
		
		System.out.println();
		// parseXxx() : 
		// ���ڿ��� ���޹޾Ƽ�, �ں� �ڷ������� �������ִ� static �޼ҵ� 
		int x = Integer.parseInt("123456");
		System.out.println("x = " + x);
		
		double y = Double.parseDouble("3.141592");
		System.out.println("y = " + y);
		

	} // end main() 

} // end WarrerMain01
