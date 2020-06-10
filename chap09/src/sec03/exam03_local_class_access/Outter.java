package sec03.exam03_local_class_access;

public class Outter {
	//자바7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner {
			void method() {
				int arg = 10;
				int localVariable = 1;
				int result = arg + localVariable;
			}
		}
	}
	
	//자바8 이후
	public void method2 (int arg) {
		int localVariable = 1;
		class Inner {
			void method() {
				int arg = 10;
				int localVariable = 1;
				int result = arg + localVariable;
			}
		}
	}
}
