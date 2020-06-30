package sec06.exam04_wait_notify;

public class ThreadA extends Thread {
	private WorkObject workObject; //공유객체를 매개값으로 받아 필드에 저장

	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() { //공유객체의 methodA()를 10번 반복 호출
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}

