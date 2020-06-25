package sec05.exam01_exit;

public class ExitExample {

	public static void main(String[] args) {
		// 보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) { //(2) 여기로 온다
				if( status != 5) {  //(3) 5가 아니라면 new SecurityException 발생시킴
					throw new SecurityException(); // 그래야 CheckExit 정상실행되지 않음
				}
			}
		});

		for(int i = 0; i<10 ; i++) {
			// i값 출력
			System.out.println(i);
			try {
				// JVM 종료 요청
				System.exit(i); // (1) 이걸 먼저 실행해서
			} catch(SecurityException e) {}  //(4) 예외처리 아무것도 안함. 예외 무시되고 다시 for문 실행됨
		}
	}

}
