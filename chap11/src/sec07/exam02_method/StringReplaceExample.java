package sec07.exam02_method;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		//String 객체의 문자열은 변경이 불가능한 특성을 갖고있음
		// replace() 메소드가 리턴하는 문자열은 수정본이 아니라 완전히 새로운 문자열
		// 그래서 참조하는 문자열 객체도 다르다. 
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

