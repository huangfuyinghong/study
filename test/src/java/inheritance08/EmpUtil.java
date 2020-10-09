package java.inheritance08;

public class EmpUtil {

	// Employee
	// |_ Manager
	
	public static void printEmpInfo(Employee emp) { 
		if (emp instanceof Manager) { // 인값이 Manager 객체인 경우 
			Manager m = (Manager) emp; // 강제 형변환(casting)
			System.out.println("이름 : " + m.getName());
			System.out.println("직책 : " + m.getType());
		} else if(emp instanceof Employee) { // 인자값이 Employee 객체인 경우 
			System.out.println("이름 : " + emp.getName());
		} else { // 둘 다 아닌 경우
			System.out.println("직원이 아닙니다.");
		}
	}
	
} // end EmpUtil
