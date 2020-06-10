package sec07.exam04_array_management;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) { // Å¸ÀÌ¾î°¡ ÆãÅ©³­ °æ¿ì
				System.out.println(car.tires[problemLocation-1].location + " HankookTire·Î ±³Ã¼");  //¸®ÅÏ°ª¿¡¼­ 1 »©Áà¾ß ÀÎµ¦½º°ªµÊ
				car.tires[problemLocation -1] = 
						new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("--------------------------------------------");
		}

	}

}
