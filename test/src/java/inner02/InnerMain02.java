package java.inner02;

public class InnerMain02 {

	public static void main(String[] args) {
		// Car �ν��Ͻ� �� Tire �ν��Ͻ� ���� ( 2�� ) 
		
		Car car1 = new Car("���������");
		Car.Tire tire1 = car1.new Tire(20);
		tire1.display();
		
		System.out.println();
		Car car2 = new Car("K5");
		Car.Tire tire2 = car2.new Tire(15);
		tire2.display();

	} // end main() 

} // end InnerClass03
