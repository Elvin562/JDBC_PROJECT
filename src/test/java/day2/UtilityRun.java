package day2;

import utility.ConfigurationReader;
import utility.DB_Utility;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilityRun {

    public static void main(String[] args) throws SQLException {

     //  DB_Utility.createConnection();

        System.out.println("--------------------------------------------------");

        String url = ConfigurationReader.getProperty("hr.database.url");
        String username = ConfigurationReader.getProperty("hr.database.username");
        String password = ConfigurationReader.getProperty("hr.database.password");

        DB_Utility.createConnection(url, username, password);

        System.out.println("------------------------------------------------");
       ResultSet result= DB_Utility.runQuery("SELECT * FROM REGIONS");
        result.next();
        System.out.println("region name " + result.getString("region name"));

        System.out.println("---------------------------------------------------");

        int totalRow = DB_Utility.getRowCount() ;
        System.out.println("totalRow = " + totalRow);

        int totalColumn = DB_Utility.getColumnCount();
        System.out.println("totalColumn = "+ totalColumn);

        System.out.println("----------------------------");

        System.out.println("DB_Utility.getAllColumnNamesAsList " + DB_Utility.getAllColumnNamesAsList());

        System.out.println("---------------------------------------------------");

        System.out.println("DB_Utility.getRowDataAsList(3) = " + DB_Utility.getRowDataAsList(3));

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("DB_Utility.getCellValue(3 , 2) = " + DB_Utility.getCellValue(3 , 2));

        System.out.println("-----------------------------------------------------------------------");

        System.out.println( DB_Utility.getCellValue(3, "Region name"));

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("DB_Utility.getAllColumnNamesAsList(2) " + DB_Utility.getRowDataAsList(2));

        System.out.println("DB_Utility.getCellValue(3, \"REGION_NAME\") = "
                + DB_Utility.getCellValue(3, "REGION_NAME"));

        System.out.println("----------------------------------------------------------------");


        //        System.out.println("RIGHT NOW WE ARE AT ROW " + result.getRow() );

        System.out.println("DB_Utility.getColumnDataAsList(2) = "
                + DB_Utility.getColumnDataAsList(2));

        System.out.println("DB_Utility.getColumnDataAsList(\"REGION_NAME\") = "
                + DB_Utility.getColumnDataAsList("REGION_NAME"));

        DB_Utility.displayAllData();

        System.out.println("----------------------------------------------------------");

        System.out.println("DB_Utility.getRowMap(3)  "+ DB_Utility.getRowMap(3));

        System.out.println("-------------------------------------------------------------");

        System.out.println("DB_Utility.getAllRowAsListOfMap() = " + DB_Utility.getAllRowAsListOfMap());

        System.out.println("---------------------------------------------------------------------");




        DB_Utility.destroy();




    }
}
