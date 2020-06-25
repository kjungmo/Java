package sec04.exam01_objects;

import java.util.*;

import sec04.exam01_objects.CompareExample.*;

public class HashCodeExample {

	public static void main(String[] args) {
		
		Student s1 = new Student(1 ,"ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
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
		
		@Override  //�ؽ��ڵ� ������. sno�� name�� �ʵ尪�� ���� ���ٸ� ������ hashCode�����ϵ���
		public int hashCode() {

			return Objects.hash(sno, name); // �� ��ü�� �̿��ؼ� ���������� �ϳ��� hashCode������ش�
		}
	}

}
