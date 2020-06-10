package sec03_try_catch_finally;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
			//Class clazz = Class.forName("java.lang.String"); 2�� �� Ŭ������ ������ -> Ŭ������ ã�ҽ��ϴٰ� ���.
			System.out.println("Ŭ������ ã�ҽ��ϴ�.");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			System.out.println("���α׷��� �����ϰ� �����մϴ�.");
		}

	}

}
