package AddModule_dev_site.Reports;

import AddModule_dev_site.TestCases.BaseCase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import static AddModule_dev_site.Constans.CommonVars.GithubUrl;

public class GitHubFileUploader extends BaseCase {
    static final String userDirectory = System.getProperty("user.dir");

    public static void GithubLogin(String username, String password) {
        try {
            driver.get(GithubUrl);
            WebElement usernameField = driver.findElement(By.id("login_field"));
            usernameField.sendKeys(username);
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys(password);
            WebElement loginButton = driver.findElement(By.name("commit"));
            loginButton.click();
        } catch (Exception e) {
            System.out.println("Error during GitHub login: " + e.getMessage());
        }
    }

    // Navigate to the GitHub repository
    public static void navigateToRepository(String repoUrl) throws InterruptedException {
            driver.get(repoUrl);
        Thread.sleep(6000);
    }
    public static void uploadReport(String reportFilePath) throws InterruptedException {
        // Locate the file input element
//        driver.findElement(By.id(":R5b5ab:")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/ul/li[2]/a/div/span")).click();
//        Thread.sleep(5000);
        WebElement fileInput = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/main/turbo-frame/div/div/div[2]/form[2]/file-attachment/p/input"));
        fileInput.sendKeys(reportFilePath); // Provide the dynamic file path
        Thread.sleep(6000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='message']")));
        WebElement commitMessageField = driver.findElement(By.xpath("//input[@name='message']"));
        commitMessageField.sendKeys("Automated: Uploaded dynamic test report");
        WebElement commitButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/main/turbo-frame/div/div/form/button"));
        Thread.sleep(6000);
        commitButton.click();
    }
    public static String getLatestReportFile(String directoryPath) {
        File dir = new File(directoryPath);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            throw new RuntimeException("No files found in the directory: " + directoryPath);
        }
        File latestFile = files[0];
        for (File file : files) {
            if (file.lastModified() > latestFile.lastModified()) {
                latestFile = file;
            }
        }
        return latestFile.getAbsolutePath();
    }
}

