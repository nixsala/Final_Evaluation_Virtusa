package testPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginOrange_HRM;
import utils.TestBase;

import java.util.concurrent.TimeUnit;

public class HomeTest extends TestBase {


    @Test
    public void orangeHRMlogin() {
//        @Test(groups = { "test", "regression",},priority = 2,dataProviderClass = PlantData.class,dataProvider = "PlantDetail")
//        public void TokiyomasterTest(String code,String plant,String address,String fax,String contacno,String description) {

        LoginOrange_HRM.entertxtUsername("Admin");
        LoginOrange_HRM.entertxtPassword("admin123");
        LoginOrange_HRM.clickbutLogin();
        LoginOrange_HRM.verifylogoOrangeHRM();

    }
}
