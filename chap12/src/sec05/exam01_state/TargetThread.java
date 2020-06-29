package sec05.exam01_state;

public class TargetThread extends Thread {	
	@Override
	public void run() {
		for(long i=0; i<1000000000; i++) {} //루핑 돌아서 RUNNABLE상태 유지
		
		try {
			//1.5초간 일시 정지
			Thread.sleep(1500); //1.5초간 TIMED_WAITING 상태 유지
		} catch(Exception e) {}
		
		for(long i=0; i<1000000000; i++) {} //다시 RUNNABLE상태 유지
	}  //TargetThread가 객체로 생성되면 NEW 상태를 가지고 run() 메소드가 종료되면
	// TERMINATED 상태가 됨
}
