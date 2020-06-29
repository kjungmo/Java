package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		//how1
		Thread thread = new BeepThread(); // BeepThread 객체를 생성
		
		//how2 
		/*Thread thread = new Thread() {
			@Override
			public void run() {		
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		};*/
		
		
		thread.start();		// start()메소드 호출하여 BeepThread가 run()메소드 실행
		
		for(int i=0; i<5; i++) { // 위에서 BeepThread가 run()메소드 실행함과 동시에 for문 실행
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

