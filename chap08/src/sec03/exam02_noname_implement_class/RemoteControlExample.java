package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {		//�� �������̽��� �����ϴ� Ŭ������ �����ϰڴ�.
			//�̷� Ŭ������ �����԰� ���ÿ� �� Ŭ������ �����ڸ� ȣ���ؼ�
			//��ü�� ����ڴٴ� ��.
			@Override
			public void turnOn() {	}

			@Override
			public void turnOff() {	}

			@Override
			public void setVolume(int volume) {	}
			
		};
		RemoteControl rc2 = new RemoteControl() {		//�� �������̽��� �����ϴ� Ŭ������ �����ϰڴ�.
			//�̷� Ŭ������ �����԰� ���ÿ� �� Ŭ������ �����ڸ� ȣ���ؼ�
			//��ü�� ����ڴٴ� ��.
			@Override
			public void turnOn() {	}

			@Override
			public void turnOff() {	}

			@Override
			public void setVolume(int volume) {	}
			
		};
	}

}
