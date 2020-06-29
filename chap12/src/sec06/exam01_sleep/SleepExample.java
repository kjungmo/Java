package sec06.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();		
		for(int i=0; i<10; i++) {
			toolkit.beep();
			System.out.println("BEEPIN'");
			try {
				Thread.sleep(3000); //3초 동안 메인 스레드를 일시 정지 상태로 만듬
					for(int i2 = 0; i2<3 ; i2++) {
						System.out.println("WAITIN'");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {}
					}	
			} 
			catch(InterruptedException e) {}		
		}	
	}
}
