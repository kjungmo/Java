package sec04.exam02_synchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { //����ȭ �޼ҵ�� ������� ������ User1 �����尡 setMemory()�� ������ ���� User2 �����尡 setMemory()�޼ҵ带 ������ �� ����
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}	
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}
}
/*
 * public void setMemory(int memory) { synchronized(this) { this.memory =
 * memory; try { Thread.sleep(2000); } catch (InterruptedException e) {}
 * System.out.println(Thread.currentThread().getName() + ": " + this.memory +
 * " ����"); } }
 */ // �̷������� ����ȭ ������ε� ���� �� �ִ�.

