package sec04.exam01_unsynchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) { //외부에서 값을 받아서 계산기 메모리에 값을 저장하는 메소두ㅡ
		this.memory = memory; // 매개값을 memory 필드에 저장
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}	//스레드를 2초간 정지시킴 - 이때 user2의 값으로 바뀜
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}                      	//실행시킨 스레드의 이름과 변경한 메모리의 값. 
}

