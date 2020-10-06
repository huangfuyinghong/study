package java.access07;

public class AccessMain07 {

	public static void main(String[] args) {
		
		MyNumber num1 = new MyNumber();
		System.out.println(num1); // 인스턴스의 참조값(주소값) 출력 
		System.out.println(num1.getNumber());
		
		MyNumber num2 = new MyNumber(10);
		System.out.println(num2.getNumber());
		
		// num1의 메소드 add() 호출  
		MyNumber result = num1.add(num2);
		System.out.println(result.getNumber());
		
		System.out.println(" ===================== ");
		MyNumber x = new MyNumber(1);
		MyNumber y = new MyNumber(2);
		MyNumber z = new MyNumber(3);
		MyNumber end = new MyNumber(4);
		
		x.add(y).add(z).add(end);
		System.out.println(x.getNumber());
		// 위 한줄로 작성된 코드와 동일한 과정 
		MyNumber r1 = x.add(y);
		MyNumber r2 = r1.add(z);
		MyNumber r3 = r2.add(end);
		System.out.println(r3.getNumber());
		
	} // end main()

} // end AccessMain07
