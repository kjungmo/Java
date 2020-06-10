package sec10.exam03_static_be_careful;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
	}
	
	static Singleton getInstance() {
		return singleton;
	}
	
}
