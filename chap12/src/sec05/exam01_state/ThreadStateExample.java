package sec05.exam01_state;
//StatePrintThread�� �����ؼ� 
//�Ű������� ���޹��� TargetThread�� ���¸� ����ϵ��� �ۼ��� ���� Ŭ����
public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start(); 
	}
}
