package sec06.exam05_wait_notify;

public class DataBox {
	private String data;
	
	public synchronized String getData() { //생산자 스레드가 뭔가를 저장해둔 상태라면
		if(this.data == null) { //data필드가 null이면 소비자 스레드를 일시정지상태로
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터: " + returnValue);
		data = null; // data필드를 null로 만들고 생산자 스레드를 실행대기 상태로 (읽었으니까 다시 null로)
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {		//data 필드가 null이 아니면 생산자 스레드를 일시정지상태로
				wait();
			} catch(InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: " + data);
		notify(); //data 필드에 값을 저장하고 소비자 스레드를 실행대기 상태로 
	}
}


