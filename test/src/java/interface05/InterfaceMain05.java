package java.interface05;

import java.util.Scanner;

public class InterfaceMain05 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {  // 무한 루프
			System.out.println("------------------------------");
			System.out.println("0.종료| 1.입력| 2.검색");
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
				System.out.println("다시 선택하세요.");
				
			}
		}

	} // end main() 

} // end InterfaceMain05
