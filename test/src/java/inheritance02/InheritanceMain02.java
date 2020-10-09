package java.inheritance02;

public class InheritanceMain02 {

	public static void main(String[] args) {
		
		// Person 클래스의 인스턴스 생성 
		Person p1 = new Person(); 
		System.out.println(p1);
		
		System.out.println(" ============================= ");
		
		// BusinessPerson 클래스의 인스턴스 생성 
		BusinessPerson p2 = new BusinessPerson(); 
		
		System.out.println(" ============================= ");
		BusinessPerson p3 = new BusinessPerson("아이언맨", "삼성");
		

	} // end main() 
 
} // end InheritanceMain02
