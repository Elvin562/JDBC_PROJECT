package practice;

import org.junit.Assert;
import org.junit.Test;
import utility.DB_Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day1 {

    /*

1.Find out longest First name character count in Employees table
2.Find out those FirstName if character count is same as max character count (there could be more than 1)
3.Find put longest full name in Employees Table
4.Find out all City Names and Department_Name in these cities
5.Find out all City Names and Department_Name in these cities (Include those cities without any department match)
6.Find out all City Names and Count of Department in these cities
7.Find out Employee Name and Country Name (multiple join)
8.Find out how many employees in each country
9.From above result , include those countries without any employee
 10.We will practice some of them in class and excuse any typos from my phone :iphone:
         */

    @Test
    public void test3(){

        String query = "SELECT FIRST_NAME\n" +
                "FROM EMPLOYEES\n" +
                "WHERE LENGTH(FIRST_NAME) * (SELECT MAX(LENGTH(FIRST_NAME)) FROM EMPLOYEES );";


        DB_Utility.createConnection();
        DB_Utility.runQuery(query);
        DB_Utility.getColumnDataAsList(1);
        List<String> names = new ArrayList<>(Arrays.asList("Christopher", "Jose Manuel"));

        Assert.assertEquals(names,  DB_Utility.getColumnDataAsList(1));








    }
}
