package java.method04;

import java.util.Scanner;

public class MethodMain04 {

	public static void main(String[] args) {
		System.out.println("배열을 매개변수로 갖는 메소드");
		
		// 점수(int) 5개를 저장할 수 있는 배열 선언 
		int[] scores = new int[5];
		
		int a = 0;
		// 기본 타입과 참조 타입의 차이 
		System.out.println(a); // 기본타입은 값을 출력 
		System.out.println(scores); // 참조 타입은 주소값을 출력 
		
		// 배열에 입력  
		inputScores(scores);
		
		// 배열값 출력 
		printScores(scores);
		
		// scores 배열에 저장된 점수들의 최대값을 출력(메소드 사용)
				// 함수이름 : findMax
				// 기능 : 배열 값 중에 최대값을 찾아서 출력  
				// 리턴타입 : void
				// 매개변수 : int[] scores
		findMax(scores);
		
		// scores 배열에 저장되 점수들의 가운데 위치한 값을 출력(메소드 사용)
		findMin(scores);
		

	} // end main()
	
	
	private static void inputScores(int[] scores) { 
		System.out.println(scores);
		// 주소값이 동이랗기 때문에 main에 있는 scores 배열에 값을 저장하는 것과 같음 
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) { 
			System.out.println("점수 " + i + ">");
			scores[i] = sc.nextInt();
		}
		sc.close();
	} // end inputScores
	
	private static void printScores(int[] scores) { 
		System.out.println("<입력한 점수>");
		for(int x : scores) { 
			System.out.println(x);
		}
	} // end printScores()
	
	private static void findMax(int[] scores) { 
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < scores.length; i++) { 
			if(max < scores[i]) { 
				max = scores[i];
			}
		}
		System.out.println("최대값: " + max);
	} // end findMax 
	
	private static void findMin(int[] scores) { 
		System.out.println(scores[scores.length/2]);
	} // end findMin

} // end MethodMain04
