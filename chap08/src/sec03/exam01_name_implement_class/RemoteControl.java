package sec03.exam01_name_implement_class;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn(); // void �տ� public abstract �� �����Ǿ��ִ� �����Ϸ��� �ڵ����� �ٿ��ش�
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
			
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
		
	}
}
