package sec08.exam01_split_tokenizer;

import java.util.*;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String text = "홍길동/이수홍/박연수";
		
		//how1: 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens(); //몇개 있는지
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		//how2: 남아 있는 토큰을 확인하고 while 문으로 루핑 (이방법을 많이 사용)
		//한번 만들어진 StringTokenizer객체는 재사용할 수 없기 때문에 다시 만든다
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) { //가져올 토큰이 있으면 t/ 없으면f
			String token = st.nextToken(); // 가져와서 저장
			System.out.println(token); // 출력하고 다시 while문으로
		}
	}

}
