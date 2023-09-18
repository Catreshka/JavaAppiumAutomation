import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest {

    @Before
    public void testStart()
    {
        System.out.println("Start test");
    }

    @After
    public void testFinish()
    {
        System.out.println("Finish test");
    }

    @Test
    public void testGetClassString()
    {
        String expectedFirst = "hello";
        String expectedSecond = "Hello";
        MainClass MC = new MainClass();
        String message = MC.getClassString();
        if (message.contains(expectedFirst)) {
            System.out.println("Method testGetClassString contains /"+expectedFirst+"/");
        } else if (message.contains(expectedSecond)) {
            System.out.println("Method testGetClassString contains /"+expectedSecond+"/");
        } else {
            Assert.fail("Method testGetClassString does not contain /"+ expectedFirst+"/ or /"+ expectedSecond+"/");
        }
    }
}
