//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:1F                                          *//
//* Description:A superclass employee showing        *//
//*             Inheritance and the abstract class   *//
//*             and polymorphism.                    *//
//*                                                  *//
//*Date: 19/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//

//The superclass employee
public abstract class Employee 
{
	//abstract child class provides implementation.
	public abstract String writing();

	//Declared Instance fields explicit initialisation
	//Both instance fields public so can be accessed by all classes.
	public boolean isWorking = true;
	public String company = "Limited";
		    
	    //POLYMORPHISM
	    public String takeABreak()
	    {
	    	//System.out.println("The employee takes a break!");
	    	return "The employee takes a break!";
	    }
	    //Method employee working overriding.
	    //Public accessed by all classes.
		public void working() 
		{
	    //Output on screen "working"
		System.out.println("working");
		}
}//End Class Employee



