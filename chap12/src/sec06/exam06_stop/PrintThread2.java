package sec06.exam06_stop;

public class PrintThread2 extends Thread {
	public void run() {	
		//how1
		/*try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}	
		} catch(InterruptedException e) {		
		}*/
		
		//how2 이렇게 쓸 수도 있다. (일시정지를 만들지 않고도 interrupt()호출 여부를 알 수 있는 방법.
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) { //interrupt() 메소드가 호출 되었다면 스레드의 interrupted()와 isInterrupted()메소드는 true를 리턴한다.
				break; //interrupted()는 정적 메소드로 현재 스레드가 interrupted 되었는지 확인하는 것
			}  //isInterrupted()는 인스턴스 메소드로 현재 스레드가 interrupted 되었는지 확인할 때 사용
		}  //위에 if문에서 if 매개변수로 if(isInterrupted())로도 사용 가능. 
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

