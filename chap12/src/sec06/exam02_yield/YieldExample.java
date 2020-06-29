package sec06.exam02_yield;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();	//ThreadA, ThreadB ��� ����
		threadA.start();		
		threadB.start();
		//ó�� ���� �� 3�� ���� ThreadA��  ThreadB�� �����ư��� �����
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = false; //ThreadB�� ����
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = true; // ThreadA, ThreadB ��� ����
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.stop = true; // ThreadA, ThreadB ��� ����
		threadB.stop = true;
	}
}
