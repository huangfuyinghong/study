package java.interface06;

// 상속 : IS-A 관계가 성립할 때 
// - 스마트 TV는 TV이다. (SmartTV is a TV)
// - class SmartTv extends BasicTv {...}

// 구현(인터페이스) : HAS-A 관계가 성립할 때 
// - TV는 리모콘을 가지고 있다. (TV has a remote controller) 
// - class BasicTv implements RemoteControl {...}

// 인터페이스 활용 : 추상 메소드만 사용하여 활용 
public interface RemoteControl {
	public abstract void turnOn();
	public abstract void turnOff();

} // end RemoteControl
