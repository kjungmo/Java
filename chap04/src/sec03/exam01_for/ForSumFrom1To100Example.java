package sec03.exam01_for;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;  //�̷������� for�� �ٱ��� �������ָ�
		for(i=1; i<=100; i++) {
			//i�� for�� �ۿ��� �����ϰ� �Ǹ�
			//for(int i=1; �̷������� int �Ƚ��൵ �ȴ�.
			sum += i;
			
		}
		
		System.out.println("1~" + (i-1) + "������ ��: " + sum);
	//�̷��� i�� for�� �ȿ����� ��밡���ϴ�. 
	// �׷��� ������ ������ ������ ����.
	}

}
