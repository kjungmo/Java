package sec03.exam04_clone;

public class Member implements Cloneable{ // 복제할 수 있다는 표시
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
	
	public Member getMember() {  //class Member 복제해서 리턴하는 메소드
		Member cloned = null;
		try {
			cloned = (Member)clone(); // 예외처리 해줘야 하는데 clone()메소드의 리턴타입은 Object임
		} catch (CloneNotSupportedException e) {} //그래서 Member 타입으로 강제변환 해줘야 한다.
		return cloned;
	}
}
