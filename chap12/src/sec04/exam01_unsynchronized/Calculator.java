package sec04.exam01_unsynchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) { //�ܺο��� ���� �޾Ƽ� ���� �޸𸮿� ���� �����ϴ� �޼ҵΤ�
		this.memory = memory; // �Ű����� memory �ʵ忡 ����
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}	//�����带 2�ʰ� ������Ŵ - �̶� user2�� ������ �ٲ�
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}                      	//�����Ų �������� �̸��� ������ �޸��� ��. 
}

