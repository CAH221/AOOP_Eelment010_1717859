//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:1DE                                         *//
//* Description:A subclass Hospital employee which   *//
//*             inherits methods from superclass     *//
//*             Employee and shows method overriding.*//
//*                                                  *//
//*Date: 19/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//

//The subclass HospitalEmployee that inherits from superclass
//Employee.
public class HospitalEmployee extends Employee 
{
	    //Method overriding
	    public void takeABreak()
	    {
		System.out.println("Go to hospital's canteen!");
		}
	    //A specific method for HospitalEmployee subclass.
		//Public accessed by all classes.
		public void nursing()
		{   
			//Output on screen "I nurse patients!"
			System.out.println("I nurse patients!");
		}
		
}//End of class HospitlEmployee
