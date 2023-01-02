/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.This main class is the test for the class SalesAgent and it's subclasses SalesSupervisor and SalesChief.
 * @author SeyedehTahereh Houlari
 * @version 1.0
 * @since 11
 */
public class SalesAgentTest2 {
	/**
	 * @param args
	 * consider the main method in the class SalesAgentTest2 to calculate what we need in lab5
	 */
	public static void main(String[] args) {
		
		SalesAgent inputAge = new SalesAgent("SeyedehTahereh", 35);
		System.out.println(inputAge);
		
		SalesAgent inputSecondAge = new SalesAgent("Tara", 25);
		System.out.println(inputSecondAge);

		
		SalesSupervisor inputSuper = new SalesSupervisor("Daniel", 30, "Perth");
		System.out.println(inputSuper);
		
		SalesChief inputChief = new SalesChief("SeyedehTahereh", 35, "Ottawa", "Bakery");
		System.out.println(inputChief);
}
}
