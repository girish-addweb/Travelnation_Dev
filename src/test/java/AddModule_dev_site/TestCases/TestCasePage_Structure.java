package AddModule_dev_site.TestCases;

import AddModule_dev_site.Pages.BELogin;
import AddModule_dev_site.Pages.Structure_Module;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

import static AddModule_dev_site.Constans.CommonVars.*;
import static AddModule_dev_site.Reports.Report.extent;

public class TestCasePage_Structure extends BaseCase {

    @Test(priority = 1, groups = "Login")
    public void Login() throws IOException, InterruptedException {
        if (extent == null) {
            throw new IllegalStateException("ExtentReports object is not initialized. Please initialize it before use.");
        }
        logger = extent.createTest("Check login functionality.");
        BELogin BElogin = new BELogin(driver, logger);
        BElogin.Login(username, password);
    }
    @Test(priority = 2, groups = "Structure")
    public void BlockTypes_module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Blocktype module functionality.");
        Structure_Module Structure_Module = new Structure_Module(driver, logger);
        Structure_Module.BlockTypes_module(Titlename, Edit_Titlename);
    }
    @Test(priority = 3, groups = "Structure")
    public void Contant_Types_module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Contant_Types_module functionality.");
        Structure_Module blogpost = new Structure_Module(driver, logger);
        blogpost.Contant_Types(Titlename, Edit_Titlename);
    }
    @Test(priority = 3, groups = "Structure")
    public void CommentTypes_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check CommentTypes_Module functionality.");
        Structure_Module Structure_Module = new Structure_Module(driver, logger);
        Structure_Module.CommentTypes(Titlename, Edit_Titlename);
    }
    @Test(priority = 4, groups = "Structure")
    public void Contentform_module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Blocktype module functionality.");
        Structure_Module Contentform_Module = new Structure_Module(driver, logger);
        Contentform_Module.Contact_form(Titlename, email, Edit_Titlename);
    }
    @Test(priority = 5, groups = "Structure")
    public void DisplayedIcon_module_form() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check DisplayedIcon_module form mode functionality.");
        Structure_Module Formmodes = new Structure_Module(driver, logger);
        Formmodes.Form_Modes(Titlename, Edit_Titlename);
    }
    @Test(priority = 6, groups = "Structure")
    public void DisplayedIcon_module_View() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check DisplayedIcon_module view modes functionality.");
        Structure_Module View_modes = new Structure_Module(driver, logger);
        View_modes.View_modes(Titlename, Edit_Titlename);
    }
    @Test(priority = 7, groups = "Structure")
    public void Entityqueues_module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Entityqueues module view modes functionality.");
        Structure_Module Entityqueues = new Structure_Module(driver, logger);
        Entityqueues.Entityqueues_module(Titlename, Edit_Titlename);
    }
    @Test(priority = 8, groups = "Structure")
    public void Menu_module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Menu module view modes functionality.");
        Structure_Module menus = new Structure_Module(driver, logger);
        menus.Menu_module(Titlename, Edit_Titlename);
    }
    @Test(priority = 9, groups = "Structure")
    public void Paragraph_types_module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Paragraph_types_module  view modes functionality.");
        Structure_Module Paragraph_type = new Structure_Module(driver, logger);
        Paragraph_type.Paragraph_types_module(Titlename, Edit_Titlename);
    }
    @Test(priority = 10, groups = "Structure")
    public void Taxonomy_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Paragraph_types_module  view modes functionality.");
        Structure_Module Taxonomy = new Structure_Module(driver, logger);
        Taxonomy.Taxonomy_Module(Titlename, Edit_Titlename);
    }
    @Test(priority = 11, groups = "Structure")
    public void View_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check View_module functionality.");
        Structure_Module View_module = new Structure_Module(driver, logger);
        View_module.View_Module(Titlename, Edit_Titlename);
    }
    @Test(priority = 12, groups = "Structure")
    public void Vote_Types_Module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check View_module functionality.");
        Structure_Module View_module = new Structure_Module(driver, logger);
        View_module.Vote_Types_Module(Titlename, Edit_Titlename);
    }
    @Test(priority = 13, groups = "Structure")
    public void Webform_module() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check View_module functionality.");
        Structure_Module View_module = new Structure_Module(driver, logger);
        View_module.Webforms_Module(Titlename, Edit_Titlename);
    }
    @Test(priority = 14, groups = "Structure")
    public void Media_type() throws IOException, InterruptedException, SQLException, AWTException {
        logger = extent.createTest("Check Media Type functionality.");
        Structure_Module AddMedia = new Structure_Module(driver, logger);
        AddMedia.Media_type(Titlename, Edit_Titlename);
    }
}