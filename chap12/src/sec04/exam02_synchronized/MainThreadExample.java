package sec04.exam02_synchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start(); //User1 스레드는 Calculator 객체의 동기화 메소드인 setMemory()를 실행하는 순간  Calculator 객체를 잠금

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start(); // 메인 스레드가 User2 스레드 실행시키나, 동기화 메소드인 setMemory()를 실행시키지는 못함
		//User1이 setMemory()를 모두 실행할 동안 대기, 다 하고나면 
		//User2가 setMemory() 메소드를 실행함.
	}
}
