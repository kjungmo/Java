package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {		//이 인터페이스를 구성하는 클래스를 선언하겠다.
			//이런 클래스를 선언함과 동시에 그 클래스의 생성자를 호출해서
			//객체를 만들겠다는 뜻.
			@Override
			public void turnOn() {	}

			@Override
			public void turnOff() {	}

			@Override
			public void setVolume(int volume) {	}
			
		};
		RemoteControl rc2 = new RemoteControl() {		//이 인터페이스를 구성하는 클래스를 선언하겠다.
			//이런 클래스를 선언함과 동시에 그 클래스의 생성자를 호출해서
			//객체를 만들겠다는 뜻.
			@Override
			public void turnOn() {	}

			@Override
			public void turnOff() {	}

			@Override
			public void setVolume(int volume) {	}
			
		};
	}

}
