package sec03.exam04_clone;

public class Member implements Cloneable{ // ������ �� �ִٴ� ǥ��
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {  //class Member �����ؼ� �����ϴ� �޼ҵ�
		Member cloned = null;
		try {
			cloned = (Member)clone(); // ����ó�� ����� �ϴµ� clone()�޼ҵ��� ����Ÿ���� Object��
		} catch (CloneNotSupportedException e) {} //�׷��� Member Ÿ������ ������ȯ ����� �Ѵ�.
		return cloned;
	}
}
