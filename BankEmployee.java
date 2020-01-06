//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:2A                                          *//
//* Description:A subclass Bank employee which       *//
//*             inherits methods from superclass     *//
//*             Employee.                            *//
//*                                                  *//
//*Date: 28/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//

//The subclass BankEmployee that inherits from superclass
//Employee.
public class BankEmployee extends Employee
{
    //A specific method for BankEmployee subclass.
	//Public accessed by all classes.
	public String countsMoney()
	{   
		//Output on screen "I am counting cash!"
		return "I am counting cash!";
	}
	
}//End of class BankEmployee
