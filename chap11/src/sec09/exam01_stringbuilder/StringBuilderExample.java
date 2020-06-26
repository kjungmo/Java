package sec09.exam01_stringbuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//StringBuilder��ü ����
		
		sb.append("Java "); // ���ڿ��� ���� �߰�
		sb.append("Program Study"); // ���ڿ��� ���� �߰�
		System.out.println(sb.toString()); //���ϵ� ���ڿ� ���
					// �׳� ���� 2��� �ᵵ ���ڿ��� ��ȯ�Ǳ� �Ѵ�
		sb.insert(4, "2"); // index4 ��ġ�� 2�� ����
		System.out.println(sb.toString());
						//' ' �� ���ձ� ������ ���ڴ� (���ڿ��� �ƴϴ�)
		sb.setCharAt(4, '6'); // index4 ��ġ�� ���ڸ� 6���� ����
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); //index6 ���� 13 �������� "Book"���ڿ��� ��ġ
		System.out.println(sb.toString());
		
		sb.delete(4, 5); //index 4���� 5������ ����
		System.out.println(sb.toString());
		
		int length = sb.length(); // �� ���� �� ���
		System.out.println("�ѹ��ڼ�: " + length);
		
		String result = sb.toString(); // ���ۿ� �ִ� ���� String Ÿ������ ����
		System.out.println(result);		
	}
}
