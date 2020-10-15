package java.api.wrapper;

import java.math.BigInteger;

// BigInter : 저장할 수 있는 정수값의 한계가 없는 클래스 
// BigDecimal : 실수 계산의 오차를 줄이거나 없애기 위해서 만들어진 클래스 
// auto boxing과 auto unboxing 기능을 제공하지 않음  
// -> 생정자를 호출하여 인스턴스를 생성해야 함 
// -> 산술연산(+, -, *, /)은 메소드를 사용해야 함 

public class WrapperMain04 {

	public static void main(String[] args) {
		// long n = 1111111111111111111111111111L; 
		// long 타입도 저장 할 수 있는 한계가 존제 
		BigInteger big = new BigInteger("11111111111111111111111111");
		System.out.println(big);
		
		// BigInteger 생성자의 매개변수는 문자열 
		// 이유: 아주 큰 숫자 리터럴을 저장할 수 있는 기본타입이 없기 때문에  
		BigInteger x = new BigInteger("10");
		System.out.println(big.add(x));
		

	} // end main() 

} // end WrapperMain04
