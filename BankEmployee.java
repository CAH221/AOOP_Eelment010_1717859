//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:1A                                          *//
//* Description:A subclass Bank employee which       *//
//*             inherits methods from superclass     *//
//*             Employee.                            *//
//*                                                  *//
//*Date: 19/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//

//The subclass BankEmployee that inherits from superclass
//Employee.
public class BankEmployee extends Employee
{
    //A specific method for BankEmployee subclass.
	//Public accessed by all classes.
	public void countsMoney()
	{   
		//Output on screen "I am counting cash!"
		System.out.println("I am counting cash!");
	}
	
}//End of class BankEmployee
