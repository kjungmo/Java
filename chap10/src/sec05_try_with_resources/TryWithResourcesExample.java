package sec05_try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();   //자동적으로 close(); 메소드가 호출되어서 file.txt.을 닫습니다가 나온다
			throw new Exception(); // 예외를 일부러 발생시키면 그 즉시 file.txt가 호출됨
			  // 예외가 발생하면 그 동시에 close(); 호출된다는 것. 자동적으로 호출. 그다음에
			// 캐치 실행됨. 조건은 autocloseable 인터페이스를 구현하고 있어야 한다. 
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}

	}

}
