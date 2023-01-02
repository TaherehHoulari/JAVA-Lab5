/**
   This class shows a Sales Supervisor that inherits from  the Class SalesAgent
   with a name, age and location.
*/
public class SalesSupervisor extends SalesAgent{
	
	
	public String location;
	
	
	/**
	 * In this portion of the code, construct a SalesSupervisor object with the name, age, and location as a parameters.
	 * @param name name component of the Sales Supervisor of SalesSupervisor.
	 * @param age age component of the Sales Supervisor of SalesSupervisor.
	 * @param location location component of the Sales Supervisor of SalesSupervisor.
 */

	
	 public SalesSupervisor(String name, int age, String location) {
		 super(name, age);
		 this.location=location;
		 
	 }
	
	   /**
     This portion of the code returns the string representation of the object.
     @return a string representation of the object
  */

  public String toString()
  {  
     return "Sales supervisor [super=Sales Agent [name=" + getName() + ",age=" + getAge() + "]" + ",location=" + location + "]";
}
}
