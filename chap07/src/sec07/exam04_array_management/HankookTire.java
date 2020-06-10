package sec07.exam04_array_management;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation-accumulatedRotation));
			return true;  // 더 구를 수 있다
		}else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false; // 더 이상 구를 수 없다
		}
	}
}
