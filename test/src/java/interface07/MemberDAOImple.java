package java.interface07;

// DAO(Data Access Object) : MVC ���Ͽ��� constroller Ŭ���� 
// - �������� ������ ����ϴ� ���� 
public class MemberDAOImple implements MemberDAO {

	// --------------------------------------------- // 
	// Singleton ������ ���� ���� ����  
	
	// 1. private static �ڱ� �ڽ� Ÿ���� ��� ���� ���� 
	private static MemberDAOImple instance = null; 
	
	// 2. private ������ 
	private MemberDAOImple() {} 
	
	// 3. public static �޼ҵ� - �ν��Ͻ��� �����ϴ� �޼ҵ� ���� 
	public static MemberDAOImple getInstance() { 
		if (instance == null) { 
			instance = new MemberDAOImple(); 
		}
		return instance;
	}
	
	// Singleton ������ ���� ���� �� 
	// ---------------------------------------------- // 
	
	public static final int MAX = 100; // �ִ� ȸ���� 
	private MemberVO[] list = new MemberVO[MAX]; // ȸ�� ������ ������ �迭 
	private int count; // �迭�� ����� ������ ����  
	
	public int getCount() { 
		return count;
	}
	
	@Override
	public int insert(MemberVO vo) { 
		System.out.println(vo);
		// UI Ŭ����(main)�� �������� ȸ�� ������ �迭�� ���� 
		list[count] = vo;
		count++;
		return 1;  // 0 : ����, 1 : ���� 
	}
	
	@Override
	public MemberVO[] select() { 
		// ��ü ȸ�� ����(MemberVO[])�� ���� 
		return list;
	}
	
	@Override
	public MemberVO select(int index) { 
		// ���õ�(index) ȸ�� ����(MemberVO)�� ���� 
		return list[index];
	}
	
	@Override
	public int update(int index, MemberVO vo) { 
		list[index].setPw(vo.getPw());
		list[index].setEmail(vo.getEmail());
		return 1;  // 0 : ����, 1 : ����
	}
	
}
