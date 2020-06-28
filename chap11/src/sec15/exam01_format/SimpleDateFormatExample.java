package sec15.exam01_format;

import java.text.SimpleDateFormat;
import java.util.Date;
				//Date 클래스의 toString()메소드는 영문으로된 날짜를 리턴
				//만약 특정 문자열 포맷으로 얻고싶다면 java.text.SimpleDateFormat 클래스를 이용하면 됨
				// SimpleDateFormat클래스는 날짜를 원하는 형식으로 표현하기 위해 패턴을 사용
				// 패턴에는 자릿수에 맞게 기호를 반복해서 작성할 수 있다.
public class SimpleDateFormatExample { 
	public static void main(String[] args) {
		Date now = new Date();
		//패턴을 SimpleDateFormat의 생성자 매개값으로 지정해서 객체를 생성하고
		//format()메소드를 호출해서 패턴이 적용된 문자열을 얻으면 된다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println( sdf.format(now) );		
	}
}
