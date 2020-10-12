package java.api.string;

public class StringMain04 {

	public static void main(String[] args) {
		
		// length() : 문자열의 길이를 리턴 
		String str1 = "abc";
		String str2 = "Hello";
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println();
		
		// equals() : 문자열의 내용을 비교  
		// Object 클래스의 equals() 메소드를 override함  
		System.out.println(str1.equals(str2));
		
		System.out.println();
		// equalsIgnoreCase() : 대소문자 구별없이 비교  
		String str3 = "hello";
		String str4 = "Hello";
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		
		System.out.println();
	    // charAt(int) : 문자열 중에서 해당 인덱스의 문자 하나를 리턴  
		System.out.println(str3.charAt(1));
		
		System.out.println();
		// indexOf() : 해당 문자 또는 문자열이 처음으로 등장하는 인덱스 
		// lastIndexOf() : 문자 또는 문자열이 가장 마지막으로 동작하는 인덱스  
		String str5 = "Hello, world";
		System.out.println(str5.indexOf("l"));
		System.out.println(str5.indexOf("world"));
		System.out.println(str5.lastIndexOf("l"));
		
		System.out.println();
		// startWith(String) : 해당 문자열로 시작하는 지 아닌지 
		String str6 = "https://www.goole.com";
		System.out.println(str6.startsWith("https://"));
		
		System.out.println();
		// contains(String) : 해당 문자열을 포함하는지 아닌지  
		System.out.println(str6.contains("google"));
		
		System.out.println();
		// split() : 문자열을 특정 기준으로 나눔 (배열로 저장) 
		String str7 = "2020.9.16";
		String[] result = str7.split(".");
		// 특수 기호(.$|()[{^?*+\\) 사용은 기호 앞아 "\\"를 붙여주어야 함
		for(String x : result) { 
			System.out.println(x);
		}
		
		System.out.println();
		String str8 = "C:\\Program File\\test";
		for(String x : result) { 
			System.out.println(x);
		}
		
		System.out.println();
		String str9 = "2020-09-16 14:39:00";
		// -,  , : 
		result = str9.split("-|:| ");
		for(String x : result) { 
			System.out.println(x);
		}
		
		System.out.println();
		// compareTo(String) : 해당 문자열과 비교해서 서로 다른 문자의 개수 리턴  
		// compareToIgnoreCase(String) : 해당 문자열과 대소문자 구분없이 비교 후 서로 다른 문자의 개수 리턴 
		
		String str10 = "abc";
		String str11 = "bbc";
		System.out.println(str10.compareTo("abc"));
		System.out.println(str10.compareTo("ab"));
		System.out.println(str10.compareTo("a"));
		System.out.println(str10.compareTo("c"));
		System.out.println(str10.compareTo(str11));
		System.out.println("".compareTo(str10));
		
		System.out.println();
		// toUpperCase() : 문자열을 대문자로 변경 
		// toLowerCase() : 문자열을 소문자로 변경 
		String str12 = "Hello, Java!";
		System.out.println(str12.toUpperCase());
		System.out.println(str12.toLowerCase());
		
		System.out.println();
		// substring(begin, end) : begin부터 end까지 문자열을 리턴  
		// begin인덱스는 포함, end인덱스는 포함되지 않음 
		System.out.println(str12.substring(0, 5)); // 0<= index < 5 
		int begin = str12.indexOf("J");
		int end = str12.length() - 1;
		System.out.println(str12.substring(begin, end));
		
		System.out.println();
		// concat() : 문자열을 이어주는 메소드  
		System.out.println(str12.concat("World!"));
		

	} // end main() 

} // end StringMain04
