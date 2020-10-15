package java.api.wrapper;

import java.util.Scanner;

public class WrapperMain03 {

	public static void main(String[] args) {
		
		// 다음 문자열에서 숫자들을 구분하여 합을 구하시오 
		// 예시) 2020 + 9 + 17 + 11 + 43 + 10
		
		String str = "2020년 9월 17일 11:43:10";
		// String[] result = str.split("년|월|일|:");
		String[] result = str.split("[^0-9]+");
		// ^0-9 : 숫자가 아닌것 
		// []+ 한 번 이상  
		// [^0-9]+ : 숫자가 아닌 것이 한번 이상 있는 경우 
		int sum = 0; 
		for(String x : result) { 
			System.out.println(x);
			sum += Integer.parseInt(x);
		}
		System.out.println(sum);
		
		// 입력받은 문자열에서 숫자만 출력 
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
