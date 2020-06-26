package sec09.exam01_stringbuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//StringBuilder객체 생성
		
		sb.append("Java "); // 문자열을 끝에 추가
		sb.append("Program Study"); // 문자열을 끝에 추가
		System.out.println(sb.toString()); //리턴될 문자열 출력
					// 그냥 숫자 2라고 써도 문자열로 변환되긴 한다
		sb.insert(4, "2"); // index4 위치에 2를 삽입
		System.out.println(sb.toString());
						//' ' 로 감쌌기 때문에 문자다 (문자열이 아니다)
		sb.setCharAt(4, '6'); // index4 위치의 문자를 6으로 변경
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); //index6 부터 13 전까지를 "Book"문자열로 대치
		System.out.println(sb.toString());
		
		sb.delete(4, 5); //index 4부터 5전까지 삭제
		System.out.println(sb.toString());
		
		int length = sb.length(); // 총 문자 수 얻기
		System.out.println("총문자수: " + length);
		
		String result = sb.toString(); // 버퍼에 있는 것을 String 타입으로 리턴
		System.out.println(result);		
	}
}
