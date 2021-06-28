package PKG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    //TESPLAN

    @Test (priority=2, groups="regression")
    public void  RegressionTest1()
    {
        System.out.println("Regression Test 1 - priority 2");
        Assert.assertTrue(true);
    }

    @Test (priority=1, groups="regression")
    public void  RegressionTest2()
    {
        System.out.println("Regression Test 2 - priority 1");
        Assert.assertTrue(true);
    }

    @Test (priority=3, groups={"regression","sanity"})
    public void  RegressionTest3()
    {
        System.out.println("Regression & Sanity Test Group started");
        Assert.assertTrue(true);
    }



}

