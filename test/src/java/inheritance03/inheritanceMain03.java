package java.inheritance03;

public class inheritanceMain03 {

	public static void main(String[] args) {
		
		SmartPhone phone1 = new SmartPhone();
		System.out.println(phone1);
		
		SmartPhone phone2 = new SmartPhone("010-1111-1111");
		System.out.println(phone2);
		
		SmartPhone phone3 = new SmartPhone("010", "111.222.333.444");
		System.out.println(phone3);
		
	} // end main() 

} // end inheritanceMain03
