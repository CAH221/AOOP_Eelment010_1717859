//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:1A                                          *//
//* Description:A superclass employee showing        *//
//*             Inheritance.                         *//
//*                                                  *//
//*                                                  *//
//*Date: 19/10/2019                                  *//
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
	
	    //Method employee working.
	    //Public accessed by all classes.
		public void working() 
		{
	    //Output on screen "working"
		System.out.println("working");
		}
        //Method employee holidays.
		//Public accessed by all classes.
        public void holiday() 
        {
        //Output on screen "On holidays"
        System.out.println("On holidays");
        }
}//End Class Employee

