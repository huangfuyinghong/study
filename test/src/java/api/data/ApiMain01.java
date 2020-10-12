package java.api.data;

import java.util.Date;

public class ApiMain01 {

	public static void main(String[] args) {
		
		// 시스템의 현재 시간 정보 
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		// 1970년 1월 1일 0시 0분 0초를 기준(0)으로 삼아서 
		// milli-second(1/1000초)마다 1씩 증가시키 값 
		
		System.out.println();
		Date date2 = new Date(0L);  // 기준 시간으로 초기화 
		System.out.println(date2);
		Date date3 = new Date(1000L);  // 기준 시간 +1초
		System.out.println(date3);
		
//		Date date4 = new Date(2020-1900, 9, 6);
//		System.out.println(date4);

	} // end main() 

} // end DataMain01
 