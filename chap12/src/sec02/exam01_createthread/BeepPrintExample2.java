package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//how1
		Runnable beepTask = new BeepTask();  //�۾� ��ü �����ϰ� �̰��� �Ű������� �ؼ�
		Thread thread = new Thread(beepTask); // ���� �Ű������� �۾� �����带 �����Ѵ�. 
		
		//how2 Runnable �͸� ��ü �̿�
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
		
		//how3 ���ٽ� �̿�
		/*Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		});*/
		
		thread.start(); // �� 4������ �۾� �������� start()�޼ҵ带 ȣ���ϸ� 
		// �۾������忡 ���� BeepTask ��ü�� run()�޼ҵ尡 ����Ǿ� �������� �߻�
		// ���ÿ� ���� ������� �Ʒ��� for���� ������� 0.5�� �������� ���ڿ��� �����
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}


