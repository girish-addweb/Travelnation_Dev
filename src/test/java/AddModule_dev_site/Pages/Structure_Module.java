package AddModule_dev_site.Pages;
import AddModule_dev_site.ActionClass.ActionClass;
import AddModule_dev_site.ActionClass.VerificationClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static AddModule_dev_site.ActionClass.ActionClass.test;

public class Structure_Module {
    WebDriver driver;
    ExtentTest extentTest;
    @FindBy(xpath = "/html/body/div[1]/nav/div[2]/div/nav/div[1]/ul/li[3]/a")
    WebElement Hover_ON_Structure;
    @FindBy(xpath = "/html/body/div[1]/nav/div[2]/div/nav/div[1]/ul/li[3]/ul/li[1]/h2/a")
    WebElement Click_ON_Structure;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[2]/a")
    WebElement Click_on_blocktype_module;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[3]/a")
    WebElement Click_on_Commenttype_module;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[4]/a")
    WebElement Click_on_Contactform_module;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[5]/a")
    WebElement Click_on_ContentTypes_module;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[11]/a")
    WebElement Taxonomy_Module;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[12]/a")
    WebElement View_Module;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[13]/a")
    WebElement Vote_type_Module;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[14]/a")
    WebElement Webforms_Module;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[6]/a")
    WebElement Click_on_Displayedicon_module;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[7]/a")
    WebElement Entityqueues_module;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[1]/a")
    WebElement Click_on_Formmodes_module;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[10]/a")
    WebElement Click_on_Paragraph_types_module;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div[1]/a")
    WebElement Content;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button")
    WebElement savebutton;
    @FindBy(xpath = "/html/body/div[5]/div[2]/form/div[1]/input")
    WebElement Namefield;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[9]/a")
    WebElement Menu_module;
    @FindBy(xpath = "/html/body/div[2]/header/div/div/div[2]/ul/li/a")
    WebElement Click_on_Add_type;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[1]/input")
    WebElement Label_FIeld;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[5]/input[2]")
    WebElement Save_Button;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[5]/input")
    WebElement Save_In_edit_Button;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[4]/select/option[3]")
    WebElement Dropdown_select;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/nav/ul/li[5]/a")
    WebElement Setting_Tab;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[3]/div[1]/textarea")
    WebElement Description_Field;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[4]/select")
    WebElement dropdown_Field;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button[1]")
    WebElement Delete_button;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[5]/a")
    WebElement Delete_button_IN_edit;
    @FindBy(linkText = "This is for the testing")
    WebElement CreateModule;
    @FindBy(linkText = "Testing")
    WebElement EditModuleName;
    @FindBy(linkText = "Edit")
    WebElement Editbutton;
    @FindBy(linkText = "Edit vocabulary")
    WebElement Edit_vocabulary;
    @FindBy(linkText = "Delete vocabulary")
    WebElement Delete_vocabulary;
    @FindBy(linkText = "Delete")
    WebElement Deletebutton1;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[6]/input")
    WebElement SaveButton_MenuEdit;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[9]/input")
    WebElement Savebutton_ContactUs;
    @FindBy(xpath = "/html/body/div[1]/nav/div[2]/div/nav/div[1]/ul/li[3]/ul/li[6]/ul/li[4]/ul/li[6]/a")
    WebElement hoverdelet;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div/div/input")
    WebElement hoverdelet2;
    @FindBy(xpath = "/html/body/div[1]/nav/div[2]/div/nav/div[1]/ul/li[3]/ul/li[6]/a")
    WebElement hovercontect;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[4]/div/div/details[1]/div/div/div[1]/input")
    WebElement Contant_type_Title;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/nav/ol/li[4]/a")
    WebElement BacktoSIte_button;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[2]/div/div/div")
    WebElement Contant_deleted;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[2]/div/div/div/div[2]/em")
    WebElement Delete_Verification_message;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/table/tbody/tr[25]/td[5]/div/div/ul/li[3]/ul/li[3]/a")
    WebElement Editindropdown;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/fieldset/div/div[1]/input")
    WebElement NameField_Viewmodule;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[2]/input[1]")
    WebElement Save_editbutton_Viewmodule;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div[1]/form/div[2]/div[1]/div/div/div/ul/li[1]/a")
    WebElement EditViewbutton;
    @FindBy(xpath = "/html/body/div[6]/div[2]/form/div[1]/div[1]/input")
    WebElement editfield;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/button[1]")
    WebElement Saveedit;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div[1]/form/div[3]/input[1]")
    WebElement Saveedi2;
    @FindBy(xpath = "/html/body/div[6]/div[2]/div/form/div[2]/input")
    WebElement TitleField;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/details[1]/div/div[2]/input")
    WebElement EditTitleField;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/button")
    WebElement Save;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[2]/input")
    WebElement Save_editbutton_webform;
    @FindBy(xpath = "/html/body/div[7]/div[2]/div/form/div/div[3]/input")
    WebElement toggle_button;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[2]/a")
    WebElement Delete_button_webfrom;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div[8]/a")
    WebElement Media_Module;
    @FindBy(xpath = "/html/body/div[7]/div[3]/div/button[1]")
    WebElement Delete_button_web;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[4]/div/select")
    WebElement Media_source_dropdown;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[4]/div/select/option[4]")
    WebElement file_select;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/form/div[6]/input[2]")
    WebElement Save_button;
    @FindBy(xpath = " /html/body/div[2]/div[5]/main/div[4]/div/div/div/table/tbody/tr[5]/td[3]/div/div/ul/li[3]/ul/li[6]/a")
    WebElement delet_media;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button[2]")
    WebElement Delete_button_form;


