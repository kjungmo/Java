package sec16.exam01_java_time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시: " + now);
		//메소드의 매개변수 만큼 더하거나 뺀다
		LocalDateTime  targetDateTime = now
			.plusYears(1)
			.minusMonths(2)
			.plusDays(3)
			.plusHours(4)
			.minusMinutes(5)
			.plusSeconds(6);
		System.out.println("연산후: " + targetDateTime);
	}
}

