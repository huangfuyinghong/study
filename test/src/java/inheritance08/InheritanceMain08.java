package java.inheritance08;

public class InheritanceMain08 {

	public static void main(String[] args) {
		
		// Employee Ŭ���� Ÿ���� �迭�� ���� 
		Employee[] emps = { 
				new Employee("ȫ�浿"),
				new Manager("��浿", "����")
		};
		
		emps[0].test();
		emps[1].test();
		
		for (Employee e : emps) { 
			EmpUtil.printEmpInfo(e);
			System.out.println("--------------------");
		}

	} // end main()

} // end InheritMain08
