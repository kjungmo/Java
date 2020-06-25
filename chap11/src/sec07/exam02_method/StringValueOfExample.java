package sec07.exam02_method;

public class StringValueOfExample {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);		//이 세 개는 기본 타입
					//valueOf() 메소드를 통해 "  "으로 감싸진게 되는것
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3); //이 출력값들은 문자열이다.
	}
}

