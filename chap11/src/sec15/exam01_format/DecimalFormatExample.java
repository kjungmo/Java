package sec15.exam01_format;

import java.text.DecimalFormat;

public class DecimalFormatExample { //DecimalFormat�� ���� �����͸� ���ϴ� �������� ǥ���ϱ� ���� ������ �����
	public static void main(String[] args) {
		double num = 1234567.89;
												//������ ������ ���� ��  
		DecimalFormat df = new DecimalFormat("0"); // DecimalFormat ������ �Ű������� �����ؼ� ��ü�� ����
		System.out.println( df.format(num) ); // �׸��� ���� format()�޼ҵ带 ȣ���ؼ� ������ ����� ���ڿ��� ������ ��.
		
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
