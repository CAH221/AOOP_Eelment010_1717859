//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:1B                                          *//
//* Description:Class EmployeeTest which creates     *//
//*             instances of the objects BankEmployee*//
//*             HospitalEmployee, UniversityEmployee *//
//*             all which extend class Employee.     *//
//*                                                  *//
//*Date: 20/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//

public class EmployeeTest {

	//Instantiate a bank, university and employee object.
	//All objects are private.
	private static BankEmployee aBankEmployee = new BankEmployee();
	private static UniversityEmployee aUniversityEmployee = new UniversityEmployee();
	private static HospitalEmployee aHospitalEmployee = new HospitalEmployee();
	
	//Method main to run the program.
	public static void main(String []args) 
	{   
		//BankEmployee object calls class method countsMoney.
		aBankEmployee.countsMoney();
		//BankEmployee inherits method working from superclass Employee.
		aBankEmployee.working();
		//UniversityEmployee object calls class method teachStudents.
		aUniversityEmployee.teachStudents();
		//UniversityEmployee inherits method working from superclass Employee.
		aUniversityEmployee.working();
		//HospitalEmployee object calls class method nursing.
		aHospitalEmployee.nursing();
		//HospitalEmployee inherits method holidays from superclass Employee.
		aHospitalEmployee.holiday();
		
	}
	
}//End of Class EmployeeTest
