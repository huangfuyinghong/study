package java.access04;

public class AccessMain04 {

	public static void main(String[] args) {
		// ��ü ���� �� ������ ���� ���1 
	    Contact c1 = new Contact("������", "010-3242-00022-1", "iu@gmail.com");
	    c1.displayInfo();
	    
	    System.out.println();
	    c1.setPhone("010-1111-1111");
	    c1.displayInfo();
	    
	    // ��ü ���� �� ������ ���� ���2 
	    System.out.println();
	    Contact c2 = new Contact();
	    // ������ �����ϴ� �������� �̸�, ��ȭ��ȣ, �̸����� �־ 
	    // displayInfo()�� ������ּ���.
	    c2.setName("Mok");
		c2.setPhone("010-1111-1111");
		c2.setEmail("test@test.com");
		c2.displayInfo();
	    

	} // end main()

} // end AccessMain04
