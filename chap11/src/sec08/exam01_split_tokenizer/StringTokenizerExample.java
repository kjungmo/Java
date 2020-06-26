package sec08.exam01_split_tokenizer;

import java.util.*;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		//how1: ��ü ��ū ���� ��� for������ ����
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens(); //� �ִ���
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		//how2: ���� �ִ� ��ū�� Ȯ���ϰ� while ������ ���� (�̹���� ���� ���)
		//�ѹ� ������� StringTokenizer��ü�� ������ �� ���� ������ �ٽ� �����
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) { //������ ��ū�� ������ t/ ������f
			String token = st.nextToken(); // �����ͼ� ����
			System.out.println(token); // ����ϰ� �ٽ� while������
		}
	}

}
