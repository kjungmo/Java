package sec05.exam01_exit;

public class ExitExample {

	public static void main(String[] args) {
		// ���� ������ ����
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) { //(2) ����� �´�
				if( status != 5) {  //(3) 5�� �ƴ϶�� new SecurityException �߻���Ŵ
					throw new SecurityException(); // �׷��� CheckExit ���������� ����
				}
			}
		});

		for(int i = 0; i<10 ; i++) {
			// i�� ���
			System.out.println(i);
			try {
				// JVM ���� ��û
				System.exit(i); // (1) �̰� ���� �����ؼ�
			} catch(SecurityException e) {}  //(4) ����ó�� �ƹ��͵� ����. ���� ���õǰ� �ٽ� for�� �����
		}
	}

}
