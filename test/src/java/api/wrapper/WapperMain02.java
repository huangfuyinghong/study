package java.api.wrapper;

public class WapperMain02 {

	public static void main(String[] args) {
		
		Integer x = new Integer(100); // boxing (Æ÷Àå) 
		Integer y = new Integer(200);
		
		int add = x.intValue() + y.intValue();  // unboxing 
		System.out.println("add = " + add);
		int add2 = x + y; // auto unboxing  
		System.out.println("add2 = " + add);
		
		Integer z = 300;
		System.out.println("z = " + z);
		

	} // end 

} // end  
