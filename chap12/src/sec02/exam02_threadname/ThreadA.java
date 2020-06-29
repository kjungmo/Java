package sec02.exam02_threadname;

public class ThreadA extends Thread {	
	public ThreadA() {
		setName("ThreadA"); //스레드 이름 설정
	}
	
	public void run() {		
		for(int i=0; i<2; i++) {		
			System.out.println(getName() + "가 출력한 내용");//스레드 이름 얻기
		}//Thread A 실행 내용
	}
}

