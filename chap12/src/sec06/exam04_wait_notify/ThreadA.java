package sec06.exam04_wait_notify;

public class ThreadA extends Thread {
	private WorkObject workObject; //������ü�� �Ű������� �޾� �ʵ忡 ����

	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() { //������ü�� methodA()�� 10�� �ݺ� ȣ��
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}

