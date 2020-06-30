package sec06.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() { //synchronized �پ���� ��.
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify(); //�Ͻ����� ���¿� �ִ� �ٸ� ������(ThreadB)�� ���� ��� ���·� ����
		try {
			wait(); //ThreadA�ڽ��� �Ͻ����� ���·� ����
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify(); //�Ͻ����� ������ �ٸ� ������(ThreadA)�� ��������·�
		try {
			wait();// �ڱ� �ڽ�(ThreadB)�� �Ͻ����� ���·�
		} catch (InterruptedException e) {
		}
	}
}
