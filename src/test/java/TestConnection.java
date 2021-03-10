import java.sql.*;

public class TestConnection {


        /**
         * host: 3.95.230.40
         * port: 1521
         * SID:XE
         * user:hr
         * pass: hr
         *
         * jdbc url AKA connection string
         * syntax:
         * jdbc: vendorName: driverType@YourHost:PORT:SID
         *
         * jdbc:oracle:thin:@3.95.230.40:1521:XE

          */

        public static void main(String[] args)  {
        String url = "jdbc:oracle:thin:@3.95.230.40:1521:XE";
         try {

             Connection con = DriverManager.getConnection(url, "hr", "hr");

         System.out.println("CONNECTION SUCCESSFUL");
         con.close();

         }catch(SQLException e){
         System.out.println("CONNECTION HAS FAILED "+ e.getMessage());
         }

    }
}