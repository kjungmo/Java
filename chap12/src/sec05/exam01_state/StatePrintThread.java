package sec05.exam01_state;

public class StatePrintThread extends Thread {	//스레드 클래스 상속
	private Thread targetThread; //타겟스레드의 참조를 가질 수 있도록 선언
			//생성자			상태를 조사할 스레드
	public StatePrintThread(Thread targetThread) { //객체를 생성했을 때 targetThread받을 수 있도록
		this.targetThread = targetThread;//매개값 대입
	}
		//생성자 매개값으로 받은 타겟 스레드의 상태를 0.5초 주기로 출력
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); // 타겟스레드의 현재상태를 얻어냄
			System.out.println("타겟 스레드 상태: " + state); //열거상수 문자열 출력됨
			
			if(state == Thread.State.NEW) { //객체 생성 상태인 경우 실행 대기 상태로 만듬
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) { // 종료 상태일 경우 while문 종료
				break;
			}
			try {
				//0.5초간 일시 정지
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}

