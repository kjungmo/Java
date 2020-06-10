package sec02.exam03_abstract_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn(); // void 앞에 public abstract 가 생략되어있다 컴파일러가 자동으로 붙여준다
	void turnOff();
	void setVolume(int volume);
	
}
