package sec06.exam02_yield;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();	//ThreadA, ThreadB 모두 실행
		threadA.start();		
		threadB.start();
		//처음 실행 수 3초 동안 ThreadA와  ThreadB가 번갈아가며 실행됨
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = false; //ThreadB만 실행
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = true; // ThreadA, ThreadB 모두 실행
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.stop = true; // ThreadA, ThreadB 모두 종료
		threadB.stop = true;
	}
}
