package sec08.exam01_split_tokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-");
		// text 문자열을 String클래스의 split()메소드로 정규 표현식에 따라
		// 나누어서 String[] names라는 배열을 생성한다
		// 그리고 for 문에서 대입받을 변수는 String 타입의 name이고 
		// 배열은 String[] names의 배열명인 names를 대입
		for(String name : names) {
			System.out.println(name);
		}
	}

}
