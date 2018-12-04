package staticpractice;

public class StaticPractice {
	
	
	public int driveWaySize;
	public static String driveWayName;
	
	public void getDriveWayInfo() {
		System.out.println(driveWaySize +"    " +driveWayName);
		}

	public static void main(String[] args) {
		
		StaticPractice adnan = new StaticPractice(); 
		adnan.driveWaySize = 25;
		StaticPractice.driveWayName = "big driveway";
		//adnan.getDriveWayInfo();
		
		StaticPractice john = new StaticPractice();
		john.driveWaySize = 50;
		StaticPractice.driveWayName = "small driveway";
		adnan.getDriveWayInfo();
		john.getDriveWayInfo();
	}

}
