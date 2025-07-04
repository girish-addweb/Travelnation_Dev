package AddModule_dev_site.TestCases;
import AddModule_dev_site.Reports.Report;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import AddModule_dev_site.Reports.GitHubFileUploader;
import static AddModule_dev_site.Constans.CommonVars.*;

public class BaseCase extends Report {
    public static WebDriver driver;
    public static String Message = "";
    @BeforeSuite
    public void initialize() throws InterruptedException, SQLException, IOException, AWTException {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\addweb\\Desktop\\Travelnation_automation\\Travelnation_Dev-Site_Automation\\Travelnation_AddModule_Automation\\chromedriver.exe");

        // Configure Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("window-size=1920,1080");

        // Initialize the ChromeDriver
        driver = new ChromeDriver(options);

        // Navigate to the development URL
        driver.get(Dev_URL);

        // Optional wait (can be replaced with WebDriverWait)
        Thread.sleep(5000);
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
        }

        if (extent != null) {
            extent.flush(); // Flush the report data
        }
        String reportsDirectory = "C:\\Users\\addweb\\IDEAProjects\\Travelnation_BE_Automation_dev_site\\src\\test\\java\\AddModule_dev_site\\Reports";
        String reportFilePath = GitHubFileUploader.getLatestReportFile(reportsDirectory);
        String reportFileName = reportFilePath.substring(reportFilePath.lastIndexOf("\\") + 1);
        String baseURL = "https://girish-addweb.github.io/HTML_Report/";
        String fullURL = baseURL + reportFileName;
        try {
            GitHubFileUploader.GithubLogin(username1, password1);
            GitHubFileUploader.navigateToRepository(repoUrl);
            GitHubFileUploader.uploadReport(reportFilePath);
            System.out.println("Test report uploaded successfully.");
            System.out.println("The uploaded report is available at: " + fullURL);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // Ensure browser is closed
        }
        if (driver != null) {
            driver.quit(); // Close the browser
        }
        if (extent != null) {
            extent.flush();
        }
        int totalTests = 0;
        int passedCount = 0;
        int failedCount = 0;
        int skippedCount = 0;
        ArrayList jobStatusList = new ArrayList();
        try {
            File input = new File(reportPath);
            Document doc = Jsoup.parse(input, "UTF-8");
            Elements TotalTestsStatus = doc.select(".test-status");
            Elements TotalTestsName = doc.select(".test-name");
            Elements TotalTestsStart = doc.select(".start-time");
            Elements TotalTestsEnd = doc.select(".end-time");
            for (int i = 0; i < TotalTestsStatus.size(); i++) {
                Element testElementStatus = TotalTestsStatus.get(i);
                Element testElementName = TotalTestsName.get(i);
                Element testElementStart = TotalTestsStart.get(i);
                Element testElementEnd = TotalTestsEnd.get(i);
                String status = testElementStatus.text();
                String testName = testElementName.text();
                String startTime = testElementStart.text();
                String endTime = testElementEnd.text();
                String jobStatus = "{\n" +
                        "   \"job_" + (i + 1) + "\": {\n" +
                        "       \"job_name\": \"" + testName + "\",\n" +
                        "       \"job_description\": \"Description for " + testName + "\",\n" +
                        "       \"status\": \"" + (status.equals("pass") ? "pass" : "fail") + "\",\n" +
                        "       \"start_timestamp\": " + startTime + ",\n" +
                        "       \"end_timestamp\": " + endTime + "\n" +
                        "   }\n" +
                        "}";
                jobStatusList.add(jobStatus);
            }

            System.out.println(jobStatusList);

            totalTests = TotalTestsStatus.size();
            passedCount = 0;
            failedCount = 0;
            skippedCount = 0;

            for (Element element : TotalTestsStatus) {
                String status = element.text();

                // Check the status and count accordingly
                if ("pass".equalsIgnoreCase(status)) {
                    passedCount++;
                } else if ("fail".equalsIgnoreCase(status)) {
                    failedCount++;
                } else if ("skip".equalsIgnoreCase(status)) {
                    skippedCount++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        Message += "*Test Summary for Travelnation Dev Site*\n" +
                "• Passed: " + passedCount + "\n" +
                "• Failed: " + failedCount + "\n" +
                "• Skipped: " + skippedCount + "\n" +
                "• Total: " + totalTests + "\n\n" +
                "[*Detailed Report*](" + fullURL + ")";
        System.out.println(Message);
        sendMessageToRocketChat(Message);
    }
    public void sendMessageToRocketChat(String message) {
        try {
          String apiUrl = "https://chat.addwebsolution.in/api/v1/chat.postMessage";
           String accessToken = "QKwIuTJaaYdyPz7BBuYypVOeyElGUZv4_loW3ANbgB_";
           String userId = "Cv9Tt3wzoyEtHxvaL";

            String channel = "";
            JSONObject jsonPayload = new JSONObject();
            jsonPayload.put("channel", channel);
            jsonPayload.put("text", message);
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("X-Auth-Token", accessToken);
            connection.setRequestProperty("X-User-Id", userId);
            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonPayload.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            if (responseCode == 200) {
                System.out.println("Message sent successfully!");
            } else {
                System.out.println("Failed to send message. Response Code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
