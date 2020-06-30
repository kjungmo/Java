package sec08.exam01_threadgroup;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		//myGroup에 두 스레드를 포함시킴
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();		
		mainGroup.list(); //list()메소드는 현재 스레드 그룹의 이름과 최대 우선순위를 헤더로 출력,
		// 그 아래에 현재 스레드 그룹에 포함된 스레드와 하위 스레드 그룹의 내용을 보여줌.
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt(); //스레드 그룹의interrupt()메소드를 호출하면 myGroup에 포함된 두 스레드에서 InterruptException이 발생되어 스레드가 종료됨
	}
}
