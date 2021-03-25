package day2;

import utility.ConfigurationReader;
import utility.DB_Utility;

public class PracticeUtility_BookIt {

    public static void main(String[] args) {

        String url      = ConfigurationReader.getProperty("library1.database.url");
        String username = ConfigurationReader.getProperty("library1.database.username") ;
        String password = ConfigurationReader.getProperty("library1.database.password");


        DB_Utility.createConnection(url, username, password);

        DB_Utility.runQuery("select * froms books");

        DB_Utility.displayAllData();









    }
}
