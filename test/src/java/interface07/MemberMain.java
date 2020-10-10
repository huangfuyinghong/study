package java.interface07;

import java.util.Scanner;

// MVC ������ ���Ͽ��� View Ŭ����

public class MemberMain {
	
	// ��� ���� 
	private static Scanner sc; 
	private static MemberDAO dao;  // MemberDAOImple �ν��Ͻ��� ������ ���� 

	public static void main(String[] args) {
		
		System.out.println("ȸ�� ���� ���α׷�");
		sc = new Scanner(System.in);
		dao = MemberDAOImple.getInstance(); // ������. �ν��Ͻ� ���� 
		
		boolean run = true; 
		while(run) { // ���� ����
			showMainMenu();
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice ) { 
			case Menu.Quit : 
				run = false;
				break;
			case Menu.INSERT : 
				insertMember();
				break;
			case Menu.SELECT_ALL : 
				selectAll();
				break;
			case Menu.SELECT_BY_INDEX :
				selectbyindex();
				break;
			case Menu.UPDATE : 
				updateMember();
				break;
			default : 
				System.out.println("�ٽ� �����ϼ���.");
			} // end switch
			
		} // end while() 
		
		sc.close();
		System.out.println("���α׷� ���� ");
		

	}






	private static void showMainMenu() {
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("0. ���� | 1. ��� | 2. ��ü�˻� | 3. �ε����˻� | 4. ���� ");
		System.out.println("--------------------------------");
		System.out.println("���� >");
		
	} // end showMainMenu() 
	
	private static void insertMember() {
		System.out.println();
		System.out.println(" --- ȸ������ ��� --- ");
		System.out.println(" ���̵� �Է� > ");
		String id = sc.nextLine();
		System.out.println(" ��й�ȣ �Է�>");
		String pw = sc.nextLine();
		System.out.println(" �̸��� �Է�>");
		String email = sc.nextLine();
		
		MemberVO vo = new MemberVO(id, pw, email);
		
		int result = dao.insert(vo);
		if (result == 1) { 
			System.out.println("ȸ�� ��� ����");
		}
		
	} // end insertMenber()  
	
	private static void selectAll() {
		// dao�� select() �޼ҵ� ȣ�� -> ȸ������ �迭�� ���� 
		MemberVO[] list = dao.select();
		
		int count = ((MemberDAOImple) dao).getCount();
		for(int i = 0; i < count; i++) { 
			System.out.println("ȸ������[" + i + "]");
			System.out.println(list[i]);
		}
		
	} // end selectAll() 
	
	private static void selectbyindex() {
		System.out.println();
		System.out.println("�˻��� �ε��� �Է�>");
		int index = sc.nextInt();
		sc.nextLine();
		
		int count = ((MemberDAOImple)dao).getCount();
		if (index >= 0 && index < count) { 
			MemberVO vo = dao.select(index);
			System.out.println(vo);
		} else { 
			System.out.println("�������� �ʴ� �ε����Դϴ�.");
		}
		
	} // end selectByIndex()
	
	private static void updateMember() {
		
		System.out.println();
		System.out.println("������ �ε��� �Է�>");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("������ ��й�ȣ �Է�>");
		String pw = sc.nextLine();
		
		System.out.println("������ �̸��� �Է�>");
		String email = sc.nextLine();
		
		MemberVO vo = new MemberVO();
		vo.setPw(pw);
		vo.setEmail(email);
		
		int result = dao.update(index, vo);
		if (result == 1) { 
			System.out.println("ȸ�� ���� ���� ����");
		}
		
	}
	
	

}
