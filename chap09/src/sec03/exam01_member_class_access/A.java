package sec03.exam01_member_class_access;

public class A {
	class B { }
	static class C { }
	
	//인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() { 
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적 필드
	//static B field3 = new B(); A라는 객체 없이도 사용가능해야하는데 B는 안된다.
	static C field4 = new C(); //static 이라서 C는 가능
	
	//정적 메소드
	static void method2() {
		//B var1 = new B(); method2도 A객체가 반드시 있어야 하다.
		C var2 = new C();
	}
	
}
