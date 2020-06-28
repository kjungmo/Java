package sec16.exam01_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
		//문자열을 parsing해서 날짜와 시간을 생성하는 메소드
		// 날짜와 시간 정보가 포함된 문자열을 파싱해서 날짜와 식나을 생성하는 두개의 parse()정적 메소드
public class DateTimeParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);		
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);		
	}
}

