package AddModule_dev_site.ActionClass;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificationClass {
    private static WebDriver driver;
    private static ExtentTest test;

    public VerificationClass(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }
    public void verifyTextPresent(WebElement element, String expectedText) {
        ActionClass actionClass = new ActionClass(driver, test);
        try {
            if (element.isDisplayed()) {
                String text = element.getText();
                if (text.equals(expectedText)) {
                    test.log(Status.PASS, "Expected value '" + expectedText + "' matches with actual value '" + text + "'");
                    System.out.println("Expected value '" + expectedText + "' matches with actual value '" + text + "'");
                } else {
                    test.log(Status.FAIL, "Expected value '" + expectedText + "' did not matche with actual value '"
                            + text + "'");
                    System.out.println("Expected value '" + expectedText + "' did not matche with actual value '"
                            + text + "'");
                    actionClass.captureAndSaveScreenshot("Text_Present");
                }
            } else {
                test.log(Status.FAIL, "Unable to find object : " + element.getAttribute("name"));
            }

        } catch (Exception e) {
            test.log(Status.ERROR, "Unable to find the element on the page for Text Validation");
            test.log(Status.ERROR, "Error : " + e.getMessage());
            System.out.println("Unable to find the element on the page for Text Validation");
            System.out.println("Error : " + e.getMessage());
            actionClass.captureAndSaveScreenshot("Text_Present");
        }
    }
    public void verifyElementNotPresent(WebElement element) {
        try {
            if (!element.isDisplayed()) {
                test.log(Status.PASS, "Element is not present for object : " + element.getAttribute("name"));
                System.out.println("Element is not present for object : " + element.getAttribute("name"));
            } else {
                test.log(Status.FAIL, "Element is present for object : " + element.getAttribute("name"));
                System.out.println("Element is present for object : " + element.getAttribute("name"));
            }
        } catch (Exception var3) {
            System.out.println(var3.getStackTrace());
        }
    }
}