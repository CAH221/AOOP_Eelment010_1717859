//****************************************************//
//* Author:1717859                                   *//
//* Week:9                                          *//
//* Task:3Cii                                       *//
//* Description:A multi_thread JDBC Program          *//
//*             showing 10 user access.               *//
//*                                                  *//
//*                                                  *//
//*Date: 06/11/2019                                  *//
//*                                                  *//
//*                                                  *//
//****************************************************//



import java.sql.*;


public class MyTask4 extends Thread
{
  // Default no of threads to 10
  private static int NUM_OF_THREADS = 10;

  private int m_myId;
  private static int c_nextId = 1;
  private static Connection s_conn = null;
  private static boolean   share_connection = false;

  
  private static String filename = "";
  private static String database = "";
                                    
  private static String userName = "";
  private static String password = "";
  
  private static String databaseConn = "";
  
  private static Connection aConnection;
  
  private static boolean greenLight = false;
  
  private static int count;
  
  //=============================================================================================================//
  
  public MyTask4(String message)
  {
	  message = "Matrix loaded!";
	  
	  System.out.println("Matrix loaded!");
  }
  
  public MyTask4()
  {
     super();
     // Assign an Id to the thread
     m_myId = getNextId();
  }
  
  //Keep other threads waiting until object is available
  synchronized static int getNextId()
  {
      return c_nextId++;
  }


  
  
  public static synchronized void setGreenLight()
  { 
	greenLight = true; 
  }
  
  synchronized boolean getGreenLight() 
  { 
	return greenLight; 
  }
  
  
  
  public static void main (String args [])
  {
    try  
    {  
      /* Load the JDBC driver */
    	// We have added as external JAR file the DataBase (DB) driver.
    	
     // DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
  
      // If NoOfThreads is specified, then read it
     

      share_connection = true;
      System.out.println("All threads will be sharing the same connection");
      
  
      // get the no of threads if given      
      NUM_OF_THREADS = 10;
  
      // get a shared connection 
          
      filename = "jdbc:mysql://ecommsvr5:3306/";
      database = "hillcoop";
		 //here xxxxx is your name, e.g. _sergiu or _victor etc.
                                        
      userName = "hillc_aoop";
      password = "1717859";
      
      databaseConn = filename + database;
      
      aConnection = DriverManager.getConnection(databaseConn,userName,password);  
    
      
      // Create the threads
      Thread[] threadList = new Thread[NUM_OF_THREADS];

      // spawn threads
      for (int i = 0; i < NUM_OF_THREADS; i++)
      {
          threadList[i] = new MyTask4();
          threadList[i].start();
      }
    
      // Start everyone at the same time
      setGreenLight ();

      // wait for all threads to end
      for (int i = 0; i < NUM_OF_THREADS; i++)
      {
          threadList[i].join();
      }

      if (share_connection)
      {
    	  aConnection.close();
    	  aConnection = null;
      }
          
     
    }
    catch (Exception e)
    {
       e.printStackTrace();
    }
  
 
  }  


//Method run to be executed by new thread
  public void run()
  {
    ResultSet     rs   = null;
    Statement  stmt = null;

    try
    {    
      // Get the connection

      if (share_connection)
	  {
        stmt = aConnection.createStatement (); // Create a Statement
	  }
      
      while (!getGreenLight())
	  {
    	  
    	//to temporarily release time for other threads  
        yield();
	  }
          
      // Execute the Query
      rs = stmt.executeQuery ("SELECT * FROM myemlpoyeesbook_aoop");
          
    // share_connection = false;
      // Loop through the results
      while (rs.next())
      {
    	  //myemlpoyeesbook_aoop (FirstName, LastName, role, salary, yearOfEmployment)
    	  System.out.println("Thread " + m_myId + " ORIGINAL TABLE IS - " +
                           " FirstName : " + rs.getString(1)
                           + " Last Name : " + rs.getString(2)
                           + " role : " + rs.getString(3)
                           + " salary : " + rs.getString(4)
                           + " yearOfEmployment : " + rs.getString(5));
                           
          yield();  // Yield To other threads
        
          greenLight = false;
          share_connection = false;
      }
          
      
      
      count = stmt.executeUpdate ("DELETE FROM myemlpoyeesbook_aoop WHERE FirstName='Caroline'");
      if (count>0)
      {
    	  System.out.println("Thread that did it again: " + m_myId);
      }
      
     // DELETE FROM Customers WHERE CustomerName='Alfreds Futterkiste';
      
      
      // Execute the Query
      rs = stmt.executeQuery ("SELECT * FROM myemlpoyeesbook_aoop");
          
      // share_connection = false;
      // Loop through the results
      while (rs.next())
      {
    	  //myemlpoyeesbook_aoop (FirstName, LastName, role, salary, yearOfEmployment)
    	  System.out.println("Thread " + m_myId +  " FINAL TABLE IS - " +
                           " FirstName : " + rs.getString(1)
                           + " Last Name : " + rs.getString(2)
                           + " role : " + rs.getString(3)
                           + " salary : " + rs.getString(4)
                           + " yearOfEmployment : " + rs.getString(5));
                           
          yield();  // Yield To other threads
        
          greenLight = false;
          share_connection = false;
      }
      
      // Close all the resources
      rs.close();
      rs = null;
  
     
      // Close the statement
      stmt.close();
      stmt = null;
    

      System.out.println("Thread " + m_myId +  " is finished. ");
    }
    catch (Exception e)
    {
      System.out.println("Thread " + m_myId + " got Exception: " + e);
      e.printStackTrace();
      return;
    }
  
  }//end main

  

}//end class
