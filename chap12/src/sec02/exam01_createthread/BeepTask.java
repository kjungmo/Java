package sec02.exam01_createthread;

import java.awt.Toolkit;
		//�������� �߻���ƾ�鼭 ���ÿ� �������� �Ϸ��� �� �۾� �� �ϳ��� ���� �����尡 �ƴ� �ٸ�
		//�����忡�� ������Ѿ� ��. �������� ���� �����尡 ���, �������� �۾� �����尡 ����ϵ���
		// �۾��� �����ϴ� Runnable ����Ŭ������ �̷��� �ۼ�
public class BeepTask implements Runnable {	// Runnable �������̽� 
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

