package java.api.data;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class dateMain04 {

	public static void main(String[] args) {
		
		Calendar cal = new GregorianCalendar(2020,8,17);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		String str = String.format("%d-%02d-%002d", year, month, day);
		System.out.println(str);
		
		System.out.println();
		// Calendar�� SimpleDateFormat���� ǥ�� 
		// Calendar ��ü -> Date ��ü�� ��ȯ -> SimpleDateFormat ����ϴ� ��
		Calendar birth = new GregorianCalendar(1900,0,1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String birthString = sdf.format(birth);
		System.out.println(birthString);

	} // end main()

} // end DateMain04
