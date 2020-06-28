package sec15.exam01_format;

import java.text.MessageFormat;
		//MessageFormat 클래스를 이용하면 문자열에 데이터가 들어갈 자리를 표시해두고, 프로그램이 실행하면서 동적으로 데이터를 삽입해 문자열을 완성시킬 수 있다.
		//MessageFormat은 정적 format()메소드를 호출해서 완성된 문자열을 리턴시킴
		 
		
public class MessageFormatExample {
	public static void main(String[] args) {		
		String id = "java";
		String name = "신용권";
		String tel = "010-123-5678";
		
		//format()메소드의 첫번째 매개값은 매개변수화된 문자열을 지정하고, 두 번째 이후의 매개값은 인덱스 순서에 맞게 값을 나열하면 된다.
		String text = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		// 값을 나열하는 대신, 배열을 대입해도 됨.
		String sql = "insert into member values( {0}, {1}, {2} )";
		Object[] arguments = { "'java'", "'신용권'", "'010-123-5678'" };
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}
