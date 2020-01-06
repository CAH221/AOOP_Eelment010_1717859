//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:2E                                          *//
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
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;  

public class EmployeeTest extends Applet {
	
    private JPanel myPanel;
    private JPanel myPanel1;
	private JButton myButtonWriting;
	private JTextArea myTextArea;
	private JButton myButtonBreak;
	private JLabel myLabel;
	private JTextField input;
    private String userInput;
    //Instantite objects for the abstract and overriding class.
	private static BankEmployee aBankEmployee = new BankEmployee();

	private static HospitalEmployee aHospitalEmployee = new HospitalEmployee();
	
	private static UniversityEmployee aUniversityEmployee = new UniversityEmployee();

	
	
	 private String Status = "";
	 
	 public void init()    
	 {
		 Status = "Initializing!"; 
		 showStatus("The applet is initializing!");
		 JOptionPane.showMessageDialog(this,Status); 
	      
		    //set flow layout left with horizontal gap 10
			//and vertical gap 20 between components
			//setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
	       myPanel = new JPanel();
	       myPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
	       //JLabels,JTextField
			myLabel = new JLabel("Type of Employee");
			input = new JTextField(10);
			myPanel.add(myLabel);
			myPanel.add(input);
			
			 //Instantite object myButtonWriting
			myButtonWriting = new JButton("Method Writing");
			myPanel.add(myButtonWriting);
			
			 //Instantite object myButtonBreak
			myButtonBreak = new JButton("Method Take a Break");
			myPanel.add(myButtonBreak);
			
			 //Instantite object myTextArea and create size.
			myPanel1 = new JPanel();
			myPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
			myTextArea = new JTextArea(5,46);
			myPanel1.add(myTextArea);
			
			add(myPanel, BorderLayout.NORTH);
			add(myPanel1, BorderLayout.SOUTH);
			
	//********************Create Action Listener for Take Break***********************************
			
			//adding an anonymous inner ActionListener to every component
			//Provides a clearer separation of the functionality of components.
			myButtonBreak.addActionListener(new ActionListener()
			{
				//Implements the Action listener interface to be 
				//able to refer cleanly to the container class.
				public void actionPerformed(ActionEvent event)
				{
					//Read in User input and convert to lower case
					userInput = input.getText().toLowerCase();
					myTextArea.setText("");
					//if userInput is true and equals bankemployee
					if (userInput.contentEquals("bankemployee"))
					{
						//call method take a break for bank employee and append results in myTextArea.
						myTextArea.append("Bank Employee is: "+aBankEmployee.takeABreak());
						//Clear User Input
						input.setText("");
					
					}
					//if the first condition is false and equals hospitalemployee
					else if (userInput.contentEquals("hospitalemployee"))
					{
						//call method take a break for hospital employee and append results in myTextArea.
						myTextArea.append("Hospital Employee is: " +aHospitalEmployee.takeABreak());
						//Clear User Input
						input.setText("");
					}
					//if the first and second condition is false and equals universityemployee
					else if (userInput.contentEquals("universityemployee"))
				    {  
						//call method take a break for university employee and append results in myTextArea.
						myTextArea.append("University Employee is:" +aUniversityEmployee.takeABreak());
						//Clear User Input
						input.setText("");
				    }
					//To be executed if the above conditions are false.
					else
					{
						//Default Case for code stability 
						 JOptionPane.showMessageDialog(null, "Mistake Wrong Entry");
						//Clear User Input
						input.setText("");
					}
					
					
				}
			});//end method
		
	//********************Create Action Listener for Writing Button***********************************		
			
			//adding an anonymous inner ActionListener to every component
			//Provides a clearer separation of the functionality of components.
			myButtonWriting.addActionListener(new ActionListener()
			{
				//Implements the Action listener interface to be 
				//able to refer cleanly to the container class.
				public void actionPerformed(ActionEvent e)
				{
					
					//Read in User input and convert to lower case
					userInput = input.getText().toLowerCase();
					myTextArea.setText("");
					//if userInput is true and equals bankemployee
					if (userInput.contentEquals("bankemployee"))
					{
						//call method writing for bank employee and append results in myTextArea.
						myTextArea.append("Bank Employee is: "+aBankEmployee.writing());
						//Clear User Input
						input.setText("");
					}
					//if the first condition is false and equals hospitalemployee
					else if (userInput.contentEquals("hospitalemployee"))
					{
						//call method writing for hospital employee and append results in myTextArea.
						myTextArea.append("Hospital Employee is: " +aHospitalEmployee.writing());
						//Clear User Input
						input.setText("");
					}
					//if the first and second condition are false and equals universityemployee
					else if (userInput.contentEquals("universityemployee"))
				    {
						//call method writing for university employee and append results in myTextArea.
						myTextArea.append("University Employee is:" +aUniversityEmployee.writing());
						//Clear User Input
						input.setText("");
				    }
					//To be executed if the above conditions are false.
					else
					{
						 //Default Case for code stability 
						 JOptionPane.showMessageDialog(null, "Mistake Wrong Entry");
						 //Clear User Input
						 input.setText("");
					}
					
				}
			});//end Method
			 repaint();
	 
	 
	 }
	 public void start() 
	 {
		  Status += " Starting!";
		  showStatus("The applet is starting");
		  JOptionPane.showMessageDialog(this,Status);
	 repaint();
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
