package sec08.exam01_threadgroup;

public class WorkThread extends Thread { //threadGroup에 포함된다
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName); //상위 스레드의 생성자를 호출한다. 스레드 그룹과 이름을 설정
	}
	
	@Override
	public void run() {
		while(true) { //무한 루프
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted");
				break; //InterruptedException이 발생되면 while문을 빠져나와 스레드를 종료시킴
			}
		}
		System.out.println(getName() + " 종료됨");
	}
}
