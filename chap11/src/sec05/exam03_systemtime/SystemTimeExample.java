package sec05.exam03_systemtime;

public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();// 1/10�� 9�� ������ �ð� �����Ͽ� 1~100�� �� ���� ���İ��� ���Ǳ� ������ ���. 
		//�и������庸�� ª�� �ð� �ɸ��� 0�� ������ ������ ���뼼���带 ����Ѵ�.
		 
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();

		System.out.println("1~1000000������ ��: " + sum);
		System.out.println("��꿡 " + (time2 - time1) + "�����ʰ� �ҿ�Ǿ����ϴ�.");
	}

}