    public Structure_Module(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.extentTest = test;
        PageFactory.initElements(driver, this);
    }

    public void verifyModuleNameInTable(String expectedModuleName) {
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[2]/div[5]/main/div[4]/div/div/div/table/tbody/tr"));
        boolean moduleFound = false;
        for (WebElement row : rows) {
            WebElement moduleNameElement = row.findElement(By.xpath("./td[1]/a"));
            String actualModuleName = moduleNameElement.getText();
            test.log(Status.PASS, "Module Name: " + actualModuleName);
            System.out.println("Module Name: " + actualModuleName);

            if (actualModuleName.equals(expectedModuleName)) {
                test.log(Status.PASS, "Module name verification passed: " + actualModuleName);
                System.out.println("Module name verification passed: " + actualModuleName);
                moduleFound = true;
                break;
            }
        }
        if (!moduleFound) {
            test.log(Status.FAIL, "Module name verification failed. Expected module name: " + expectedModuleName + " was not found in the table.");
            System.out.println("Module name verification failed. Expected module name: " + expectedModuleName + " was not found in the table.");
        } else
            test.log(Status.PASS, "Module name verification passed. Expected module name: " + expectedModuleName + " was found in the table.");
        System.out.println("Module name verification passed Expected module name: " + expectedModuleName + " was found in the table.");
    }

