package sec13.exam02_constructor_access.package1;

public class A {
	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("���ڿ�");
	
	public A(boolean b) {}
	A() {}
	private A(String s) {}
	
}
