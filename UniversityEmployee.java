//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:2C                                          *//
//* Description:A subclass University employee which *//
//*             inherits methods from superclass     *//
//*             Employee.                            *//
//*                                                  *//
//*Date: 28/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//

//The subclass University Employee that inherits from superclass
//Employee.
public class UniversityEmployee extends Employee
{
			public String takeBreak() 
			{
				return "Go to University’s Restaurant!";

			}
            //A specific method for UniversityEmployee subclass.
			//Public accessed by all classes.
			public String teachStudents()
			{   
				//Output on screen "I am teaching"
				return "I am teaching!";
			}
			
	}//End of class UniversityEmployee