    public void Media_type(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Media_Module);
        actionclass.clickOnObject(Click_on_Add_type);
        actionclass.setValueinTextbox(Label_FIeld, titlefield);
        actionclass.clickOnObject(Media_source_dropdown);
        Thread.sleep(5000);
        actionclass.clickOnObject(file_select);
        Thread.sleep(2000);
        actionclass.clickOnObject(Save_button);
        verificationClass.verifyTextPresent(Delete_Verification_message, titlefield);
        try {
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            for (WebElement row : rows) {
                if (row.getText().contains(titlefield)) {
                    WebElement button = row.findElement(By.xpath("./td[3]//li[1]/a"));
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView(true);", button);
                    button.click();
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button not found for title: " + titlefield);
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for button to be clickable for title: " + titlefield);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        actionclass.setValueinTextbox(Label_FIeld, editTitleField);
        actionclass.clickOnObject(SaveButton_MenuEdit);
        verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);

        try {
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            for (WebElement row : rows) {
                if (row.getText().contains(editTitleField)) {
                    WebElement button = row.findElement(By.xpath("./td[3]//li[2]/button"));
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView(true);", button);
                    button.click();
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button not found for title: " + editTitleField);
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for button to be clickable for title: " + editTitleField);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        actionclass.clickOnObject(delet_media);
        Thread.sleep(5000);
        actionclass.clickOnObject(Delete_button);
        verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
    }

    public void Webforms_Module(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Webforms_Module);
        actionclass.clickOnObject(Click_on_Add_type);
        Thread.sleep(5000);
        actionclass.setValueinTextbox(TitleField, titlefield);
        actionclass.clickOnObject(Save);
        Thread.sleep(2000);
        verificationClass.verifyTextPresent(Delete_Verification_message, titlefield);
        actionclass.clickOnObject(BacktoSIte_button);
        try {
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            for (WebElement row : rows) {
                if (row.getText().contains(titlefield)) {
                    WebElement button = row.findElement(By.xpath("./td[8]//li[1]/a"));
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView(true);", button);
                    button.click();
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button not found for title: " + titlefield);
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for button to be clickable for title: " + titlefield);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        actionclass.clickOnObject(Setting_Tab);
        actionclass.setValueinTextbox(EditTitleField, editTitleField);
        actionclass.clickOnObject(Save_editbutton_webform);
        actionclass.clickOnObject(BacktoSIte_button);
        try {
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            for (WebElement row : rows) {
                if (row.getText().contains(editTitleField)) {
                    WebElement button = row.findElement(By.xpath("./td[8]//li[1]/a"));
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView(true);", button);
                    button.click();
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button not found for title: " + editTitleField);
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for button to be clickable for title: " + editTitleField);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }  Thread.sleep(2000);
        actionclass.clickOnObject(Setting_Tab);
        actionclass.clickOnObject(Delete_button_webfrom);
        Thread.sleep(5000);
        actionclass.clickOnObject(toggle_button);
        actionclass.clickOnObject(Delete_button_web);
        Thread.sleep(5000);
        verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
    }
        public void Vote_Types_Module(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Vote_type_Module);
        actionclass.clickOnObject(Click_on_Add_type);
        actionclass.setValueinTextbox(Label_FIeld, titlefield);
        actionclass.clickOnObject(Save_In_edit_Button);
        verificationClass.verifyTextPresent(Delete_Verification_message, titlefield);
        Thread.sleep(3000);
        try {
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            for (WebElement row : rows) {
                if (row.getText().contains(titlefield)) {
                    WebElement button = row.findElement(By.xpath("./td[5]//li[1]/a"));
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView(true);", button);
                    button.click();
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button not found for title: " + titlefield);
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for button to be clickable for title: " + titlefield);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        actionclass.setValueinTextbox(Label_FIeld, editTitleField);
        actionclass.clickOnObject(Save_In_edit_Button);
        Thread.sleep(1000);
        verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
        try {
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            for (WebElement row : rows) {
                if (row.getText().contains(editTitleField)) {
                    WebElement button = row.findElement(By.xpath("./td[5]//li[2]/button"));
                    button.click();
                    Thread.sleep(2000);
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button not found for title: " + editTitleField);
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for button to be clickable for title: " + editTitleField);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        Thread.sleep(2000);
        actionclass.clickOnObject(Deletebutton1);
        Thread.sleep(5000);
        actionclass.clickOnObject(Delete_button);
        Thread.sleep(5000);
        verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
    }


    public void View_Module(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(View_Module);
        actionclass.clickOnObject(Click_on_Add_type);
        actionclass.setValueinTextbox(NameField_Viewmodule, titlefield);
        actionclass.clickOnObject(Save_editbutton_Viewmodule);
        verificationClass.verifyTextPresent(Delete_Verification_message, titlefield);
        actionclass.clickOnObject(BacktoSIte_button);
        Thread.sleep(3000);
        try {
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            for (WebElement row : rows) {
                if (row.getText().contains(titlefield)) {
                    WebElement button = row.findElement(By.xpath("./td[5]//li[1]/a"));
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView(true);", button);
                    button.click();
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button not found for title: " + titlefield);
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for button to be clickable for title: " + titlefield);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        Thread.sleep(2000);
        actionclass.clickOnObject(EditViewbutton);
        Thread.sleep(3000);
        actionclass.setValueinTextbox(editfield, editTitleField);
        actionclass.clickOnObject(Saveedit);
        Thread.sleep(3000);
        actionclass.clickOnObject(Saveedi2);
        verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
        actionclass.clickOnObject(BacktoSIte_button);
        try {
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            for (WebElement row : rows) {
                if (row.getText().contains(editTitleField)) {
                    WebElement button = row.findElement(By.xpath("./td[5]//li[2]/button"));
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView(true);", button);
                    button.click();
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button not found for title: " + editTitleField);
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for button to be clickable for title: " + editTitleField);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        actionclass.clickOnObject(Deletebutton1);
        Thread.sleep(8000);
        actionclass.clickOnObject(Delete_button);
        Thread.sleep(5000);
        verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
    }
    public void Taxonomy_Module(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Taxonomy_Module);
        actionclass.clickOnObject(Click_on_Add_type);
        actionclass.setValueinTextbox(Label_FIeld, titlefield);
        actionclass.clickOnObject(SaveButton_MenuEdit);
        verificationClass.verifyTextPresent(Delete_Verification_message, titlefield);
        actionclass.clickOnObject(BacktoSIte_button);
        Thread.sleep(3000);
        try {
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            for (WebElement row : rows) {
                if (row.getText().contains(titlefield)) {
                    WebElement button = row.findElement(By.xpath("./td[4]//button"));
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView(true);", button);
                    button.click();
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button not found for title: " + titlefield);
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for button to be clickable for title: " + titlefield);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        Thread.sleep(500);
        actionclass.clickOnObject(Edit_vocabulary);
        actionclass.setValueinTextbox(Label_FIeld, editTitleField);
        actionclass.clickOnObject(SaveButton_MenuEdit);
        Thread.sleep(2000);
        verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
        Thread.sleep(3000);
        try {
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            for (WebElement row : rows) {
                if (row.getText().contains(editTitleField)) {
                    WebElement button = row.findElement(By.xpath("./td[4]//button"));
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView(true);", button);
                    button.click();
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button not found for title: " + editTitleField);
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for button to be clickable for title: " + editTitleField);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        actionclass.clickOnObject(Delete_vocabulary);
        Thread.sleep(5000);
        actionclass.clickOnObject(Delete_button);
        verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
    }
        public void Paragraph_types_module(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Click_on_Paragraph_types_module);
        actionclass.clickOnObject(Click_on_Add_type);
        actionclass.setValueinTextbox(Label_FIeld, titlefield);
        actionclass.clickOnObject(Save_In_edit_Button);
        verificationClass.verifyTextPresent(Delete_Verification_message, titlefield);
        actionclass.clickOnObject(BacktoSIte_button);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js.executeScript("window.scrollBy(0, 350)", "");
        try {
            String buttonXPath = String.format("//tr[td[contains(text(), '%s')]]//button", titlefield);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXPath)));
            button.click();
            System.out.println("First button clicked successfully for: " + titlefield);
        } catch (NoSuchElementException e) {
            System.out.println("First button not found for title: " + titlefield);
        }
        js.executeScript("window.scrollBy(0, 350)", "");
        actionclass.clickOnObject(Editbutton);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Label_FIeld, editTitleField);
            actionclass.clickOnObject(Save_In_edit_Button);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
        js.executeScript("window.scrollBy(0, 350)", "");
        try {
            String buttonXPath = String.format("//tr[td[contains(text(), '%s')]]//button", editTitleField);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXPath)));
            button.click();
            System.out.println("First button clicked successfully for: " + editTitleField);
        } catch (NoSuchElementException e) {
            System.out.println("First button not found for title: " + editTitleField);
        }
        js.executeScript("window.scrollBy(0, 350)", "");
        actionclass.clickOnObject(Editindropdown);
        Thread.sleep(2000);
        actionclass.clickOnObject(Delete_button_IN_edit);
        Thread.sleep(5000);
        actionclass.clickOnObject(Delete_button);
        Thread.sleep(2000);
        try {
            if (!CreateModule.isDisplayed()) {
                System.out.println("Paragraph_types_module is deleted successfully.");
            } else {
                System.out.println("Paragraph_types_module is still displayed.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Paragraph_types_module is deleted successfully.");
        }
    }
    public void Menu_module(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Menu_module);
        actionclass.clickOnObject(Click_on_Add_type);
        actionclass.setValueinTextbox(Label_FIeld, titlefield);
        actionclass.clickOnObject(Save_In_edit_Button);
        verificationClass.verifyTextPresent(Delete_Verification_message, titlefield);
        actionclass.clickOnObject(BacktoSIte_button);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            String editButtonXPath = String.format("//tr[td[contains(text(), '%s')]]/td[3]//ul/li[1]/a", titlefield);
            WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(editButtonXPath)));
            editButton.click();
            System.out.println("Edit button clicked successfully for title: " + titlefield);
        } catch (NoSuchElementException e) {
            System.out.println("Edit button not found for title: " + titlefield);
        }
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Label_FIeld, editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(SaveButton_MenuEdit);
           Thread.sleep(2000);

            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.clickOnObject(BacktoSIte_button);
        try {
            String editButtonXPath = String.format("//tr[td[contains(text(), '%s')]]/td[3]//ul/li[1]/a", editTitleField);
            WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(editButtonXPath)));
            editButton.click();
            System.out.println("Edit button clicked successfully for title: " + editTitleField);
        } catch (NoSuchElementException e) {
            System.out.println("Edit button not found for title: " + editTitleField);
        }
        try {
            actionclass.clickOnObject(Deletebutton1);
        } catch (Exception e) {
            System.out.println("Error during deletion: " + e.getMessage());
        }
        try {
            if (!CreateModule.isDisplayed()) {
                System.out.println("menu is deleted successfully.");
            } else {
                System.out.println("menu is still displayed.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("menu is deleted successfully.");
        }
    }
    public void Entityqueues_module(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Entityqueues_module);
        actionclass.clickOnObject(Click_on_Add_type);
        actionclass.setValueinTextbox(Label_FIeld, titlefield);
        actionclass.clickOnObject(Save_In_edit_Button);
        verificationClass.verifyTextPresent(Delete_Verification_message, titlefield);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            String buttonXPath = String.format("//tr[td[contains(text(), '%s')]]//button", titlefield);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXPath)));
            button.click();
            System.out.println("Second button clicked successfully for: " + titlefield);
        } catch (NoSuchElementException e) {
            System.out.println("Second button not found for title: " + titlefield);
        }
        try {
            actionclass.clickOnObject(Deletebutton1);  // Ensure Deletebutton is located using @FindBy
            Thread.sleep(5000);
            actionclass.clickOnObject(Delete_button);  // Assuming Delete_button is properly located as well
        } catch (Exception e) {
            System.out.println("Error during deletion: " + e.getMessage());
        }
        try {
            if (!CreateModule.isDisplayed()) {
                System.out.println("Entityqueues_module is deleted successfully.");
            } else {
                System.out.println("Entityqueues_module is still displayed.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Entityqueues_module is deleted successfully.");
        }
    }

    public void Form_Modes(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Click_on_Displayedicon_module);
        Thread.sleep(1000);
        actionclass.clickOnObject(Click_on_Formmodes_module);
        actionclass.clickOnObject(Click_on_Add_type);
        Thread.sleep(2000);
        actionclass.clickOnObject(Content);
        WebElement namefield = wait.until(ExpectedConditions.elementToBeClickable(Namefield));
        actionclass.setValueinTextbox(Namefield, titlefield);
        actionclass.clickOnObject(savebutton);
        Thread.sleep(2000);
        verificationClass.verifyTextPresent(Delete_Verification_message,titlefield);
        try {
            String buttonXPath = String.format("//tr[td[contains(text(), '%s')]]//button", titlefield);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXPath)));
            button.click();
            System.out.println("First button clicked successfully for: " + titlefield);
        } catch (NoSuchElementException e) {
            System.out.println("First button not found for title: " + titlefield);
        }
        try {
            actionclass.clickOnObject(Editbutton);  // Ensure Editbutton is located using @FindBy
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Namefield, editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(savebutton);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
        } catch (Exception e) {
            System.out.println("Error during editing: " + e.getMessage());
        }
        try {
            String buttonXPath = String.format("//tr[td[contains(text(), '%s')]]//button", editTitleField);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXPath)));
            button.click();
            System.out.println("Second button clicked successfully for: " + editTitleField);
        } catch (NoSuchElementException e) {
            System.out.println("Second button not found for title: " + editTitleField);
        }
        try {

            actionclass.clickOnObject(Editbutton);  // Ensure Deletebutton is located using @FindBy
            Thread.sleep(5000);
            actionclass.clickOnObject(Delete_button_form);  // Assuming Delete_button is properly located as well
        } catch (Exception e) {
            System.out.println("Error during deletion: " + e.getMessage());
        }
        try {
            if (!CreateModule.isDisplayed()) {
                System.out.println("Form-Modes is deleted successfully.");
            } else {
                System.out.println("Form-Modes is still displayed.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Form-Modes is deleted successfully.");
        }
    }
    public void View_modes(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Click_on_Displayedicon_module);
        Thread.sleep(1000);
        actionclass.clickOnObject(Click_on_blocktype_module);
        actionclass.clickOnObject(Click_on_Add_type);
        Thread.sleep(2000);
        actionclass.clickOnObject(Content);
        Thread.sleep(2000);
        actionclass.setValueinTextbox(Namefield, titlefield);
        actionclass.clickOnObject(savebutton);
        Thread.sleep(2000);
        verificationClass.verifyTextPresent(Delete_Verification_message,titlefield);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)", "");
        try {
            String buttonXPath = String.format("//tr[td[contains(text(), '%s')]]//td[3]//ul/li[1]/a", titlefield);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXPath)));
            button.click();
            System.out.println("Edit button clicked successfully for: " + titlefield);

        } catch (TimeoutException e) {
            System.out.println("Timeout: Edit button not clickable or not found for title: " + titlefield);
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException: Edit button not found for title: " + titlefield);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        try {
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Namefield, editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(savebutton);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
        } catch (Exception e) {
            System.out.println("Error during editing: " + e.getMessage());
        }
        try {
            String buttonXPath = String.format("//tr[td[contains(text(), '%s')]]//button", editTitleField);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXPath)));
            button.click();
            System.out.println("Second button clicked successfully for: " + editTitleField);
        } catch (NoSuchElementException e) {
            System.out.println("Second button not found for title: " + editTitleField);
        }
        try {
            actionclass.clickOnObject(Deletebutton1);  // Ensure Deletebutton is located using @FindBy
            Thread.sleep(5000);
            actionclass.clickOnObject(Delete_button);  // Assuming Delete_button is properly located as well
        } catch (Exception e) {
            System.out.println("Error during deletion: " + e.getMessage());
        }
        try {
            if (!CreateModule.isDisplayed()) {
                System.out.println("View-Modes is deleted successfully.");
            } else {
                System.out.println("View-Modes is still displayed.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("View-Modes is deleted successfully.");
        }
    }
    public void Contant_Types(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Click_on_ContentTypes_module);
        actionclass.clickOnObject(Click_on_Add_type);
        actionclass.setValueinTextbox(Label_FIeld, titlefield);
        actionclass.setValueinTextbox(Contant_type_Title, titlefield);
        actionclass.clickOnObject(Save_Button);
        verificationClass.verifyTextPresent(Delete_Verification_message,titlefield);
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        try {
            String buttonXPath = String.format("//tr[td[contains(text(), '%s')]]//button", titlefield);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXPath)));
            button.click();
            System.out.println("First button clicked successfully for: " + titlefield);
        } catch (NoSuchElementException e) {
            System.out.println("First button not found for title: " + titlefield);
        }
        try {
            Thread.sleep(2000);
            actionclass.clickOnObject(Editbutton);  // Ensure Editbutton is located using @FindBy
            actionclass.setValueinTextbox(Label_FIeld, editTitleField);
            actionclass.setValueinTextbox(Description_Field, titlefield);
            actionclass.clickOnObject(Save_In_edit_Button);
            verificationClass.verifyTextPresent(Delete_Verification_message,editTitleField);
        } catch (Exception e) {
            System.out.println("Error during editing: " + e.getMessage());
        }
        try {
            JavascriptExecutor js2 = (JavascriptExecutor) driver;
            js2.executeScript("window.scrollBy(0,950)", "");
            Thread.sleep(2000);
            String buttonXPath = String.format("//tr[td[contains(text(), '%s')]]//button", titlefield);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXPath)));
            button.click();
            System.out.println("Second button clicked successfully for: " + titlefield);
        } catch (NoSuchElementException e) {
            System.out.println("Second button not found for title: " + titlefield);
        }
        try {
            actionclass.clickOnObject(Deletebutton1);  // Ensure Deletebutton is located using @FindBy
            Thread.sleep(8000);
            actionclass.clickOnObject(Delete_button);  // Assuming Delete_button is properly located as well
            verificationClass.verifyTextPresent(Delete_Verification_message,editTitleField);
        } catch (Exception e) {
            System.out.println("Error during deletion: " + e.getMessage());
        }
        try {
            if (!CreateModule.isDisplayed()) {
                System.out.println("CommentTypes is deleted successfully.");
            } else {
                System.out.println("CommentTypes is still displayed.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("CommentTypes is deleted successfully.");
        }

        // verificationClass.verifyElementNotPresent(Contant_deleted);
    }
    public void Contact_form(String titlefield, String emailfield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Click_on_Contactform_module);
        actionclass.clickOnObject(Click_on_Add_type);
        actionclass.setValueinTextbox(Label_FIeld, titlefield);
        actionclass.setValueinTextbox(Description_Field, emailfield);
        actionclass.clickOnObject(Savebutton_ContactUs);
        verificationClass.verifyTextPresent(Delete_Verification_message,titlefield);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.hoverOnObject(hovercontect);
        actionclass.hoverOnObject(CreateModule);
        actionclass.clickOnObject(hoverdelet);
        actionclass.clickOnObject(hoverdelet2);
        verificationClass.verifyTextPresent(Delete_Verification_message,titlefield);
    }
        public void BlockTypes_module(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Click_on_blocktype_module);
        actionclass.clickOnObject(Click_on_Add_type);
        actionclass.setValueinTextbox(Label_FIeld, titlefield);
        actionclass.clickOnObject(Save_Button);
        Thread.sleep(7000);
        verificationClass.verifyTextPresent(Delete_Verification_message, titlefield);
        verifyModuleNameInTable(titlefield);
        actionclass.clickOnObject(CreateModule);
        actionclass.setValueinTextbox(Label_FIeld, editTitleField);
        actionclass.setValueinTextbox(Description_Field, titlefield);
        actionclass.clickOnObject(Save_In_edit_Button);
        Thread.sleep(3000);
        verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
        verifyModuleNameInTable(editTitleField);
        actionclass.clickOnObject(EditModuleName);
        actionclass.clickOnObject(Delete_button_IN_edit);
        Thread.sleep(8000);
        actionclass.clickOnObject(Delete_button);
        verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            try {
            if (!CreateModule.isDisplayed()) {
                System.out.println("Blocktype is deleted successfully.");
            } else {
                System.out.println("Blocktype is still displayed.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Blocktype is deleted successfully.");
        }
    }
    public void CommentTypes(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.hoverOnObject(Hover_ON_Structure);
        actionclass.clickOnObject(Click_ON_Structure);
        actionclass.clickOnObject(Click_on_Commenttype_module);
        actionclass.clickOnObject(Click_on_Add_type);
        actionclass.setValueinTextbox(Label_FIeld, titlefield);
        actionclass.clickOnObject(dropdown_Field);
        actionclass.clickOnObject(Dropdown_select);
        actionclass.clickOnObject(Save_Button);
        Thread.sleep(3000);
        verificationClass.verifyTextPresent(Delete_Verification_message, titlefield);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            String buttonXPath = String.format("//tr[td[contains(text(), '%s')]]//button", titlefield);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXPath)));
            button.click();
            System.out.println("First button clicked successfully for: " + titlefield);
        } catch (NoSuchElementException e) {
            System.out.println("First button not found for title: " + titlefield);
        }
        try {
            actionclass.clickOnObject(Editbutton);  // Ensure Editbutton is located using @FindBy
            actionclass.setValueinTextbox(Label_FIeld, editTitleField);
            actionclass.setValueinTextbox(Description_Field, titlefield);
            actionclass.clickOnObject(Save_In_edit_Button);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
        } catch (Exception e) {
            System.out.println("Error during editing: " + e.getMessage());
        }
        try {
            String buttonXPath = String.format("//tr[td[contains(text(), '%s')]]//button", titlefield);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXPath)));
            button.click();
            System.out.println("Second button clicked successfully for: " + titlefield);
        } catch (NoSuchElementException e) {
            System.out.println("Second button not found for title: " + titlefield);
        }
        try {
            actionclass.clickOnObject(Deletebutton1);  // Ensure Deletebutton is located using @FindBy
            Thread.sleep(5000);
            actionclass.clickOnObject(Delete_button);  // Assuming Delete_button is properly located as well
        } catch (Exception e) {
            System.out.println("Error during deletion: " + e.getMessage());
        }
        try {
            if (!CreateModule.isDisplayed()) {
                System.out.println("CommentTypes is deleted successfully.");
            } else {
                System.out.println("CommentTypes is still displayed.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("CommentTypes is deleted successfully.");
        }
    }
}
