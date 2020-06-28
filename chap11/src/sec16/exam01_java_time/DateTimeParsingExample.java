package sec16.exam01_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
		//���ڿ��� parsing�ؼ� ��¥�� �ð��� �����ϴ� �޼ҵ�
		// ��¥�� �ð� ������ ���Ե� ���ڿ��� �Ľ��ؼ� ��¥�� �ĳ��� �����ϴ� �ΰ��� parse()���� �޼ҵ�
public class DateTimeParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter; //����
		LocalDate localDate; //���� ����Ʈ ���� ����
		//LocalDate�� parse(CharSequence)�޼ҵ�� �⺻������ ISO_LOCAL_DATE �����͸� ����ؼ� ���ڿ��� �Ľ��Ѵ�. 
		// ISO_LOCAL_DATE�� DateTimeFormatter�� ����� ���ǵǾ� �ִ�. 
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);// �޼ҵ� ȣ���ؼ� ���ڿ� �Ľ�, ���õ���Ʈ ��ü�� ����
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);		
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");//����� ���� ������
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);//parse�޼ҵ尡 ������ �������� �Ǵ��ؼ� �Ľ�, ���õ���Ʈ�� ����. ����� ��Ģ ���Ѽ� ���� ��� �Ѵ�.
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);		
	}
}

