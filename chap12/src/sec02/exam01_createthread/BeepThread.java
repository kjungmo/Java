package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepThread extends Thread { // �۾� �����尡 ������ �۾��� Runnable�� ������ �ʰ�
	// Thread�� ���� Ŭ������ �۾� �����带 �����ϸ鼭 �۾� ������ ���Խ�ų �� �ִ�.
	@Override //Thread Ŭ������ ����� �� run()�޼ҵ带 �������ؼ� �����尡 ������ �ڵ带 �ۼ�
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		} //��������� ������ ���� �����̴�
	}
}

