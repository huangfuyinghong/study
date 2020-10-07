package java.access010; 
    
// �̱��� ������ ���� (singleton design pattern)
// - Ŭ������ �ν��Ͻ��� ���� �ϳ��� ������ �� �ֵ��� �ۼ��ϴ� ���� ���  
// 1. Ŭ���� �ڽ� Ÿ���� private static ������ ���� 
// 2. �����ڴ� private���� ����  
// 3. public static �޼ҵ带 �����Ͽ� �ν��Ͻ��� ������ �� �ֵ��� �� 

public class Captain {
	
	// ��� ���� 
	private String name; 
	
	// 1. private static Captain ������ ���� 
	private static Captain instance = null;  
	
	// 2. private ���� 
	private Captain() {} 
	
	// 3. public static �޼ҵ带 �����Ͽ� �ν��Ͻ� ����  
	public static Captain getInstance() { 
		if(instance == null) {  // �ν��Ͻ��� ���� ������ �ȵ� ���  
			instance = new Captain();  // �ν��Ͻ� ���� 
		} // �� �� ������ ���Ŀ��� new�� �������� ���� 
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
