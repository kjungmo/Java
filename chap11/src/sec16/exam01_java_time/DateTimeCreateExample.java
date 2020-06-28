package sec16.exam01_java_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
//임포트 해줘야 한다.
public class DateTimeCreateExample {			//Instant 쪽에 Thread때문에 예외처리
	public static void main(String[] args) throws InterruptedException {
		//날짜 얻기
		LocalDate currDate = LocalDate.now(); //현재 로컬 날짜 정보 가진 클래스를 currDate에 
		System.out.println("현재 날짜: " + currDate);

		LocalDate targetDate = LocalDate.of(2024, 5, 10);  //of()는 직접 지정한 날짜 데이터
		System.out.println("목표 날짜: " + targetDate + "\n");

		//시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간: " + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("목표 시간: " + targetTime + "\n");
		
		//날짜와 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("목표 날짜와 시간: " + targetDateTime + "\n");
		
		//협정 세계시와 시간존(TimeZone)
		ZonedDateTime utcDateTime =   ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);
		ZonedDateTime newyorkDateTime = 
       ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간존: " + newyorkDateTime + "\n");
		
		/*
		 * String[] availableIDs = TimeZone.getAvailableIDs(); for(String zoneId :
		 * availableIDs) { System.out.println(zoneId); }
		 */ // 이것을 사용하면 ZoneID로 사용할 수 있는 존아이디들의 목록을 볼 수 있다.
		
		//특정 시점의 타임스탬프 얻기
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		Instant instant2 = Instant.now();		
		if(instant1.isBefore(instant2)) { 
			System.out.println("instant1이 빠릅니다.");
		} else if(instant1.isAfter(instant2)) {
			System.out.println("instant1이 늦습니다.");
		} else {
			System.out.println("동일한 시간입니다.");
		}
		System.out.println("차이(nanos): " + instant1.until(instant2, ChronoUnit.NANOS));
	} // NANO로 해야 차이나는 시간을 알 수 있다. 너무 처리시간이 빠르기 때문
}
