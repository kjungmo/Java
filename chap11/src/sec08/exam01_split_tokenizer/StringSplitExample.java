package sec08.exam01_split_tokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		
		String[] names = text.split("&|,|-");
		// text ���ڿ��� StringŬ������ split()�޼ҵ�� ���� ǥ���Ŀ� ����
		// ����� String[] names��� �迭�� �����Ѵ�
		// �׸��� for ������ ���Թ��� ������ String Ÿ���� name�̰� 
		// �迭�� String[] names�� �迭���� names�� ����
		for(String name : names) {
			System.out.println(name);
		}
	}

}
