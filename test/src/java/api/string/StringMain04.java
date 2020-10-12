package java.api.string;

public class StringMain04 {

	public static void main(String[] args) {
		
		// length() : ���ڿ��� ���̸� ���� 
		String str1 = "abc";
		String str2 = "Hello";
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println();
		
		// equals() : ���ڿ��� ������ ��  
		// Object Ŭ������ equals() �޼ҵ带 override��  
		System.out.println(str1.equals(str2));
		
		System.out.println();
		// equalsIgnoreCase() : ��ҹ��� �������� ��  
		String str3 = "hello";
		String str4 = "Hello";
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		
		System.out.println();
	    // charAt(int) : ���ڿ� �߿��� �ش� �ε����� ���� �ϳ��� ����  
		System.out.println(str3.charAt(1));
		
		System.out.println();
		// indexOf() : �ش� ���� �Ǵ� ���ڿ��� ó������ �����ϴ� �ε��� 
		// lastIndexOf() : ���� �Ǵ� ���ڿ��� ���� ���������� �����ϴ� �ε���  
		String str5 = "Hello, world";
		System.out.println(str5.indexOf("l"));
		System.out.println(str5.indexOf("world"));
		System.out.println(str5.lastIndexOf("l"));
		
		System.out.println();
		// startWith(String) : �ش� ���ڿ��� �����ϴ� �� �ƴ��� 
		String str6 = "https://www.goole.com";
		System.out.println(str6.startsWith("https://"));
		
		System.out.println();
		// contains(String) : �ش� ���ڿ��� �����ϴ��� �ƴ���  
		System.out.println(str6.contains("google"));
		
		System.out.println();
		// split() : ���ڿ��� Ư�� �������� ���� (�迭�� ����) 
		String str7 = "2020.9.16";
		String[] result = str7.split(".");
		// Ư�� ��ȣ(.$|()[{^?*+\\) ����� ��ȣ �վ� "\\"�� �ٿ��־�� ��
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
		// compareTo(String) : �ش� ���ڿ��� ���ؼ� ���� �ٸ� ������ ���� ����  
		// compareToIgnoreCase(String) : �ش� ���ڿ��� ��ҹ��� ���о��� �� �� ���� �ٸ� ������ ���� ���� 
		
		String str10 = "abc";
		String str11 = "bbc";
		System.out.println(str10.compareTo("abc"));
		System.out.println(str10.compareTo("ab"));
		System.out.println(str10.compareTo("a"));
		System.out.println(str10.compareTo("c"));
		System.out.println(str10.compareTo(str11));
		System.out.println("".compareTo(str10));
		
		System.out.println();
		// toUpperCase() : ���ڿ��� �빮�ڷ� ���� 
		// toLowerCase() : ���ڿ��� �ҹ��ڷ� ���� 
		String str12 = "Hello, Java!";
		System.out.println(str12.toUpperCase());
		System.out.println(str12.toLowerCase());
		
		System.out.println();
		// substring(begin, end) : begin���� end���� ���ڿ��� ����  
		// begin�ε����� ����, end�ε����� ���Ե��� ���� 
		System.out.println(str12.substring(0, 5)); // 0<= index < 5 
		int begin = str12.indexOf("J");
		int end = str12.length() - 1;
		System.out.println(str12.substring(begin, end));
		
		System.out.println();
		// concat() : ���ڿ��� �̾��ִ� �޼ҵ�  
		System.out.println(str12.concat("World!"));
		

	} // end main() 

} // end StringMain04
