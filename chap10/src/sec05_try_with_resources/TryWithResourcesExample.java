package sec05_try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();   //�ڵ������� close(); �޼ҵ尡 ȣ��Ǿ file.txt.�� �ݽ��ϴٰ� ���´�
			throw new Exception(); // ���ܸ� �Ϻη� �߻���Ű�� �� ��� file.txt�� ȣ���
			  // ���ܰ� �߻��ϸ� �� ���ÿ� close(); ȣ��ȴٴ� ��. �ڵ������� ȣ��. �״�����
			// ĳġ �����. ������ autocloseable �������̽��� �����ϰ� �־�� �Ѵ�. 
		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}

	}

}
