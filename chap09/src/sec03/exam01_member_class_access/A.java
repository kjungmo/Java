package sec03.exam01_member_class_access;

public class A {
	class B { }
	static class C { }
	
	//�ν��Ͻ� �ʵ�
	B field1 = new B();
	C field2 = new C();
	
	//�ν��Ͻ� �޼ҵ�
	void method1() { 
		B var1 = new B();
		C var2 = new C();
	}
	
	//���� �ʵ�
	//static B field3 = new B(); A��� ��ü ���̵� ��밡���ؾ��ϴµ� B�� �ȵȴ�.
	static C field4 = new C(); //static �̶� C�� ����
	
	//���� �޼ҵ�
	static void method2() {
		//B var1 = new B(); method2�� A��ü�� �ݵ�� �־�� �ϴ�.
		C var2 = new C();
	}
	
}
