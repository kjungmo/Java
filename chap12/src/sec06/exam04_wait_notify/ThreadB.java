package sec06.exam04_wait_notify;

public class ThreadB extends Thread {
	private WorkObject workObject;

	public ThreadB(WorkObject workObject) {
		this.workObject = workObject; //������ü�� �Ű������� �޾� �ʵ忡 ����
	}
	
	@Override
	public void run() { //������ü�� methodB()�� 10�� �ݺ� ȣ��
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
}
