package sec05.exam01_state;

public class TargetThread extends Thread {	
	@Override
	public void run() {
		for(long i=0; i<1000000000; i++) {} //���� ���Ƽ� RUNNABLE���� ����
		
		try {
			//1.5�ʰ� �Ͻ� ����
			Thread.sleep(1500); //1.5�ʰ� TIMED_WAITING ���� ����
		} catch(Exception e) {}
		
		for(long i=0; i<1000000000; i++) {} //�ٽ� RUNNABLE���� ����
	}  //TargetThread�� ��ü�� �����Ǹ� NEW ���¸� ������ run() �޼ҵ尡 ����Ǹ�
	// TERMINATED ���°� ��
}
