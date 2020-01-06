//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:1F                                          *//
//* Description:A subclass University employee which *//
//*             inherits methods from superclass     *//
//*             Employee and shows method overriding. *//
//*                                                  *//
//*Date: 19/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//

//The subclass University Employee that inherits from superclass
//Employee.
public class UniversityEmployee extends Employee
{
	         //Method overriding
	         public String takeABreak()
	        {
		       //System.out.println("Go to University Restaurant!");
	        	 return "Go to University Restaurant!";
	        }
            //Abstract class
			public String writing()
			{   
				//Output on screen "I am teaching"
				return "Writing teaching notes ";
			}
			
	}//End of class UniversityEmployee



