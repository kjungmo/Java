package sec02.exam01_nestedclass_object;

public class A {
	A() {
		System.out.println("A ��ü�� ������");
		
	}
	
	class B {
		int field1;
		//static int field2;  ������ �� ����.
		B() {
			System.out.println("B ��ü�� ������");
		}
		void method1() {}
		//static void method2(); ������ �� ����. 
	}
	
	static class C {
		int field1;
		static int field2;
		C() {
			System.out.println("C��ü�� ������");
		}
		void method1() { }
		static void method2() { }
	}
	
	void method() {
		class D {
			int field1;
			//static int field2; ����Ŭ���������� static ����
			D() {
				System.out.println("D��ü�� ������");
			}
			void method1() { }
			//static void method2() { } �����޼ҵ�� ����Ŭ������ ����
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
