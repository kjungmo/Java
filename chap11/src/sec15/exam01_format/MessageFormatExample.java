package sec15.exam01_format;

import java.text.MessageFormat;
		//MessageFormat Ŭ������ �̿��ϸ� ���ڿ��� �����Ͱ� �� �ڸ��� ǥ���صΰ�, ���α׷��� �����ϸ鼭 �������� �����͸� ������ ���ڿ��� �ϼ���ų �� �ִ�.
		//MessageFormat�� ���� format()�޼ҵ带 ȣ���ؼ� �ϼ��� ���ڿ��� ���Ͻ�Ŵ
		 
		
public class MessageFormatExample {
	public static void main(String[] args) {		
		String id = "java";
		String name = "�ſ��";
		String tel = "010-123-5678";
		
		//format()�޼ҵ��� ù��° �Ű����� �Ű�����ȭ�� ���ڿ��� �����ϰ�, �� ��° ������ �Ű����� �ε��� ������ �°� ���� �����ϸ� �ȴ�.
		String text = "ȸ�� ID: {0} \nȸ�� �̸�: {1} \nȸ�� ��ȭ: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		// ���� �����ϴ� ���, �迭�� �����ص� ��.
		String sql = "insert into member values( {0}, {1}, {2} )";
		Object[] arguments = { "'java'", "'�ſ��'", "'010-123-5678'" };
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}
