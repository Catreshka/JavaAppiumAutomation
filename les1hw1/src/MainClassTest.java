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
    public void testGetLocalNumber()
    {
        int expected = 14;
        MainClass MC = new MainClass();
        Assert.assertEquals("Method getLocalNumber return a number other than 14",expected, MC.getLocalNumber());

    }

}
