package SuiteTests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Demostraci�n Prueba paquete SuiteClases")
@SelectPackages("SuiteClases")

public class PruebaPaquete {

}
