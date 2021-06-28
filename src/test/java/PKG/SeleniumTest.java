package PKG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumTest {

    //TESPLAN

    @Test (priority=2, groups="sanity")
    public void  RegressionTest1()
    {
        System.out.println("Regression Test 1 - priority 2");
        Assert.assertTrue(true);
    }


}

