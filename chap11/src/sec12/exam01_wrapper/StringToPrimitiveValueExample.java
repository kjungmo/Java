package sec12.exam01_wrapper;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");  //int 타입으로 변환되어 리턴된다.
		double value2 = Double.parseDouble("3.14"); //double 타입으로 변환되어 리턴된다.
		boolean value3 = Boolean.parseBoolean("true"); //boolean타입으로 변환되어 리턴된다
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	}
}
