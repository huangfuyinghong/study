package java.access010; 
    
// 싱글톤 디자인 패턴 (singleton design pattern)
// - 클래스의 인스턴스를 오직 하나만 생성할 수 있도록 작성하는 설계 기법  
// 1. 클래스 자신 타입의 private static 변수를 선언 
// 2. 생성자는 private으로 선언  
// 3. public static 메소드를 제공하여 인스턴스를 생성할 수 있도록 함 

public class Captain {
	
	// 멤버 변수 
	private String name; 
	
	// 1. private static Captain 변수를 선언 
	private static Captain instance = null;  
	
	// 2. private 생성 
	private Captain() {} 
	
	// 3. public static 메소드를 정의하여 인스턴스 생성  
	public static Captain getInstance() { 
		if(instance == null) {  // 인스턴스가 아직 생성이 안된 경우  
			instance = new Captain();  // 인스턴스 생성 
		} // 한 번 생성된 이후에는 new로 생성하지 않음 
		return instance; 
	}

	// getter / setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


} // end Captain
