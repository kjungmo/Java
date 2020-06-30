package sec07.exam01_daemon;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}
	
	@Override
	public void run() {
		while(true) { //무한 루프
			try {
				Thread.sleep(1000); // 1초 단위로
			} catch (InterruptedException e) {
				break; //예외 발생시 while문 종료
			}
			save(); //save() 하게 되면 맨 위의 작업내용을 저장함이 출력됨
		}
	}
}
