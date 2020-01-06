//****************************************************//
//* Author:1717859                                   *//
//* Week:6                                           *//
//* Task:3Ci                                         *//
//* Description:Inserting 5 records into the JDBC    *//
//*             Employees book                       *//
//*                                                  *//
//*                                                  *//
//*Date: 06/11/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// example of JDBC connecting to your ecommsvr5 and 
// to one of your previously created databases


//INSERT FIVE RECORDS
public class Task3c_i 
{
	   private static Statement stmt = null;
       private static Connection aConnection;
       private static String filename= "";
       private static String database= "";
       private static String userName= "";
       private static String password= "";
       private static String databaseConn = "";
       private static String sql = "";
       private static ResultSet rs;
       
       public static void main(String args[])
       {              
              try
              {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     System.out.println("This Recorded has been updated");
              }
              catch(ClassNotFoundException x)
              
              {
                     System.out.println("Cannot find driver class. Check CLASSPATH");
                     return;
              }
       
              try
              {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                     //Connecting to eccommsvr5
            	     filename = "jdbc:mysql://ecommsvr5:3306/";
            	     //Database name
                     database = "hillcoop";
					 
                     //User name                                 
                     userName = "hillc_aoop";
                     //Password
                     password = "1717859";
                     //Filename and database schema into string
                     databaseConn = filename + database;
                     //Connection to database
                     aConnection = DriverManager.getConnection(databaseConn,userName,password);  
                     
                     //testing statement
                     System.out.println("Inserting records into the table...");
                     //statement for querying database
                     stmt = aConnection.createStatement();   
                     
                     //insert correct row values into the database
                     sql = "INSERT INTO myemployeesbook " +
                   "VALUES ('Kellie5', 1717867, 'Payroll', 100000.5, 5, 'a', 'b', ' c', 'd','e' )";
                     stmt.executeUpdate(sql);
                     //check by name records have been added
                     sql = "SELECT * FROM myemployeesbook";
                     rs = stmt.executeQuery(sql);                     
                   
                     //Extract data from result set
                     while(rs.next()){
                        //Retrieve by column name
                        String theName  = rs.getString("aName");
              
                        //Display values
                        System.out.print("Name:  " + theName + "\n");
                    
                     }                                  
              }
              catch(SQLException x) 
              {
                     System.out.println("Exception connecting to database:" + x);
                     return;
              }//end try...catch              
              System.out.println("MySQL JDBC Driver Registered!");
       } //end main      
}//end class




