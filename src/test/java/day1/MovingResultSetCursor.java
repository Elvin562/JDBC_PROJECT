package day1;

import java.sql.*;

public class MovingResultSetCursor {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:oracle:thin:@3.95.230.40:1521:XE";
        String username = "hr";
        String password = "hr";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stm.executeQuery("SELECT * FROM REGIONS");

        /*
        These are the method of ResultSet object we can use to move the cursor accordingly
        This will only work if your result is type scroll insensitive
        rs.next() ;
        rs.previous() ;
        rs.first() ;
        rs.last() ;
        rs.beforeFirst();
        rs.afterLast();
        rs.absolute(3) ;
        */
        rs.first();
        System.out.println("FIRST ROW : " + rs.getString(2));
        rs.last();
        System.out.println("LAST ROW : " + rs.getString(2));
        rs.previous();
        System.out.println("PREVIOUS ROW : " + rs.getString(2));

        rs.beforeFirst();
        while (rs.next()) {


            System.out.println("2nd Column data = " + rs.getString(2));
        }
        // after the loop the cursor is at after last

        // MOVE TO 2ND ROW FROM THIS POINT AND PRINt REGION_NAME
        rs.absolute(2);
        System.out.println("2ND ROW REGION_NAME IS : " + rs.getString(2));

        /*
        Driver jar -->> provided through maven dependency
        DriverManager -->> locate driver using connection String beginning syntax
        DriverManager -->> continue to create connection using full connection info and username password
        Connection Object is obtained
        Statement Object is created from Connection Established above
        If not specified during creation , only the forward only ReseultSet can be created from it
        ResultSet objectis created using Statement object and calling execute query method
        It contains the data with rows and columns
        It also maintain a cursor to point to the row so data at that location can be accessed
         */






    }

}