//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:2C                                          *//
//* Description:A superclass employee showing        *//
//*             returning working and holiday class  *//
//*                                                  *//
//*                                                  *//
//*Date: 28/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//

//The superclass employee
public class Employee 
{
	//Declared Instance fields explicit initialisation
	//Both instance fields public so can be accessed by all classes.
	public boolean isWorking = true;
	public String company = "Limited";
	//Public String takeBreak
	public String takeBreak() 
	{
		   return "the employee takes a break";

	}
	//Public String working method   
	public String working() 
	{
		return "working";

    }
	//Public Sting Holiday method
	public String holiday() 
	{
		return "On holidays";
	}
}//End Class Employee

