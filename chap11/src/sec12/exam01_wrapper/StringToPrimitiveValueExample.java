package sec12.exam01_wrapper;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");  //int Ÿ������ ��ȯ�Ǿ� ���ϵȴ�.
		double value2 = Double.parseDouble("3.14"); //double Ÿ������ ��ȯ�Ǿ� ���ϵȴ�.
		boolean value3 = Boolean.parseBoolean("true"); //booleanŸ������ ��ȯ�Ǿ� ���ϵȴ�
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	}
}
