package sec06.exam05_wait_notify;

public class WaitNotifyExample {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		// �����带 ����������
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		//start() 
		producerThread.start();
		consumerThread.start();
	}
}
