package java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		
		// Scores 클래스의 인스턴스 생성
		Scores scores1 = new Scores(10, 20, 30);
		System.out.println("국어: " + scores1.kor);
		System.out.println("영어: " + scores1.eng);
		System.out.println("수학: " + scores1.math);
		System.out.println("총점: " + scores1.calcTotal());
		System.out.println("평점: " + scores1.calcAverage());
		
		
		int stuNo = 10;
		String name = "mok";
		// Student 클래스의 인스턴스 생성
		Student stu1 = new Student(stuNo, name, scores1);
//		Student stu1 = new Student(10, "Mok", scores1);
		
		stu1.displayStudentInfo();

	} // end main()

} // end ClassMain04
