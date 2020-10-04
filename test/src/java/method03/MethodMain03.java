package java.method03;

import java.util.Scanner;

public class MethodMain03 {

	public static void main(String[] args) {
		// 1. 국어, 영어, 수학 점수를 입력받아서 저장  
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 입력: ");
		int kor = sc.nextInt();
		System.out.println("영어 입력: ");
		int eng = sc.nextInt();
		System.out.println("수학 입력: ");
		int math = sc.nextInt();
		sc.close();
		
		// 2. 입력받은 점수를 출력 
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		
		// 3. public static int calcTotal(int kor, int eng, int math)
		// 메소드를 정의하고, 함수를 호출하여 세 과목의 평균을 출력 
		int total = calcTotal(kor, eng, math);
		System.out.println("합계: " + total);
		
		// 4. public static double calcAverage(int total)
		// 메소드를 정의하고, 함수를 호출하여 세 과목의 평균을 출력(소수점까지 정확하게)
		double avg = calcAvg(total);
		System.out.println("평균 : " + avg);
		
		// 5. public static char calcGrade(double avg) 메소드를 정의하고 함수를 호출하여 성적을 출력 
				// 성적 출력 방식 
				//   100 ~ 90 : A
				//   89 ~ 80 : B
				//   79 ~ 70 : C
				//   69 ~ 0 : F
		char grade = calcGrade(avg);
		System.out.println("학점: " + grade);
		

	} // end main()
	
	
	
	// // #3 메소드 정의  ( 합 )
	public static int calcTotal(int kor, int eng, int math) { 
		return kor + eng + math;
	}
	
	// Alt + Shift + R : 이름 변경 단축키 
	
	// #4 메소드 정의  ( 평균 ) 
	public static double calcAvg(int total) { 
		return total / 3.0;
	}
	
	// #5 메소드 정의 ( 등급 ) 
	public static char calcGrade(double avg) { 
	char grade; 
	if(avg >= 90) { 
		grade = 'A';
	} else if(avg >=80) {
		grade = 'B';
	} else if(avg >= 70) { 
		grade = 'C';
	} else { 
		grade = 'F';
	} 
	return grade;
  }

} // end MethodMain03
