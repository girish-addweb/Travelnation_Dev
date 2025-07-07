package AddModule_dev_site.TestCases;

import AddModule_dev_site.Pages.Addcontent_Module;
import AddModule_dev_site.Pages.BELogin;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

import static AddModule_dev_site.Constans.CommonVars.*;
import static AddModule_dev_site.Reports.Report.extent;
public class TestCasePage_Addcontent extends BaseCase {
  // this is for the login
    @Test(priority = 1, groups = "Login")
    public void Login() throws IOException, InterruptedException {
        if (extent == null) {
            throw new IllegalStateException("ExtentReports object is not initialized. Please initialize it before use.");
        }
        logger = extent.createTest("Check login functionality.");
        BELogin BElogin = new BELogin(driver, logger);
        BElogin.Login(username, password);
    }
    // this is for the blog post testing
    @Test(priority = 2, groups = "AddContent")
    public void Blogpost_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check blogpost module functionality.");
        Addcontent_Module blogpost = new Addcontent_Module(driver, logger);
        blogpost.BlogPost(Titlename, expacted_message, Edit_Titlename, Edit_expacted_message, Delete_expacted_message);
    }
    // this is for the CampervanCollection module testing
    @Test(priority = 3, groups = "AddContent")
    public void CampervanCollection_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check CampervanCollection module functionality.");
        Addcontent_Module CampervanCollection = new Addcontent_Module(driver, logger);
        CampervanCollection.CampervanCollection(Titlename, String.valueOf(Price), Edit_Titlename);
    }
    // this is for the Country module testing
    @Test(priority = 4, groups = "AddContent")
    public void Country() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Country module functionality.");
        Addcontent_Module Country = new Addcontent_Module(driver, logger);
        Country.CountryModule(Titlename, Edit_Titlename);
    }
    // this is for the GAdventurestour module testing
    @Test(priority = 5, groups = "AddContent")
    public void GAdventurestour_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check GAdventurestour module functionality.");
        Addcontent_Module GAdventurestour = new Addcontent_Module(driver, logger);
        GAdventurestour.GAdventurestour(Titlename, Edit_Titlename);
    }
    // this is for the Generic_Article module testing
    @Test(priority = 6, groups = "AddContent")
    public void Generic_Article_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Generic_Article module functionality.");
        Addcontent_Module Generic_ArticleModule = new Addcontent_Module(driver, logger);
        Generic_ArticleModule.Generic_Article(Titlename, Edit_Titlename);
    }
    // this is for the Group_Tour module testing
    @Test(priority = 7, groups = "AddContent")
    public void Group_tour_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Group_Tour module functionality.");
        Addcontent_Module Group_tour_Module = new Addcontent_Module(driver, logger);
        Group_tour_Module.Group_tour(Titlename, Edit_Titlename);
    }
    // this is for the Group_tour_leanding_page module testing
    @Test(priority = 8, groups = "AddContent")
    public void Group_tour_leanding_page_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Group_tour_leanding_page module functionality.");
        Addcontent_Module Group_tour_leanding_pagemodule = new Addcontent_Module(driver, logger);
        Group_tour_leanding_pagemodule.GroupTourlandingpage(Titlename, Edit_Titlename);
    }
    // this is for the Hotels module testing
    @Test(priority = 9, groups = "AddContent")
    public void Hotels_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Hotels module functionality.");
        Addcontent_Module HotelsModule = new Addcontent_Module(driver, logger);
        HotelsModule.Hotels(Titlename, Edit_Titlename);
    }
    // this is for the Itinerary module testing
    @Test(priority = 10, groups = "AddContent")
    public void Itinerary_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Itinerary module functionality.");
        Addcontent_Module Itinerary = new Addcontent_Module(driver, logger);
        Itinerary.Itinerary(Titlename, Stop, ticket, Edit_Titlename);
    }
    // this is for the landingpage module testing
    @Test(priority = 11, groups = "AddContent")
    public void landingpage_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check landingpage module functionality.");
        Addcontent_Module landingpage = new Addcontent_Module(driver, logger);
        landingpage.Landingpage(Titlename, Edit_Titlename);
    }
    // this is for the PackageModule module testing
    @Test(priority = 12, groups = "AddContent")
    public void Package_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check PackageModule module functionality.");
        Addcontent_Module PackageModule = new Addcontent_Module(driver, logger);
        PackageModule.PackageModule(Titlename, Edit_Titlename);
    }
    // this is for the Tickettype_module module testing
    @Test(priority = 13, groups = "AddContent")
    public void Tickettype_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Tickettype_module  functionality.");
        Addcontent_Module Tickettypemodule = new Addcontent_Module(driver, logger);
        Tickettypemodule.Tickettype_module(Titlename, Edit_Titlename, Price);
    }
    // this is for the Tour_module module testing
    @Test(priority = 14, groups = "AddContent")
    public void Tour_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Tour_module  functionality.");
        Addcontent_Module Tourmodule = new Addcontent_Module(driver, logger);
        Tourmodule.Tour_module(Titlename, Edit_Titlename);
    }
    @Test(priority = 15, groups = "AddContent")
    public void Travel_guide_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Travel_guide module  functionality.");
        Addcontent_Module Travel_guide = new Addcontent_Module(driver, logger);
        Travel_guide.Travel_guide(Titlename, Edit_Titlename);
    }
    @Test(priority = 16, groups = "AddContent")
    public void Videohomepage_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Video-Homepgae module functionality.");
        Addcontent_Module Video_home = new Addcontent_Module(driver, logger);
        Video_home.Video_Homepage(Titlename, Edit_Titlename);
    }
}