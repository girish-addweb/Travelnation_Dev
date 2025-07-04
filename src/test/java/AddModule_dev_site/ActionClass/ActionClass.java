package AddModule_dev_site.ActionClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static AddModule_dev_site.Constans.CommonVars.*;
import static AddModule_dev_site.Reports.Report.extent;

public class ActionClass {
    public static WebDriver driver;
    public static ExtentTest test;
    public String userDirectory = System.getProperty("user.dir");

    public ActionClass(WebDriver driver, ExtentTest test)
    {
        this.driver = driver;
        this.test = test;
    }

    public void captureAndSaveScreenshot(String testName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] source = ts.getScreenshotAs(OutputType.BYTES);
        System.out.println("Source : " + source);
        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
        String screenshotDirectory =  "./src/test/java/TravelnationBE_Automation/Reports/SS/";
        String screenshotPath = screenshotDirectory + testName + "_" + timeStamp + ".png";
        try {
            FileUtils.writeByteArrayToFile(new File(screenshotPath), source);
            System.out.println("Screenshot captured and saved at: " + screenshotPath);
            String AddScreenshotPath = "./SS/" + testName + "_" + timeStamp + ".png";
            test.addScreenCaptureFromPath(AddScreenshotPath);
            System.out.println("Screenshot captured and added to the report.");
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

    public void clickOnElement(WebElement element , String name)   {
        try {
            if (element.isDisplayed()) {

                element.click();
                test.log(Status.INFO,"User has successfully clicked on "+ name );
                System.out.println("User has successfully clicked on "+ name );

            } else {
                System.out.println(name + " Element Not Found");
                test.log(Status.FAIL,name + " Element Not Found");
                captureAndSaveScreenshot(name);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            test.log(Status.FAIL,e.getMessage());
            e.printStackTrace();
            captureAndSaveScreenshot(name);
        }
    }
    @BeforeSuite
    public void setup() {
        System.out.println("Setting up Extent Reports...");
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        System.out.println("Extent Reports setup complete.");
    }

    public void clickOnObject(WebElement element)   {
        try {
            if(element.isDisplayed())
            {
                if(element.getTagName().equals("div")){
                    String id = element.getAttribute("id");
                    if(!id.equals("")){
                        String forValue = id.replaceAll("_chosen$", "").replaceAll("_", "-");

                        WebElement lableElement = driver.findElement(By.cssSelector("[for='" + forValue + "']"));
                        String lableText = lableElement.getText();

                        element.click();
                        test.log(Status.INFO,"Successfully clicked on "+ lableText +" Element.");
                        System.out.println("Successfully clicked on "+ lableText +" Element.");
                    }else {
                        test.log(Status.INFO,"Successfully clicked on given Element.");
                        System.out.println("Successfully clicked on given Element.");
                    }

                } else if(element.getTagName().equals("li")){
                    String liText = element.getText();

                    element.click();
                    test.log(Status.INFO,"Successfully selected the "+ liText +" option.");
                    System.out.println("Successfully selected the "+ liText +" option.");

                } else if(element.getAttribute("type").equals("checkbox")){
                    String id = element.getAttribute("id");
                    if(!id.equals("")){
                        WebElement lableElement = driver.findElement(By.cssSelector("[for='" + id + "']"));

                        String lableText = lableElement.getText();

                        element.click();
                        test.log(Status.INFO,"Successfully checked the "+ lableText +" Checkbox.");
                        System.out.println("Successfully checked the "+ lableText +" Checkbox.");
                    }else {
                        test.log(Status.INFO,"Successfully checked the Checkbox.");
                        System.out.println("Successfully checked the Checkbox.");

                    }

                }else if(element.getAttribute("type").equals("submit")){
                    String lableText = element.getAttribute("value");

                    element.click();
                    test.log(Status.INFO,"Successfully clicked on "+ lableText +" Button.");
                    System.out.println("Successfully clicked on "+ lableText +" button.");

                }else if(element.getAttribute("type").equals("text") && element.getTagName().equals("input")){
                    String id = element.getAttribute("id");
                    if(!id.equals("")){
                        WebElement lableElement = driver.findElement(By.cssSelector("[for='" + id + "']"));

                        String lableText = lableElement.getText();

                        element.click();
                        test.log(Status.INFO,"Successfully clicked on the "+ lableText +" Textbox.");
                        System.out.println("Successfully clicked on the "+ lableText +" Textbox.");
                    }else {
                        test.log(Status.INFO,"Successfully clicked on the Textbox.");
                        System.out.println("Successfully clicked on the Textbox.");
                    }

                }else if(element.getTagName().equals("textarea")){
                    String id = element.getAttribute("id");
                    if(!id.equals("")){
                        WebElement lableElement = driver.findElement(By.cssSelector("[for='" + id + "']"));

                        String lableText = lableElement.getText();

                        element.click();
                        test.log(Status.INFO,"Successfully clicked on the "+ lableText +" TextArea.");
                        System.out.println("Successfully clicked on the "+ lableText +" TextArea.");
                    }else {
                        test.log(Status.INFO,"Successfully clicked on the TextArea.");
                        System.out.println("Successfully clicked on the TextArea.");
                    }

                }else if(element.getAttribute("type").equals("number") && element.getTagName().equals("input")){
                    String id = element.getAttribute("id");
                    if(!id.equals("")){
                        WebElement lableElement = driver.findElement(By.cssSelector("[for='" + id + "']"));

                        String lableText = lableElement.getText();

                        element.click();
                        test.log(Status.INFO,"Successfully clicked on the "+ lableText +" Textbox.");
                        System.out.println("Successfully clicked on the "+ lableText +" Textbox.");
                    }else {
                        test.log(Status.INFO,"Successfully clicked on the Textbox.");
                        System.out.println("Successfully clicked on the Textbox.");
                    }

                }else if(element.getTagName().equals("select")){
                    element.click();
                    test.log(Status.INFO,"Successfully clicked on the Selectbox.");
                    System.out.println("Successfully clicked on the Selectbox.");

                }else if(element.getTagName().equals("option")){
                    element.click();
                    test.log(Status.INFO,"Successfully selected the Option.");
                    System.out.println("Successfully selected the Option.");

                } else {
                    String liText = element.getText();

                    element.click();
                    test.log(Status.INFO,"Successfully clicked on "+ liText +" Element.");
                    System.out.println("Successfully clicked on "+ liText +" Element.");

                }
            } else
            {
                System.out.println("Element Not Found");
                test.log(Status.FAIL,"Element Not Found");
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            test.log(Status.FAIL,e.getMessage());
            e.printStackTrace();
        }
    }    public void setValueinElement( WebElement element, String value , String name) {

        try {
            if (element.isDisplayed()) {

                element.clear();
                element.sendKeys(value);

                System.out.println("User has successfully entered '" + value + "' in "+ name );
                test.log(Status.INFO, "User has successfully entered '" + value + "' in "+ name );

            } else {
                System.out.println(name + " Element Not Found to Enter Anything");
                test.log(Status.FAIL, name + " Element Not Found to Enter Anything");
                captureAndSaveScreenshot(name);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
            e.printStackTrace();
            captureAndSaveScreenshot(name);
        }
    }
    public void selectFromDropdown(WebElement dropdownElement, String selectionType, String value) {
        try {
            if (dropdownElement.isDisplayed()) {
                Select select = new Select(dropdownElement);

                switch (selectionType.toLowerCase()) {
                    case "text":
                        select.selectByVisibleText(value);
                        break;
                    case "value":
                        select.selectByValue(value);
                        break;
                    case "index":
                        select.selectByIndex(Integer.parseInt(value));
                        break;
                    default:
                        System.out.println("Invalid selection type: " + selectionType);
                        test.log(Status.FAIL, "Invalid selection type provided: " + selectionType);
                        return;
                }

                String dropdownId = dropdownElement.getAttribute("id");
                String labelText = "[Dropdown]"; // Default label text

                if (dropdownId != null && !dropdownId.isEmpty()) {
                    try {
                        WebElement labelElement = dropdownElement.findElement(By.xpath("//label[@for='" + dropdownId + "']"));
                        labelText = labelElement.getText();
                    } catch (NoSuchElementException ignored) {
                        // If no associated label is found, continue with default text
                    }
                }

                String successMessage = "Successfully selected '" + value + "' in " + labelText;
                System.out.println(successMessage);
                test.log(Status.PASS, successMessage);

            } else {
                System.out.println("Dropdown element not found");
                test.log(Status.FAIL, "Dropdown element not found");
            }
        } catch (Exception e) {
            System.out.println("Error selecting from dropdown: " + e.getMessage());
            test.log(Status.FAIL, "Error selecting from dropdown: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void setValueinTextbox( WebElement element, String value) {
        {
            try {
                if (element.isDisplayed()) {
                    element.clear();
                    element.sendKeys(value);

                    String id = element.getAttribute("id");
                    if(!id.equals("")){
                        WebElement lableElement = driver.findElement(By.cssSelector("[for='" + id + "']"));
                        String lableText = lableElement.getText();

                        System.out.println("Successfully entered '" + value + "' in "+ lableText +" Textbox");
                        test.log(Status.PASS, "Successfully entered '" + value + "' in "+ lableText +" Textbox");
                    }else {
                        System.out.println("Successfully entered '" + value + "' in Textbox");
                        test.log(Status.PASS, "Successfully entered '" + value + "' in Textbox");
                    }

                } else {
                    System.out.println("Element Not Found to Enter Anything");
                    test.log(Status.FAIL, "Element Not Found to Enter Anything");

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                test.log(Status.FAIL, e.getMessage());
                e.printStackTrace();
            }
        }
    }
    public void CompareList(ArrayList<Integer> listNames, ArrayList<Integer> listNames1)   {
        try {
            if(listNames.equals(listNames1)==true)
            {
                test.log(Status.INFO,"Result Matched with DB");
                System.out.println("Result Matched with DB");

            }
            else
            {
                System.out.println("Result Doesn't match with DB");
                test.log(Status.INFO,"Result Doesn't match with DB");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            test.log(Status.FAIL,e.getMessage());
        }
    }
    public void CompareListandstring(String s, String s1)
    {
        try {
            if(s.equals(s1)==true)
            {
                test.log(Status.PASS, "View opened for valid record " + s + " And Match with View record for " + s1);
                System.out.println("View opened for valid record " + s + " And Match with View record for " + s1);

            }
            else
            {
                System.out.println("View record for " + s + " is not correct");
                test.log(Status.INFO, "View record for " + s + " is not correct");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            test.log(Status.FAIL,e.getMessage());
        }
    }

    public void CompareStringList(ArrayList<String> listNames, ArrayList<String> listNames1)
    {
        try {
            if(listNames.equals(listNames1)==true)
            {
                test.log(Status.PASS,"Result Matched with DB");
                System.out.println("Result Matched with DB");

            }
            else
            {
                System.out.println("Result Doesn't match with DB");
                test.log(Status.INFO,"Result Doesn't match with DB");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            test.log(Status.FAIL,e.getMessage());
        }
    }
    public void CompareEditedString(ArrayList<String> listNames, ArrayList<String> listNames1)
    {
        try {
            if(listNames.equals(listNames1)==false)
            {
                test.log(Status.PASS,"Record edited successfully and before and after database values does not match");
                System.out.println("Record edited successfully and before and after database values does not match");

            }
            else
            {
                System.out.println("Record edited successfully and before and after database values matches");
                test.log(Status.INFO,"Record did not edit successfully and before and after database values matches");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            test.log(Status.FAIL,e.getMessage());
        }
    }

    public void setValueinPortalField(WebElement element) {

        try{
            if(element.isDisplayed()){
                element.click();
                element.sendKeys("Elance");
                element.sendKeys(Keys.ENTER);

                element.click();
                element.sendKeys("Freelancer");
                element.sendKeys(Keys.ENTER);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updateValueinTextbox( WebElement element, String value)    {
        try {
            if(element.isDisplayed())
            {
                element.click();
                element.clear();
                element.sendKeys(value);
                System.out.println("Successfully entered '"+value+"' in object");
                test.log(Status.PASS,"Successfully entered '"+value+"' in object :");
            }
            else
            {
                System.out.println("Unable to find object");
                test.log(Status.FAIL,"Unable to find object");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            test.log(Status.FAIL,e.getMessage());
        }
    }

    public void setValueinTextbox_update( WebElement element, String value)  {
        try {
            if(element.isDisplayed())
            {
                element.click();
                element.clear();
                element.sendKeys(value);
                System.out.println("Successfully entered '"+value+"' in object");
                test.log(Status.PASS,"Successfully entered '"+value+"' in object :");
            }
            else
            {
                System.out.println("Unable to find object");
                test.log(Status.FAIL,"Unable to find object");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            test.log(Status.FAIL,e.getMessage());
        }
    }

    public void captureScreenUsingRobot(String testcaseName) throws IOException, AWTException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_MM_SS");
        Date date = new Date();
        String datetextName = dateFormat.format(date);
        String screenshotPath = System.getProperty("user.dir") + "/test-output/screenshot/" +testcaseName + "_"+datetextName + ".png" ;
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File(screenshotPath));
        test.addScreenCaptureFromPath(screenshotPath);
    }


  public void hoverOnObject(WebElement element) {
        try {
            if (element.isDisplayed()) {
                Actions actions = new Actions(driver);
                actions.moveToElement(element).perform();
                System.out.println("Successfully hovered over object");
                test.log(Status.INFO, "Successfully hovered over object");
            } else {
                System.out.println("Element Not Found to Hover");
                test.log(Status.FAIL, "Element Not Found to Hover");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }
}


