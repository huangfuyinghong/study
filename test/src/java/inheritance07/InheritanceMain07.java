package java.inheritance07;

class ParentClass { 
	private int x; 
	
	public ParentClass(int x) { 
		this.x = x;
		System.out.println("ParentClass(x) 생성자");
	}
	
	public int getX() { 
		return x;
	}
	
} // end ParentClass

class ChildClass extends ParentClass { 
	
	private int y; 
	
	public ChildClass(int x, int y) { 
		super(x);
		this.y = y;
		System.out.println("ChildClass(x, y) 생성자");
	}
	
	public int getY() { 
		return y;
	}
	
} // end ChildClass 


public class InheritanceMain07 {

	public static void main(String[] args) {
		
		ParentClass test1 = new ParentClass(100);
		System.out.println();
		ParentClass test2 = new ChildClass(100, 200);
		System.out.println();
		
		System.out.println(test2.getX());
//에러		System.out.println(test2.getY());
		// test2는 ParentClass 타입으로 선언했기 때문에 
		// ChildClass에서 정의한 getY() 메소드를 사용할 수 없음 
		// 강제 형변환(casting)을 하면, ChildClass가 가지고 있는 메소드 사용 가능 
		System.out.println();
		System.out.println(((ChildClass)test2).getY());
		
		// instanceof 키워드 
		// - 참조변수 instanceof 클래스 이름 
		// - 명시한 클래스 타입의 인스턴스와 같으면 true, 아니면 false를 리턴  
		
		System.out.println(test2 instanceof ChildClass);
		if (test2 instanceof ChildClass) { 
			System.out.println("x = " + test2.getX());
			System.out.println("y = " + ((ChildClass)test2).getY());
		} else { 
			System.out.println("x = " + test2.getX());
		}

	} // end main() 

} // InheritanceMain07 
