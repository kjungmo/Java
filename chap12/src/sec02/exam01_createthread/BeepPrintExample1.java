package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {//beep 5번 반복해서 소리나게 하는 작업
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {	//포문이 반복되고 0.5sec sleep 간격으로 beep
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}

		for(int i=0; i<5; i++) { //띵 문자열 5번 출력하는 작업
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}  //결국 싱글스레드는 소리가 5번 먼저나고 띵이 5번 출력된다
}
