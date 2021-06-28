package PKG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test(priority=2, groups = "sanity")
    public void prueba1()
    {
        System.out.println("Prueba 1");
        Assert.assertTrue(true);
    }
}
