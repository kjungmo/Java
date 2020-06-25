package sec05.exam03_systemtime;

public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();// 1/10의 9승 단위로 시간 측정하여 1~100만 의 합이 순식간에 계산되기 때문에 사용. 
		//밀리세컨드보다 짧은 시간 걸리면 0이 나오기 때문에 나노세컨드를 사용한다.
		 
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();

		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산에 " + (time2 - time1) + "나노초가 소요되었습니다.");
	}

}
