package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepThread extends Thread { // 작업 스레드가 실행할 작업을 Runnable로 만들지 않고
	// Thread의 하위 클래스로 작업 스레드를 정의하면서 작업 내용을 포함시킬 수 있다.
	@Override //Thread 클래스를 상속한 후 run()메소드를 재정의해서 스레드가 실행할 코드를 작성
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		} //여기까지가 스레드 실행 내용이다
	}
}

