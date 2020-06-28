package sec16.exam01_java_time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("�����: " + now);
		//�޼ҵ��� �Ű����� ��ŭ ���ϰų� ����
		LocalDateTime  targetDateTime = now
			.plusYears(1)
			.minusMonths(2)
			.plusDays(3)
			.plusHours(4)
			.minusMinutes(5)
			.plusSeconds(6);
		// �ܼ��ϰ� �Ѵٸ�
		/*
		 * LocalDateTime targetDateTime = now.plusYears(1); targetDateTime =
		 * targetDateTime.plusMonths(2); �̷������� ������ �̾� �� ���� ������ �ʹ� ���. �׷��� ��ó�� ��Ʈ �����ڷ�
		 * �����ؼ� ���������� ȣ���Ѵ�.
		 */
		System.out.println("������: " + targetDateTime);
	}
}

