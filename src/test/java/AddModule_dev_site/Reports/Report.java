package AddModule_dev_site.Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Report {
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;

    // Define user directory and date formatter for the report file
    static final String userDirectory = System.getProperty("user.dir");
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss");
    String formattedDateTime = currentDateTime.format(formatter);
    String reportFileName = formattedDateTime + "_TestReport.html";
    // Report Path
    public String reportPath = userDirectory + "/src/test/java/AddModule_dev_site/Reports/" + reportFileName;
    @BeforeSuite(alwaysRun = true)
    public void initReport() throws SQLException, IOException {
        Files.createDirectories(Paths.get(userDirectory + "/src/test/java/AddModule_dev_site/Reports/"));
        htmlReporter = new ExtentHtmlReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        // Set system information for the report
        extent.setSystemInfo("Host Name", "Travelnation_BE_Automation_Project");
        extent.setSystemInfo("Environment", "TravelnationBE_Reports");
        extent.setSystemInfo("User Name", "Girish");
        htmlReporter.config().setDocumentTitle("Automation Test Report");
        htmlReporter.config().setReportName("Travelnation Backend Test Results");
    }
    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        if (extent != null) {
            extent.flush();
        }
    }
}
