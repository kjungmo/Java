package sec04.exam02_synchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { //동기화 메소드로 만들었기 때문에 User1 스레드가 setMemory()를 실행할 동안 User2 스레드가 setMemory()메소드를 실행할 수 없음
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
 * " 저장"); } }
 */ // 이런식으로 동기화 블록으로도 만들 수 있다.

