package sec02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //�� �ڵ带 �����ϴ� ������ ��ü ��� 
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());//������ �̸� ���
		
		ThreadA threadA = new ThreadA();//ThreadA ����
		System.out.println("�۾� ������ �̸�: " + threadA.getName());//������ �̸� ���
		threadA.start();//ThreadA ����
		
		ThreadB threadB = new ThreadB();//ThreadB ����
		System.out.println("�۾� ������ �̸�: " + threadB.getName());//������ �̸� ��� 
		threadB.start();//ThreadB ����
	}//�������� start()�޼ҵ�� �ѹ� start()ȣ��ǰ� ���� �ٽ� ȣ��� �� ����, ������ �ٽ� �����ؼ� start()ȣ�� �ؾ���
}
