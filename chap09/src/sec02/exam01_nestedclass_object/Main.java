package sec02.exam01_nestedclass_object;

import sec02.exam01_nestedclass_object.A.*;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		//A.B b = new A.B(); 이렇게 막바로 접근은 안됨 생성자
		// 접근할 때에는 A객체의 참조변수를 통해 접근해야한다.
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
