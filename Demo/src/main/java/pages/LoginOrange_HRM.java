package pages;

import org.openqa.selenium.By;
import utils.PageBase;

public class LoginOrange_HRM extends PageBase {


    private  static By txtUsername = By.id("txtUsername");
    private  static By txtPassword = By.id("txtPassword");
    private  static By butLogin = By.id("btnLogin");
    private  static By logoOrangeHRM = By.id("welcome");


    public static void entertxtUsername(String uname) {
        getDriver().findElement(txtUsername).sendKeys(uname);
    }

    public static void entertxtPassword(String pass) {
        getDriver().findElement(txtPassword).sendKeys(pass);
    }

    public static void clickbutLogin() {
        getDriver().findElement(butLogin).click();
    }

    public static void verifylogoOrangeHRM() {
        getDriver().findElement(logoOrangeHRM).isDisplayed();
        String successfullogin = getDriver().findElement(logoOrangeHRM).getText();
        System.out.println(successfullogin);
    }


}
