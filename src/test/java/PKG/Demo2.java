package PKG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {

    @Test(priority=2, groups = "sanity")
    public void prueba99()
    {
        System.out.println("Prueba 1");
        Assert.assertTrue(true);
    }
}
