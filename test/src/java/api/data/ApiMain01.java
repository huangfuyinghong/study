package java.api.data;

import java.util.Date;

public class ApiMain01 {

	public static void main(String[] args) {
		
		// �ý����� ���� �ð� ���� 
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		// 1970�� 1�� 1�� 0�� 0�� 0�ʸ� ����(0)���� ��Ƽ� 
		// milli-second(1/1000��)���� 1�� ������Ű �� 
		
		System.out.println();
		Date date2 = new Date(0L);  // ���� �ð����� �ʱ�ȭ 
		System.out.println(date2);
		Date date3 = new Date(1000L);  // ���� �ð� +1��
		System.out.println(date3);
		
//		Date date4 = new Date(2020-1900, 9, 6);
//		System.out.println(date4);

	} // end main() 

} // end DataMain01
 