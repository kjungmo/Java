package sec06.exam06_stop;

public class PrintThread2 extends Thread {
	public void run() {	
		//how1
		/*try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1);
			}	
		} catch(InterruptedException e) {		
		}*/
		
		//how2 �̷��� �� ���� �ִ�. (�Ͻ������� ������ �ʰ� interrupt()ȣ�� ���θ� �� �� �ִ� ���.
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) { //interrupt() �޼ҵ尡 ȣ�� �Ǿ��ٸ� �������� interrupted()�� isInterrupted()�޼ҵ�� true�� �����Ѵ�.
				break; //interrupted()�� ���� �޼ҵ�� ���� �����尡 interrupted �Ǿ����� Ȯ���ϴ� ��
			}  //isInterrupted()�� �ν��Ͻ� �޼ҵ�� ���� �����尡 interrupted �Ǿ����� Ȯ���� �� ���
		}  //���� if������ if �Ű������� if(isInterrupted())�ε� ��� ����. 
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

