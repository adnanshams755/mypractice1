package constructor;

public class TestHouse {

	public static void main(String[] args) {
		
		
		House myHouse = new House("White house");
		
		House yourHouse = new House("Blue house", 495);
		String result =yourHouse.housea("Big", "Things");
				System.out.println(result);
		int result1 = yourHouse.houseb(10, 5);
				System.out.println(result1);
	}

}
