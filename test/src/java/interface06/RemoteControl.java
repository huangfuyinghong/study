package java.interface06;

// ��� : IS-A ���谡 ������ �� 
// - ����Ʈ TV�� TV�̴�. (SmartTV is a TV)
// - class SmartTv extends BasicTv {...}

// ����(�������̽�) : HAS-A ���谡 ������ �� 
// - TV�� �������� ������ �ִ�. (TV has a remote controller) 
// - class BasicTv implements RemoteControl {...}

// �������̽� Ȱ�� : �߻� �޼ҵ常 ����Ͽ� Ȱ�� 
public interface RemoteControl {
	public abstract void turnOn();
	public abstract void turnOff();

} // end RemoteControl
