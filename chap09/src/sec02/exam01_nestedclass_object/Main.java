package sec02.exam01_nestedclass_object;

import sec02.exam01_nestedclass_object.A.*;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		//A.B b = new A.B(); �̷��� ���ٷ� ������ �ȵ� ������
		// ������ ������ A��ü�� ���������� ���� �����ؾ��Ѵ�.
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();

		a.method();
	}

}
