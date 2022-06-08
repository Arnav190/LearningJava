package Unit_05;

// 07-06-2022 -> Tuesday(Theory)

// 08-06-2022 -> Wednesday(Theory)

import java.sql.*;

public class P18_JDBC_Connection {
    
	public static void main(String[] args) throws SQLException {

		Connection myConn = null; // All 3 are interfaces. 
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
             myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase", "root" , "G1u2p3t4a5*");
             // getConnection return connection interface.
             
             myStmt = myConn.createStatement();
             // createStatement return statement interface.
             

             int a = myStmt.executeUpdate("INSERT INTO jdbc_tbl VALUES (5, 'Mysql', 'Akbar', '2021-02-18')");
             // executeUpdate query always use for modification.
             
             myRs = myStmt.executeQuery("select * from jdbc_tbl");
             // executeQuery use when no modifications occurs and we want only result.
        
             while (myRs.next()) {
                 System.out.println(myRs.getString("jdbc_id") + ", " +
                 myRs.getString("title") + ", " + myRs.getString("author") + ", " +
                 myRs.getString("submission_date"));
             }
        }

        catch (Exception exc) {
            exc.printStackTrace();
        }
 
        finally {
             myRs.close();
             myStmt.close();
             myConn.close();
             }
   }
}
