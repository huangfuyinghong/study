package java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		
		// Scores Ŭ������ �ν��Ͻ� ����
		Scores scores1 = new Scores(10, 20, 30);
		System.out.println("����: " + scores1.kor);
		System.out.println("����: " + scores1.eng);
		System.out.println("����: " + scores1.math);
		System.out.println("����: " + scores1.calcTotal());
		System.out.println("����: " + scores1.calcAverage());
		
		
		int stuNo = 10;
		String name = "mok";
		// Student Ŭ������ �ν��Ͻ� ����
		Student stu1 = new Student(stuNo, name, scores1);
//		Student stu1 = new Student(10, "Mok", scores1);
		
		stu1.displayStudentInfo();

	} // end main()

} // end ClassMain04
