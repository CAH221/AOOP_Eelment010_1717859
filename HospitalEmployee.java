//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:2C                                          *//
//* Description:A subclass Hospital employee which   *//
//*             inherits methods from superclass     *//
//*             Employee.                            *//
//*                                                  *//
//*Date: 28/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//

//The subclass HospitalEmployee that inherits from superclass
//Employee.
public class HospitalEmployee extends Employee 
{
	
	public String takeBreak() 
	{
       return "Go to hospital’s canteen!";

	}
	    //A specific method for HospitalEmployee subclass.
		//Public accessed by all classes.
		public String nursing()
		{   
			//Output on screen "I nurse patients!"
			return "I nurse patients!";
		}
		
}//End of class HospitlEmployee

