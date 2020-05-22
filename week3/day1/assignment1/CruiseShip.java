package week3.day1.assignment1;

public class CruiseShip extends Ship{

	public void maximumPassengers(int passengers) {
		System.out.println("Maximum number of passangers are: "+passengers);

	}
	
	public void cruiseCategory(String category) {
		System.out.println("Cruise Category is: "+category);

	}
	
	public static void main(String[] args) {
		CruiseShip obj = new CruiseShip();
		
		obj.shipName("Titanice");
		obj.shipbuiltYear("1967");
		obj.maximumPassengers(1000);
		obj.cruiseCategory("Naval Ships");
	}
}
