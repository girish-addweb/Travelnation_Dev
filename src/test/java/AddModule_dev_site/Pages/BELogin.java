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
       @FindBy(xpath = "/html/body/div[2]/main/section/div/div/div/div/div/div[3]/form/div[1]/input")
       WebElement usernamefield;
       @FindBy(xpath = "/html/body/div[2]/main/section/div/div/div/div/div/div[3]/form/div[2]/input")
       WebElement passwordfield;
       @FindBy(xpath = "/html/body/div[2]/main/section/div/div/div/div/div/div[3]/form/div[3]/input")
       WebElement submit;
       @FindBy(xpath = "/html/body/div[2]/nav/div[2]/div/nav/div[1]/ul/li[2]/a")
       WebElement Content;
       @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/nav/ol/li[1]/a")
       WebElement backtosite;
       @FindBy(xpath = "/html/body/div[2]/nav/div[2]/div/nav/div[1]/ul/li[2]/ul/li[2]/a")
       WebElement AddContent;
       @FindBy(xpath = "/html/body/div[2]/nav/div[2]/a")
       WebElement managebutton;
       @FindBy(xpath = "/html/body/div[9]/div/div/div/div[4]/div[2]/button[2]")
       WebElement accpt;


    public BELogin(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.extentTest = test;
        PageFactory.initElements(driver, this); // This initializes the elements
    }
    public void Login(String username, String password) throws InterruptedException, IOException {
            ActionClass actionclass = new ActionClass(driver, extentTest);
            Thread.sleep(5000);
             actionclass.clickOnObject(accpt);
            actionclass.setValueinTextbox(usernamefield, username);
            actionclass.setValueinTextbox(passwordfield, password);
            actionclass.clickOnObject(submit);
//            Thread.sleep(10000);
//            actionclass.clickOnObject(backtosite);
//            Thread.sleep(2000);
//            actionclass.hoverOnObject(Content);
//            actionclass.clickOnObject(AddContent);
        }
    }
