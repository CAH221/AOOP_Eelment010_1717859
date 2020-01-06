//****************************************************//
//* Author:1717859                                   *//
//* Week:6                                           *//
//* Task:3Cii                                         *//
//* Description:Inserting 5 records into the JDBC    *//
//*             Library book                         *//
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
public class Task3cii 
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
            	     //database name
                     database = "hillcoop";
					 
                     //username                                  
                     userName = "hillc_aoop";
                     //password
                     password = "1717859";
                     //Filename and database schema into string
                     databaseConn = filename + database;
                     //connection to database
                     aConnection = DriverManager.getConnection(databaseConn,userName,password);  
                   
                     
                     System.out.println("Inserting records into the table...");
                     //statement for querying database
                     stmt = aConnection.createStatement();
                   
                                   sql = "INSERT INTO mylibrarybooks " +
                                  "VALUES ('Kellie5', 271119, 'JC', 'The Bully', 4, 'ARU', 31219)";
                     stmt.executeUpdate(sql);
                     
                     sql = "SELECT * FROM mylibrarybooks";
                     rs = stmt.executeQuery(sql);                     
                   
                     //STEP 5: Extract data from result set
                     while(rs.next()){
                        //Retrieve by column name
                        String theBorrowerName  = rs.getString("aBorrowerName");

                        //Display values
                        System.out.print("Borrower Name:  " + theBorrowerName + "\n");
                       
                     }
                                  
              }
              catch(SQLException x) 
              {
                     System.out.println("Exception connecting to database:" + x);
                     return;
              }
              
              System.out.println("MySQL JDBC Driver Registered!");
       }//end main
       
}//end class




