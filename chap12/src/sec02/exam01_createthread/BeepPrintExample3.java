package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		//how1
		Thread thread = new BeepThread(); // BeepThread ��ü�� ����
		
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
		
		
		thread.start();		// start()�޼ҵ� ȣ���Ͽ� BeepThread�� run()�޼ҵ� ����
		
		for(int i=0; i<5; i++) { // ������ BeepThread�� run()�޼ҵ� �����԰� ���ÿ� for�� ����
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

