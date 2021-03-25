package day1;

import java.sql.*;

public class JDBC_FirstStep {
    public static void main(String[] args) throws SQLException{


        String url = "jdbc:oracle:thin:@100.25.193.95:1521:XE";
        try {
            Connection con = DriverManager.getConnection(url, "HR", "hr");

            //create statement
            //there are 2 type of statement                   whatever result i got
            //this way creating statement object allow us to move forward and backward easily when
            //navigating through the result we got
            Statement stmnt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            //result set
            ResultSet rs = stmnt.executeQuery("SELECT * FROM REGIONS");

            //IN ORDER TO ACCESS RESULTSET , WE NEED TO KNOW WICH ROW WE ARE AT
            // BEFORE ENTERING THE FIRST ROW, THE CURSOR OF THE RESULTSET IS AT THE LOCATION KNOWN AS -- BEFORE FIRST
            //IN ORDER TO HAVE TO NEXT LINE WE NEED TO CALL NEXT METHOD OF RESULTSET
            //IN ORDER TO GET ANY COLUMN DATA WE NEED TO CALL METHOD getString or getDouble ... ans so on

            //result set only contain the data
            rs.next();
            //now we are at the first row
            System.out.println("FIRST ROW REGION_NAME IS: " + rs.getString("REGION_NAME"));

            //second row
            rs.next();
            System.out.println("SECOND ROW REGION_NAME IS: " + rs.getString("REGION_NAME"));

            rs.next();
            System.out.println("THIRD ROW REGION_NAME IS: " + rs.getString("REGION_NAME"));


            rs.next();
            System.out.println("FORTH ROW REGION_NAME IS: " + rs.getString("REGION_NAME"));


            System.out.println("CONNECTION SUCCESSFUL");

            rs.close();
            stmnt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("CONNECTION HAS FAILED " + e.getMessage());
        }


    }
}
