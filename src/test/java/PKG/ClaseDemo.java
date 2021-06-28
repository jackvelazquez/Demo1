package PKG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClaseDemo {

    @Test (priority=2, groups = "sanity")
    public void prueba1()
    {
        System.out.println("Prueba 1");
        Assert.assertTrue(true);
    }

    @Test (priority=1, groups = "sanity")
    public void prueba2()
    {
        System.out.println("Prueba 2");
        Assert.assertTrue(true);
    }

    @Test (priority=1, groups = "sanity")
    public void prueba3()
    {
        System.out.println("Prueba 3");
        Assert.assertEquals("Resultado1","Resultado1");

        System.out.println("Prueba 3, despues del soft assertion...");
        // Assert.assertTrue(true);
    }

    @Test (priority=4, groups = "sanity")
    public void prueba4()
    {
        SoftAssert saPrueba = new SoftAssert();

        System.out.println("Prueba 4, antes del soft assertion 1...");
        saPrueba.assertEquals("Resultado1","Resultado1");
        Reporter.log("Error en el log #1 ", true);
        System.out.println("Prueba 4, despues del soft assertion 1...");

        System.out.println("Prueba 4, antes del soft assertion 2...");
        saPrueba.assertEquals("Resultado1","Resultado1");
        Reporter.log("Error en el log #2 ", true);
        System.out.println("Prueba 4, despues del soft assertion 2 ..");

        System.out.println("Asertions: ");
        saPrueba.assertAll();
    }

}
