package sec07.exam02_method;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		//String ��ü�� ���ڿ��� ������ �Ұ����� Ư���� ��������
		// replace() �޼ҵ尡 �����ϴ� ���ڿ��� �������� �ƴ϶� ������ ���ο� ���ڿ�
		// �׷��� �����ϴ� ���ڿ� ��ü�� �ٸ���. 
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

