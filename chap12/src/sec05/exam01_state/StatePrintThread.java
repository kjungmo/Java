package sec05.exam01_state;

public class StatePrintThread extends Thread {	//������ Ŭ���� ���
	private Thread targetThread; //Ÿ�ٽ������� ������ ���� �� �ֵ��� ����
			//������			���¸� ������ ������
	public StatePrintThread(Thread targetThread) { //��ü�� �������� �� targetThread���� �� �ֵ���
		this.targetThread = targetThread;//�Ű��� ����
	}
		//������ �Ű������� ���� Ÿ�� �������� ���¸� 0.5�� �ֱ�� ���
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); // Ÿ�ٽ������� ������¸� ��
			System.out.println("Ÿ�� ������ ����: " + state); //���Ż�� ���ڿ� ��µ�
			
			if(state == Thread.State.NEW) { //��ü ���� ������ ��� ���� ��� ���·� ����
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) { // ���� ������ ��� while�� ����
				break;
			}
			try {
				//0.5�ʰ� �Ͻ� ����
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}

