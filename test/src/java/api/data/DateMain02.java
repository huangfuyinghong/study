package java.api.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain02 {

	public static void main(String[] args) {
		
		// 날짜를 원하는 형식(format)으로 출력 
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateString = sdf.format(currentDate);
		System.out.println(dateString);
		
		sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
		dateString = sdf.format(currentDate);
		System.out.println(dateString);
		
	} // end main() 

} // end DateMain02
