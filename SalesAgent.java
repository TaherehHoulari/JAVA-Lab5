// This is CST 8284 Lab 5. Follow all instructions stated in your Lab slides carefully.
// Include all the items required in this class.

/**
   This class shows a Sales Agent with a name and age.
*/
public class SalesAgent
{  
   private String name;
   private int age;

   /**
      In this portion of your code, construct a SalesAgent object.
      @param name the name of the Sales Agent
      @param age the age of the Sales Agent
   */
   // START CODE
   public SalesAgent(String name, int age) {
	   this.name=name;
	   this.age=age;
   }
	   
		/**
		 * Name of SalesAgent, SalesSupervisor, SalesCheif will be get.
		 * @return the name for SalesAgent.
		 */
		public String getName() {
			return name;
		}


		/**
		 * Age of SalesAgent, SalesSupervisor, SalesCheif will be get.
		 * @return the age for SalesAgent.
		 */
		public int getAge() {
			return age;
		}

		/**
		 * setting the name
		 * @param name the name is set.
		 */
		public void setName(String name) {
			this.name=name;
		}
		
		/**
		 * setting the age
		 * @param age the age is set.
		 */
		public void setAge(int age) {
			this.age=age;
		}

   // END CODE

   /**
      This portion of your code returns the string representation of the object.
      @return a string representation of the object
   */

   public String toString()
   {  
      return "Sales Agent [name=" + name + ",age=" + age + "]";
   }
}