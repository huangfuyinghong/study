package java.api.string;

public class StringMain02 {

	public static void main(String[] args) {
		
		// String literal과 생성자 호출의 차이 
		// - 생성자는 호출할 때 마다 새로운 인스턴스가 생성됨(주소값이 다름) 
		String str1 = new String("abc");
		String str2 = new String("abc");
		if (str1 == str2) { 
			System.out.println("같은 참조");
		} else { 
			System.out.println("다른 참조");
		}
		
		// 문자열 리터럴을 사용하여 초기화하는 경우 
		// 리터럴이 없으면 새로 인스턴스를 생성하지만  
		// 이미 리터럴이 만들어져 있는 경우는 
		// 인스턴스를 생성하지 안고, 기존의 인스턴스를 재활용 
		String str3 = "abc";
		String str4 = "abc";
		if(str3 == str4) { 
			System.out.println("같은 참조");
		} else { 
			System.out.println("다른 참조");
		}

	} // end main() 

} // end StringMain02
