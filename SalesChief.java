/**
This class shows a Sales Supervisor that inherits from  the Class SalesAgent
with a name, age and location.
*/
public class SalesChief extends SalesSupervisor{

	public String department;
	
	
	/**
	 *construct a SalesChief object with the name, age,location and department as a parameters.
	 * @param name name component of the Sales Chief of SalesChief.
	 * @param age age component of the Sales SalesChief of SalesChief.
	 * @param location location component of the Sales Chief of SalesChief.
	 * @param department department component of the Sales Chief of SalesChief.
*/

	
	 public SalesChief(String name, int age, String location, String department) {
		 super(name, age, location);
		 this.department=department;
		 
	 }
	
	   /**
  This portion of the code returns the string representation of the object.
  @return a string representation of the object
*/

public String toString()
{  
  return "Sales Chief [super=Sales Supervisor [super= Sales Agent [name=" + getName() + ",age=" + getAge() + "]"+ ", location= " + location + " ,department= "+department+ "]";
}
}
