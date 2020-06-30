package sec06.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() { //synchronized 붙어줘야 함.
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify(); //일시정지 상태에 있는 다른 스레드(ThreadB)를 실행 대기 상태로 만듬
		try {
			wait(); //ThreadA자신은 일시정지 상태로 만듬
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify(); //일시정지 상태의 다른 스레드(ThreadA)를 실행대기상태로
		try {
			wait();// 자기 자신(ThreadB)는 일시정지 상태로
		} catch (InterruptedException e) {
		}
	}
}
