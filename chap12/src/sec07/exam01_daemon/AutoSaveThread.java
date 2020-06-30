package sec07.exam01_daemon;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("�۾� ������ ������.");
	}
	
	@Override
	public void run() {
		while(true) { //���� ����
			try {
				Thread.sleep(1000); // 1�� ������
			} catch (InterruptedException e) {
				break; //���� �߻��� while�� ����
			}
			save(); //save() �ϰ� �Ǹ� �� ���� �۾������� �������� ��µ�
		}
	}
}
