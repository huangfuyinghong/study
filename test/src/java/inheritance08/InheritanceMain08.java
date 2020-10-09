package java.inheritance08;

public class InheritanceMain08 {

	public static void main(String[] args) {
		
		// Employee 클래스 타입의 배열을 선언 
		Employee[] emps = { 
				new Employee("홍길동"),
				new Manager("고길동", "과장")
		};
		
		emps[0].test();
		emps[1].test();
		
		for (Employee e : emps) { 
			EmpUtil.printEmpInfo(e);
			System.out.println("--------------------");
		}

	} // end main()

} // end InheritMain08
