package constructor;

public class House {
	
	String houseName;
	int houseAddress;
 
	public House() {}
	
	public House(String houseName) {
		this.houseName = houseName;
		System.out.println(houseName);
		
		}
	public House(String houseName, int houseAddress) {
		this.houseName = houseName;
		this.houseAddress = houseAddress;
		System.out.println(houseName + "  " + houseAddress);
		
	}
	
	public String housea(String st1, String st2) {
		String pthouse = st1 + st2;
		return pthouse;
	}
	public int houseb(int st1, int st2) {
		int pthouse = st1 + st2;
		return pthouse;
	}
	
}
