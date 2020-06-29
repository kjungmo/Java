package sec05.exam01_state;
//StatePrintThread를 생성해서 
//매개값으로 전달받은 TargetThread의 상태를 출력하도록 작성된 실행 클래스
public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start(); 
	}
}
