package sec16.exam01_java_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//날짜와 시간을 포맷팅된 문자열로 변환시키는 format()메소드
//format()의 매개값은 DateTimeFormatter로 해당 형식대로 문자열을 리턴한다.
public class DateTimeFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}

