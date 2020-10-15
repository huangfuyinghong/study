package java.api.wrapper;

import java.math.BigInteger;

// BigInter : ������ �� �ִ� �������� �Ѱ谡 ���� Ŭ���� 
// BigDecimal : �Ǽ� ����� ������ ���̰ų� ���ֱ� ���ؼ� ������� Ŭ���� 
// auto boxing�� auto unboxing ����� �������� ����  
// -> �����ڸ� ȣ���Ͽ� �ν��Ͻ��� �����ؾ� �� 
// -> �������(+, -, *, /)�� �޼ҵ带 ����ؾ� �� 

public class WrapperMain04 {

	public static void main(String[] args) {
		// long n = 1111111111111111111111111111L; 
		// long Ÿ�Ե� ���� �� �� �ִ� �Ѱ谡 ���� 
		BigInteger big = new BigInteger("11111111111111111111111111");
		System.out.println(big);
		
		// BigInteger �������� �Ű������� ���ڿ� 
		// ����: ���� ū ���� ���ͷ��� ������ �� �ִ� �⺻Ÿ���� ���� ������  
		BigInteger x = new BigInteger("10");
		System.out.println(big.add(x));
		

	} // end main() 

} // end WrapperMain04
