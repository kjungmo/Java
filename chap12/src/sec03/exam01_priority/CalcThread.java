package sec03.exam01_priority;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name); //������ �̸� ����
	}
	
	@Override // ������ ����� Thread10�� priority�� MAX �����
	public void run() {
		for(int i=0; i<2000000000; i++) {
		}
		System.out.println(getName()); 
	} // �����尡 ������ ����
}
