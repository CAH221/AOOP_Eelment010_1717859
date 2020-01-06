//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:1DE                                         *//
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
	         public void takeABreak()
	        {
		       System.out.println("Go to University Restaurant!");
	        }
            //A specific method for UniversityEmployee subclass.
			//Public accessed by all classes.
			public void teachStudents()
			{   
				//Output on screen "I am teaching"
				System.out.println("I am teaching!");
			}
			
	}//End of class UniversityEmployee


