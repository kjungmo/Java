package sec03.exam06_finalize;

public class Counter {
	private int no; //필드
	
	public Counter(int no) { //생성자
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
}
