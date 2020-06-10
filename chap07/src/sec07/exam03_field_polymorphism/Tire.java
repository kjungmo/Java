package sec07.exam03_field_polymorphism;

public class Tire {
	public int maxRotation; //최대 회전수 저장됨 이만큼 돌면 교체되어야함
	public int accumulatedRotation;	//누적 회전수 이게 최대회전수가 되면교체되어야함
	public String location; //타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation));
			return true;  // 더 구를 수 있다
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false; // 더 이상 구를 수 없다
		}
	}
}
