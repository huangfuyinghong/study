package java.class02;

//Ŭ������ ���� ���: 
//����(�Ӽ�, ����) - ��� ����(field,property)
//��� - �޼ҵ�
//������(constructor) : ��� �������� �ʱ�ȭ. ��ü ���� �� ȣ��Ǵ� �Լ� 
//> Ŭ������ �̸��� ����. �Ű������� ���� ���� �ְ�, ���� ���� ����  
//> Ŭ������ �ۼ��� �� �����ڸ� �ϳ��� �������� ���� ���, �ڹ� �����Ϸ��� �⺻ �����ڸ� �ڵ����� ����� ��. 
//> �����ڸ� �ϳ��� ������ ��쿡�� , �ڵ����� �⺻ �����ڸ� ������ ����! 

public class MyRectangle {
	
	// ��� ����
	double width; // ���簢���� ���� 
	double height; // ���簢����  ����
	
	//�⺻ ������ 
	public MyRectangle() {}

    // �Ű������� �ִ� ������ 
	public MyRectangle(double w, double h) { 
		width = w;
		height = h;
	}
	
	// �޼ҵ� 
	public double calcArea() { 
		return width * height;
	} // end calcArea()

} // end MyRectangle
