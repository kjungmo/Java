package sec02.exam01_createthread;

import java.awt.Toolkit;
		//비프음을 발생싴틴면서 동시에 프린팅을 하려면 두 작업 중 하나를 메인 스레드가 아닌 다른
		//스레드에서 실행시켜야 함. 프린팅은 메인 스레드가 담당, 비프음은 작업 스레드가 담당하도록
		// 작업을 정의하는 Runnable 구현클래스를 이렇게 작성
public class BeepTask implements Runnable {	// Runnable 인터페이스 
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

