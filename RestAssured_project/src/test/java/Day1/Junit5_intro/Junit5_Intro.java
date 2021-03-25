package Day1.Junit5_intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//setting display name of the test class in test result using @Displayname
@DisplayName("Day 1 of JUnit 5 test")
public class Junit5_Intro {

    @DisplayName("Testing numbers")
    @Test
    public void test() {
        System.out.println("Learning Junit5");

        assertEquals(1, 2);
        assertEquals(1, 2, "Something is wrong!!");

    }

    //add one more test,
    // to assert your name first character start with a
    @DisplayName("Testing Name")
    @Test
    public void testName() {
        String name = "Elvin";
        assertEquals('A', name.charAt(0));
        //  assertTrue(name.startsWith("A"));


    }


}

//Test LIfeCycle annotations
// @BeforeAll @AfterAll @BeforeEach @AfterEach
