//mysql> ALTER TABLE testalter_tbl  DROP i;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// example of JDBC conencting to your ecommsvr5 and 
// to one of your previously created databases


//INSERT FIVE RECORDS
public class Task3f 
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
                     filename = "jdbc:mysql://ecommsvr5:3306/";
                     database = "hillcoop";
					 //here xxxxx is your name, e.g. _sergiu or _victor etc.
                                                       
                     userName = "hillc_aoop";
                     password = "1717859";
                     
                     databaseConn = filename + database;
                     
                     aConnection = DriverManager.getConnection(databaseConn,userName,password);  
                     
                     
                     System.out.println("Inserting records into the table...");
                     stmt = aConnection.createStatement();
                     /*
                      * aName VARCHAR(255),
					    DateOfEmployment int,
					    Role VARCHAR(255),
					    Salary double,
					    YearsOfEmployment int    
                      */
                     sql = "INSERT INTO myemployeesbook " +
                                  "VALUES ('Zara4', 271119, 'cleaner4', 100000.5, 18, 'red', 'coward', 'Russia', 'Russia')";
                     stmt.executeUpdate(sql);
                     
                     sql = "SELECT * FROM myemployeesbook";
                     rs = stmt.executeQuery(sql);                     
                   
                     //Extract data from result set
                     while(rs.next()){
                        //Retrieve by column name
                        String theName  = rs.getString("aName");
                        //int age = rs.getInt("age");
                       // String first = rs.getString("first");
                        //String last = rs.getString("last");

                        //Display values
                        System.out.print("Name:  " + theName + "\n");
                        //System.out.print(", Age: " + age);
                      //  System.out.print(", First: " + first);
                     }     
                     
                     
                     //ALTER TABLE testalter_tbl  DROP i
                     sql = "ALTER TABLE myemployeesbook " +
                             "ADD Country3 VARCHAR(255)";
                     stmt.executeUpdate(sql);
                     
                     
                     //TODO*************************
                     //INSERT INTO 'records' ('id', 'time') VALUES (NULL, time);
                     //sql = "INSERT INTO myemployeesbook ('Country2')" +
                      //     "VALUES ('Russia')";
                    ///stmt.executeUpdate(sql);
              }
              catch(SQLException x) 
              {
                     System.out.println("Exception connecting to database:" + x);
                     return;
              }//end try...catch              
              System.out.println("MySQL JDBC Driver Registered!");
       } //end main      
}//end class




