package java.api.wrapper;

import java.util.Scanner;

public class WrapperMain03 {

	public static void main(String[] args) {
		
		// ���� ���ڿ����� ���ڵ��� �����Ͽ� ���� ���Ͻÿ� 
		// ����) 2020 + 9 + 17 + 11 + 43 + 10
		
		String str = "2020�� 9�� 17�� 11:43:10";
		// String[] result = str.split("��|��|��|:");
		String[] result = str.split("[^0-9]+");
		// ^0-9 : ���ڰ� �ƴѰ� 
		// []+ �� �� �̻�  
		// [^0-9]+ : ���ڰ� �ƴ� ���� �ѹ� �̻� �ִ� ��� 
		int sum = 0; 
		for(String x : result) { 
			System.out.println(x);
			sum += Integer.parseInt(x);
		}
		System.out.println(sum);
		
		// �Է¹��� ���ڿ����� ���ڸ� ��� 
		System.out.println("================");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		String[] list = input.split("[^0-9]+)+");
		for (String x : list) { 
			System.out.println(x);
		}
		

	} // end  

}
