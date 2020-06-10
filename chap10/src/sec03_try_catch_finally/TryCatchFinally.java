package sec03_try_catch_finally;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
			//Class clazz = Class.forName("java.lang.String"); 2를 뺀 클래스는 존재함 -> 클래스를 찾았습니다가 뜬다.
			System.out.println("클래스를 찾았습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("프로그램을 안전하게 종료합니다.");
		}

	}

}
