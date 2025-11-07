package AddModule_dev_site.Pages;
import AddModule_dev_site.ActionClass.ActionClass;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class BELogin {
        WebDriver driver;
        ExtentTest extentTest;
       @FindBy(xpath = "//input[@id='edit-name']")
       WebElement usernamefield;
       @FindBy(xpath = "//input[@id='edit-pass']")
       WebElement passwordfield;
       @FindBy(xpath = "//input[@id='edit-submit']")
       WebElement submit;
       @FindBy(xpath = "//a[@class='toolbar-icon toolbar-icon-system-admin-content']")
       WebElement Content;
//       @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/nav/ol/li[1]/a")
//       WebElement backtosite;
       @FindBy(xpath = "//a[normalize-space()='Add content']")
       WebElement AddContent;
       @FindBy(xpath = "/html/body/div[2]/nav/div[2]/a")
       WebElement managebutton;
       @FindBy(xpath = "//button[normalize-space(text())='Accept']")
       WebElement accept;
       @FindBy(xpath = "//*[@id=\"iubenda-cs-banner\"]/div")WebElement popup;


    public BELogin(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.extentTest = test;
        PageFactory.initElements(driver, this); // This initializes the elements
    }
    public void Login(String username, String password) throws InterruptedException, IOException {
            ActionClass actionclass = new ActionClass(driver, extentTest);
            Thread.sleep(10000);
        try {
            // Wait briefly for popup; don't fail if not present
            if (accept.isDisplayed()) {
                actionclass.clickOnObject(accept);
                System.out.println("Popup accepted.");
            }
        } catch (Exception e) {
            System.out.println("Popup not present, proceeding with login.");
        }

        actionclass.setValueinTextbox(usernamefield, username);
                actionclass.setValueinTextbox(passwordfield, password);
                actionclass.clickOnObject(submit);
                Thread.sleep(10000);
        try {
            // Wait briefly for popup; don't fail if not present
            if (popup.isDisplayed()) {
                actionclass.clickOnObject(accept);
                System.out.println("Popup accepted.");
            }
        } catch (Exception e) {
            System.out.println("Popup not present, proceeding with login.");
        }


//            actionclass.clickOnObject(backtosite);
            Thread.sleep(2000);
                actionclass.hoverOnObject(Content);
                actionclass.clickOnObject(AddContent);

        }
    }
