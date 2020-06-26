package sec11.exam01_arrays;

public class Member implements Comparable<Member> { //Comparable 인터페이스 구현 해줘야한다
	String name;
	Member(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
