package sec06.exam02_yield;

public class ThreadB extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	@Override
	public void run() {
		while(!stop) {//stop�� true�� �Ǹ� while�� ����
			if(work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				Thread.yield();//work�� false�� �Ǹ� �ٸ� �����忡�� ���� �纸
			}
		}
		System.out.println("ThreadB ����");
	}
}

