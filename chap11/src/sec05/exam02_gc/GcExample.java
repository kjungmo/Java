package sec05.exam02_gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.print("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc();  // 이것을 주석처리하면 " ~ 메모리에서 제거됨"이란 말이 안뜸
		// main 메소드 종료 되면 다 지워지기 때문에 main 메소드 블럭 안에서 gc()메소드 사용해야함

	}

}
