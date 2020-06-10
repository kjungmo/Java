package sec03.exam01_for;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;  //이런식으로 for문 바깥에 선언해주면
		for(i=1; i<=100; i++) {
			//i를 for문 밖에서 선언하게 되면
			//for(int i=1; 이런식으로 int 안써줘도 된다.
			sum += i;
			
		}
		
		System.out.println("1~" + (i-1) + "까지의 합: " + sum);
	//이렇게 i를 for문 안에서도 사용가능하다. 
	// 그렇지 않으면 컴파일 에러가 난다.
	}

}
