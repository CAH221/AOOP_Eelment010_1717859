//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:1F                                         *//
//* Description:A subclass Bank employee which       *//
//*             inherits methods from superclass     *//
//*             Employee and shows method overriding.*//
//*                                                  *//
//*Date: 19/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//

//The subclass BankEmployee that inherits from superclass
//Employee.
public class BankEmployee extends Employee
{
	//abstract class
	public String writing()
	{
		return  "Writing a cheque";
	}
	//Method Overriding.
	public String takeABreak()
	{
		//System.out.println("Go to Pub!");
		return "Go to Pub!";
	}
    
	
}//End of class BankEmployee

