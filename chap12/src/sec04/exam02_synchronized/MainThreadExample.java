package sec04.exam02_synchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start(); //User1 ������� Calculator ��ü�� ����ȭ �޼ҵ��� setMemory()�� �����ϴ� ����  Calculator ��ü�� ���

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start(); // ���� �����尡 User2 ������ �����Ű��, ����ȭ �޼ҵ��� setMemory()�� �����Ű���� ����
		//User1�� setMemory()�� ��� ������ ���� ���, �� �ϰ��� 
		//User2�� setMemory() �޼ҵ带 ������.
	}
}
