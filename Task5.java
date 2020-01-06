//****************************************************//
//* Author:1717859                                   *//
//* Week:10                                          *//
//* Task:5                                           *//
//* Description:A ssl java security program          *//
//*                                                  *//
//*                                                  *//
//*                                                  *//
//*Date: 15/11/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//

import java.sql.*;

public class Task5
{
	private static Connection aConnection = null;
	//String instance fields for filename, database, userName and password  
	private static String filename; //this will be the path to the server
	//private static String database; //this will be the schema name
	private static String userName; //this will be the users userName to access the database
	private static String password; //this will be the the users password to access the database
   
//instance field to hold filename and database name in one string 
//to conform to constraint of getConnection(3 string argument)
private static String fileDBNames;

	public static void main (String[] args)
	{


		try
		{
			String filename = "jdbc:mysql://ecommsvr5:3306/sample?verifyServerCertificate=false&useSSL=true&requireSSL=true";
			userName = "hillc_aoop";
			String password = "1717859";

			//explicitly load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			aConnection = DriverManager.getConnection(filename, userName, password);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			System.out.println("The exception connecting to the database: " + ex);
		}




  }//end main
}//end class

