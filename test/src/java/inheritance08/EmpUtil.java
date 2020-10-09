package java.inheritance08;

public class EmpUtil {

	// Employee
	// |_ Manager
	
	public static void printEmpInfo(Employee emp) { 
		if (emp instanceof Manager) { // �ΰ��� Manager ��ü�� ��� 
			Manager m = (Manager) emp; // ���� ����ȯ(casting)
			System.out.println("�̸� : " + m.getName());
			System.out.println("��å : " + m.getType());
		} else if(emp instanceof Employee) { // ���ڰ��� Employee ��ü�� ��� 
			System.out.println("�̸� : " + emp.getName());
		} else { // �� �� �ƴ� ���
			System.out.println("������ �ƴմϴ�.");
		}
	}
	
} // end EmpUtil
