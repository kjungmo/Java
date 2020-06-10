package sec02.exam01_nestedclass_object;

public class A {
	A() {
		System.out.println("A 객체가 생성됨");
		
	}
	
	class B {
		int field1;
		//static int field2;  선언할 수 없다.
		B() {
			System.out.println("B 객체가 생성됨");
		}
		void method1() {}
		//static void method2(); 선언할 수 없다. 
	}
	
	static class C {
		int field1;
		static int field2;
		C() {
			System.out.println("C객체가 생성됨");
		}
		void method1() { }
		static void method2() { }
	}
	
	void method() {
		class D {
			int field1;
			//static int field2; 로컬클래스에서는 static 못씀
			D() {
				System.out.println("D객체가 생성됨");
			}
			void method1() { }
			//static void method2() { } 정적메소드는 로컬클래스에 못옴
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
