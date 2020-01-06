//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:1F                                         *//
//* Description:A subclass Hospital employee which   *//
//*             inherits methods from superclass     *//
//*             Employee and shows method overriding.*//
//*             and abstract class.                  *//
//*Date: 19/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//
//The subclass BankEmployee that inherits from superclass
//Employee.
public class HospitalEmployee extends Employee
{
	//abstract class
	public String writing()
	{
		return "Writing a prescription";
	}
	//Method Overriding.
	public String takeABreak()
	{
		
		return "Go to hospital's canteen!";
	}
    
	
}//End of class HospitalEmployee


	
