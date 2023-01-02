/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.This main class is the test for the class SalesAgent and it's subclass SalesSupervisor.
 * @author SeyedehTahereh Houlari
 * @version 1.0
 * @since 11
 */
public class SalesAgentTest {
	/**
	 * @param args
	 * consider the main method in the class SalesAgentTest to calculate what we need in lab5
	 */
	
	public static void main(String[] args) {
		
		SalesAgent inputAge = new SalesAgent("SeyedehTahereh", 35);
		System.out.println(inputAge);

		
		SalesSupervisor inputSuper = new SalesSupervisor("SeyedehTahereh", 35, "Ottawa");
		System.out.println(inputSuper);
}
}