package sec15.exam01_format;

import java.text.DecimalFormat;

public class DecimalFormatExample { //DecimalFormat은 숫자 데이터를 원하는 형식으로 표현하기 위해 패턴을 사용함
	public static void main(String[] args) {
		double num = 1234567.89;
												//적용할 패턴을 선택 후  
		DecimalFormat df = new DecimalFormat("0"); // DecimalFormat 생성자 매개값으로 지정해서 객체를 생성
		System.out.println( df.format(num) ); // 그리고 나서 format()메소드를 호출해서 패턴이 적용된 문자열을 얻으면 됨.
		
		df = new DecimalFormat("0.0");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#.#");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("##########.#####");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#.0");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("+#.0");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("-#.0");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#,###.0");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("0.0E0");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("#.# %");
		System.out.println( df.format(num) );
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println( df.format(num) );
	}
}
