package FirstTest;

import org.testng.annotations.*;

@Test
public class BeforeAndAfterMethods {
    @BeforeClass
    public void setUp(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void BeforeMethods() {
        System.out.println("\t\tInside of test method 1");
    }
    
//    @Test(priority = 0)
    public void testOne() {
        System.out.println("\tInside of test methods");
    }

//    @Test(priority = 1)
    public void testTwo() {
        System.out.println("\tInside of test methods");
    }

//    @Test(priority = 2)
    public void testThree() {
        System.out.println("\tInside of test methods");
    }

    @AfterMethod
    public void affterMethods(){
        System.out.println("\tInside of affter methods");
    }

    @AfterClass
    public void shuttingDown() {
        System.out.println("After class");
    }
}