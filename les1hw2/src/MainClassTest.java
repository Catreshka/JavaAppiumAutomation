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
    public void testGetClassNumber() {
        int expected = 45;
        MainClass MC = new MainClass();
        Assert.assertTrue("Method getLocalNumber return a number is not more than 45",MC.getClassNumber() > expected);
    }
}
