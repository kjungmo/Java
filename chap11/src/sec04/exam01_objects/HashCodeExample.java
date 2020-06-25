package sec04.exam01_objects;

import java.util.*;

import sec04.exam01_objects.CompareExample.*;

public class HashCodeExample {

	public static void main(String[] args) {
		
		Student s1 = new Student(1 ,"홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student {
		int sno;
		String name;
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		
		@Override  //해시코드 재정의. sno와 name의 필드값이 전부 같다면 동일한 hashCode리턴하도록
		public int hashCode() {

			return Objects.hash(sno, name); // 두 객체를 이요해서 내부적으로 하나의 hashCode만들어준다
		}
	}

}
