package java.inheritance02;

public class InheritanceMain02 {

	public static void main(String[] args) {
		
		// Person Ŭ������ �ν��Ͻ� ���� 
		Person p1 = new Person(); 
		System.out.println(p1);
		
		System.out.println(" ============================= ");
		
		// BusinessPerson Ŭ������ �ν��Ͻ� ���� 
		BusinessPerson p2 = new BusinessPerson(); 
		
		System.out.println(" ============================= ");
		BusinessPerson p3 = new BusinessPerson("���̾��", "�Ｚ");
		

	} // end main() 
 
} // end InheritanceMain02
