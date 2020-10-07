package java.access_homework;

public class Homework {

	public static void main(String[] args) { 
		
		Point pt1 = new Point(0,0);
		System.out.println("point1 : " + "(" + pt1.getX() + ", "+ pt1.getY() +")" );
		
		Point pt2 = new Point(5, 4);
		System.out.println("point2 : " + "(" + pt2.getX() + ", "+ pt2.getY() +")" );
		
		double d = pt1.distance(pt2);
		System.out.println("°Å¸® : " + d);
	}
}
