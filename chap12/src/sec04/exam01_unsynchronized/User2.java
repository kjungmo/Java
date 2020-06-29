package sec04.exam01_unsynchronized;

public class User2 extends Thread {	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50); //User1과 다르게 공유객체인 Calculator의 메모리에 50을 저장
	}
}
