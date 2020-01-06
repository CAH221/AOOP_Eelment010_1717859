//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:2D                                          *//
//* Description:Class EmployeeTest which creates     *//
//*             instances of the objects BankEmployee*//
//*             HospitalEmployee, UniversityEmployee *//
//*             all which extend class Employee.     *//
//*                                                  *//
//*Date: 28/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//
import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JOptionPane;  

public class EmployeeTest extends Applet {

	//Instantiate a bank, university and employee object.
	//All objects are private.
	private static BankEmployee aBankEmployee = new BankEmployee();
	private static UniversityEmployee aUniversityEmployee = new UniversityEmployee();
	private static HospitalEmployee aHospitalEmployee = new HospitalEmployee();
	
	 private String Status = "";
	 
	 public void init()    
	 {
		 Status = "Initializing!"; 
		 showStatus("The applet is initializing!");
		 JOptionPane.showMessageDialog(this,Status);        
	 repaint();     
	 }
	 public void start() 
	 {
		  Status += " Starting!";
		  showStatus("The applet is starting");
		  JOptionPane.showMessageDialog(this,Status);
	 repaint();
	  }
	 /* (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paint( Graphics g )    
	 {// call inherited version of method paint      
		 super.paint( g );        // draw rectangle starting from (15, 10) that is 270   
		 // pixels wide and 20 pixels tall       
		 g.drawRect(15, 10, 470, 100 );
		
		 g.drawString("The Bank Employee is out  " +aBankEmployee.takeBreak(),30,30);
		 g.drawString("The Bank Employee is out " +aHospitalEmployee.takeBreak(),30,50);
		 g.drawString("The Bank Employee is out " +aUniversityEmployee.takeBreak(),30,70);
		 
	  }
	  public void stop()
	  {
		  Status += "--Stoping!";
		  showStatus("The applet is stoping");
		  JOptionPane.showMessageDialog(this,Status);
		  repaint();  
	  }
	  public void destroy()
	  {
		  Status += "--Destroyeed!";
		  showStatus("The applet is being destroyed");
		  JOptionPane.showMessageDialog(this,Status);
		  repaint();
	  }
	 
	 
}//End Class
