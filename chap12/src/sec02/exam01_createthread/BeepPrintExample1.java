package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {//beep 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {	//������ �ݺ��ǰ� 0.5sec sleep �������� beep
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}

		for(int i=0; i<5; i++) { //�� ���ڿ� 5�� ����ϴ� �۾�
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}  //�ᱹ �̱۽������ �Ҹ��� 5�� �������� ���� 5�� ��µȴ�
}
