package ApiTests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

public class SpartansTests {

    String spartanBaseUrl = "http://52.201.243.194:8000";

    @Test
    public void viewSpartanTest1() {

        //rest issue library
        Response response = RestAssured.get(spartanBaseUrl + "/api/spartans");

        //print the status code
        System.out.println(response.statusCode());

        //print body
        // System.out.println(response.body().asString());
        System.out.println(response.body().prettyPrint());


    }

    /*
    When user send Get request to api/spartans end point
    Then status code must be 200
    and body should contains Allen
     */
    @Test
    public void viewSpartanTest2() {

        Response response = RestAssured.get(spartanBaseUrl + "/api/spartans");

        //verify status code 200
        Assert.assertEquals(response.statusCode(), 200);

        //verify body contains Allen
        Assert.assertTrue(response.body().asString().contains("Allen"));

    }

    /*
    Given accept type is Json
    When user sends a get request to spartanAllURL
    Then response status code is 200
    And response body should be json format
     */

    @Test
    public void viewSpartanTest3() {

        Response response = RestAssured.given().accept(ContentType.JSON)
                //.when().get(spartanBaseUrl + "api/spartans");
                .when().get(spartanBaseUrl + "api/spartans");

        //verify status code
        Assert.assertEquals(response.statusCode(), 200);
        //verify response body json


    }


}
