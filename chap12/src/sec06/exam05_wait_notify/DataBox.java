package sec06.exam05_wait_notify;

public class DataBox {
	private String data;
	
	public synchronized String getData() { //������ �����尡 ������ �����ص� ���¶��
		if(this.data == null) { //data�ʵ尡 null�̸� �Һ��� �����带 �Ͻ��������·�
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread�� ���� ������: " + returnValue);
		data = null; // data�ʵ带 null�� ����� ������ �����带 ������ ���·� (�о����ϱ� �ٽ� null��)
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {		//data �ʵ尡 null�� �ƴϸ� ������ �����带 �Ͻ��������·�
				wait();
			} catch(InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread�� ������ ������: " + data);
		notify(); //data �ʵ忡 ���� �����ϰ� �Һ��� �����带 ������ ���·� 
	}
}


