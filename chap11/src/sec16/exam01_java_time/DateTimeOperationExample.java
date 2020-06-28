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
		// 단순하게 한다면
		/*
		 * LocalDateTime targetDateTime = now.plusYears(1); targetDateTime =
		 * targetDateTime.plusMonths(2); 이런식으로 쭉쭉쭉 이어 쓸 수도 있지만 너무 길다. 그래서 위처럼 도트 연산자로
		 * 연결해서 순차적으로 호출한다.
		 */
		System.out.println("연산후: " + targetDateTime);
	}
}

