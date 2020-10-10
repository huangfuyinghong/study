package java.interface05;

import java.util.Scanner;

public class InterfaceMain05 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {  // ���� ����
			System.out.println("------------------------------");
			System.out.println("0.����| 1.�Է�| 2.�˻�");
			int choice = sc.nextInt();
			switch(choice) { 
			case Menu.QUIT :
				run = false;
				System.out.println(Menu.STR_QUIT);
				break;
			case Menu.INSERT : 
				System.out.println(Menu.STR_INSERT);
				break;
			case Menu.SELECT : 
				System.out.println(Menu.STR_SELECT);
				break;
			default : 
				System.out.println("�ٽ� �����ϼ���.");
				
			}
		}

	} // end main() 

} // end InterfaceMain05
