package java.interface07;

// ȸ�� ���, ��ü �˻�, �˻�, ���� �Լ� ����  
public interface MemberDAO {
	
	// ȸ�� ��� 
	public abstract int insert(MemberVO vo); 
	
	// ȸ�� ��ü ����Ʈ �˻� ��� 
	public abstract MemberVO[] select();
	
	// ȸ�� �Ѹ� ���� �� ���� �˻� ���� 
	public abstract MemberVO select(int index);
	
	// ȸ�� ���� ����  
	public abstract int update(int index, MemberVO vo);
	

}
