package java.api.string;

class Point { 
	private double x;
	private double y;
	
	public Point(double x, double y) { 
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() { 
		return "(" + x + "," + y + ")";
	}
	
	@Override
	public boolean equals(Object obj) { // Object : 모든 클래스의 super 
		boolean result = false;  // 리턴할 때 사용할 변수 
		
		if (obj instanceof Point) { // obj를 Point 클래스의 인스턴스로 변환 가능하면 
			Point pt = (Point) obj;  // 강제 형변환 
			if ( x == pt.x && y == pt.y) { // 두 개의 좌표를 비교해서 같으면  
				result = true;
			}
		}
		return result;
	}
} // end Point 


public class StringMain03 {
	
	public static void main(String[] args) { 
		Point pt1 = new Point(1, 2);
		System.out.println(pt1);
		
		Point pt2 = new Point(1, 2);
		System.out.println(pt2);
		
		if (pt1.equals(pt2)) {  // 두 개의 좌표가 같은 지 비교 
			System.out.println("같은 좌표");
		} else { 
			System.out.println("다른 좌표");
		}
	}
	

} // end StringMain03
