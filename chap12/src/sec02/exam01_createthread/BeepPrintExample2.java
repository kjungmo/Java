package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//how1
		Runnable beepTask = new BeepTask();  //작업 객체 생성하고 이것을 매개값으로 해서
		Thread thread = new Thread(beepTask); // 위의 매개값으로 작업 스레드를 생성한다. 
		
		//how2 Runnable 익명 객체 이용
		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});*/
		
		//how3 람다식 이용
		/*Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		});*/
		
		thread.start(); // 위 4라인의 작업 스레드의 start()메소드를 호출하면 
		// 작업스레드에 의해 BeepTask 객체의 run()메소드가 실행되어 비프음이 발생
		// 동시에 메인 스레드는 아래의 for문을 실행시켜 0.5초 간격으로 문자열을 출력함
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}


