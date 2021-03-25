package Day1.Junit5_intro;

import org.junit.jupiter.api.*;

//Test LIfeCycle annotations
// @BeforeAll @AfterAll @BeforeEach @AfterEach

@DisplayName("Learning Test Lifecycle Annotations")
public class TestLifecycleAnnotations {

    /*
This is the output  of above Test class

Before All is running
Before Each is running
Test 1 is running
After Each is running
Before Each is running
Test 2 is running
After Each is running
After All is running
 */

   @BeforeAll
   //write only once!!!
   //like backround!!!
   public static void init(){
       System.out.println("Before All is running");
   }

   @AfterAll
   public static void  close(){
       System.out.println("After All is running");
   }

   @BeforeEach
   public void  initEach(){
       System.out.println("Before Each is running");
   }
   @AfterEach
   public void  tearDownEach(){
       System.out.println("After Each is running");
   }


    @Test
    public void test1(){
        System.out.println("Test 1 is running");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running");
    }

    //ignoring certain test
    //using @Disabled annotaion
    @Disabled
    @Test
    public void test3(){
        System.out.println("Test 2 is running");
    }



}

