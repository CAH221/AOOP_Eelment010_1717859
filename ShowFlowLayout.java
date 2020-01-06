//****************************************************//
//* Author:1717859                                   *//
//* Week:4                                           *//
//* Task:1F                                          *//
//* Description:A class show flow layout which       *//
//*             displays the JFrame and the GUI with *//
//*             components and displays the contents*//
//*             of an abstract class and Method      *//
//*             overriding.                          *//
//*Date: 19/10/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ShowFlowLayout extends JFrame {
	//All components in JFrame
	private JButton myButtonWriting;
	private JTextArea myTextArea;
	private JButton myButtonBreak;
	private JLabel myLabel;
	private JTextField input;
    private String userInput;
    //Instantite objects for the abstract and overriding class.
	private static BankEmployee TakeBreakBankEmployee = new BankEmployee();
	private static BankEmployee WritingBankEmployee = new BankEmployee();
	private static HospitalEmployee WritingHospitalEmployee = new HospitalEmployee();
	private static HospitalEmployee TakeBreakHospitalEmployee = new HospitalEmployee();
	private static UniversityEmployee WritingUniversityEmployee = new UniversityEmployee();
	private static UniversityEmployee TakeBreakUniversityEmployee = new UniversityEmployee();
	
   
	//Class Name to show the layout type
	public ShowFlowLayout()
	{
		//set flow layout left with horizontal gap 10
		//and vertical gap 20 between components
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		//JLabels,JTextField
		myLabel = new JLabel("Type of Employee");
		input = new JTextField(10);
		add(myLabel);
		add(input);
		
		 //Instantite object myButtonWriting
		myButtonWriting = new JButton("Method Writing");
		add(myButtonWriting);
		
		 //Instantite object myButtonBreak
		myButtonBreak = new JButton("Method Take a Break");
		add(myButtonBreak);
		
		 //Instantite object myTextArea and create size.
		myTextArea = new JTextArea(5,46);
		add(myTextArea);
		
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
				
				//if userInput is true and equals bankemployee
				if (userInput.contentEquals("bankemployee"))
				{
					//call method take a break for bank employee and append results in myTextArea.
					myTextArea.append("Bank Employee is: "+WritingBankEmployee.takeABreak());
					//Clear User Input
					input.setText("");
				}
				//if the first condition is false and equals hospitalemployee
				else if (userInput.contentEquals("hospitalemployee"))
				{
					//call method take a break for hospital employee and append results in myTextArea.
					myTextArea.append("Hospital Employee is: " +WritingHospitalEmployee.takeABreak());
					//Clear User Input
					input.setText("");
				}
				//if the first and second condition is false and equals universityemployee
				else if (userInput.contentEquals("universityemployee"))
			    {  
					//call method take a break for university employee and append results in myTextArea.
					myTextArea.append("University Employee is:" +WritingUniversityEmployee.takeABreak());
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
				
				//if userInput is true and equals bankemployee
				if (userInput.contentEquals("bankemployee"))
				{
					//call method writing for bank employee and append results in myTextArea.
					myTextArea.append("Bank Employee is: "+WritingBankEmployee.writing());
					//Clear User Input
					input.setText("");
				}
				//if the first condition is false and equals hospitalemployee
				else if (userInput.contentEquals("hospitalemployee"))
				{
					//call method writing for hospital employee and append results in myTextArea.
					myTextArea.append("Hospital Employee is: " +WritingHospitalEmployee.writing());
					//Clear User Input
					input.setText("");
				}
				//if the first and second condition are false and equals universityemployee
				else if (userInput.contentEquals("universityemployee"))
			    {
					//call method writing for university employee and append results in myTextArea.
					myTextArea.append("University Employee is:" +WritingUniversityEmployee.writing());
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
	}//end Class
	
	
	public static void main(String[]args)
	{
		//Instantiate a frame object
		ShowFlowLayout frame = new ShowFlowLayout();
		//call JFrame methods for visuals and behaviours.
		frame.setTitle("Employee Type");//set the title
		frame.setSize(550,200);//Frame size width and height in pixels
	    frame.setLocationRelativeTo(null);//centre the frame on screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when user closes frame application will terminate
		frame.setVisible(true);//Display the frame
	}

	
}//end class
