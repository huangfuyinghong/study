package java.inheritance01;


//BasicTv : ����(super) Ŭ����, �θ�(parent) Ŭ����, �⺻(base) Ŭ���� 
//SmartTv : ����(sub) Ŭ����, �ڽ�(child) Ŭ����, ����(derived) Ŭ����
public class SmartTv extends BasicTv { 
	
	// ��� ����  
	private String ip;
	
	// ������ 
	public SmartTv() {}

	// getter / setter 
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	} 
	

} // end inheritance01