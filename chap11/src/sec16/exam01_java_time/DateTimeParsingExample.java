package sec16.exam01_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
		//문자열을 parsing해서 날짜와 시간을 생성하는 메소드
		// 날짜와 시간 정보가 포함된 문자열을 파싱해서 날짜와 식나을 생성하는 두개의 parse()정적 메소드
public class DateTimeParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter; //선언
		LocalDate localDate; //로컬 데이트 변수 선언
		//LocalDate의 parse(CharSequence)메소드는 기본적으로 ISO_LOCAL_DATE 포맷터를 사용해서 문자열을 파싱한다. 
		// ISO_LOCAL_DATE는 DateTimeFormatter의 상수로 정의되어 있다. 
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);// 메소드 호출해서 문자열 파싱, 로컬데이트 객체를 얻어낸다
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);		
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");//사용자 정의 포매터
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);//parse메소드가 포매터 정보보고 판단해서 파싱, 로컬데이트를 만듬. 저대로 규칙 지켜서 값을 줘야 한다.
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);		
	}
}

