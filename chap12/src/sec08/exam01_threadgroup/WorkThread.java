package sec08.exam01_threadgroup;

public class WorkThread extends Thread { //threadGroup�� ���Եȴ�
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName); //���� �������� �����ڸ� ȣ���Ѵ�. ������ �׷�� �̸��� ����
	}
	
	@Override
	public void run() {
		while(true) { //���� ����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted");
				break; //InterruptedException�� �߻��Ǹ� while���� �������� �����带 �����Ŵ
			}
		}
		System.out.println(getName() + " �����");
	}
}
