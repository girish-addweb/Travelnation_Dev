package AddModule_dev_site.Pages;

import AddModule_dev_site.ActionClass.ActionClass;
import AddModule_dev_site.ActionClass.VerificationClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import static AddModule_dev_site.ActionClass.ActionClass.test;
import static AddModule_dev_site.Constans.CommonVars.Price;

public class Addcontent_Module {
    WebDriver driver;
    ExtentTest extentTest;
    @FindBy(xpath = "/html/body/div[2]/nav/div[2]/div/nav/div[1]/ul/li[2]/a")
    WebElement Content;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/a")
    WebElement Blogpost_module;
    @FindBy(xpath = "/html/body/div[2]/div/header/div/div/div[2]/div[1]/div/div/input")
    WebElement Unpublish_Button;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div[1]/div/input")
    WebElement Titlefield;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/ul/li[3]/a")
    WebElement PagemediaTab;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[3]/div/div[1]/fieldset/div/span[2]/input")
    WebElement primaryimage;
    @FindBy(xpath = "/html/body/div[8]/div[2]/div/div/div[2]/div/div[3]/div/form/div[2]/div[2]/div[1]/span/div/input")
    WebElement Select_image;
    @FindBy(xpath = "/html/body/div[8]/div[3]/div[2]/button")
    WebElement Insert_image;
    @FindBy(xpath = "/html/body/div[2]/div/header/div/div/div[2]/input")
    WebElement Savebutton;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[1]/input")
    WebElement Contentfindfield;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[5]/input[1]")
    WebElement Filter_button;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select")
    WebElement clickondropdown;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[2]")
    WebElement blogpost_option;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[2]/div/form/div[2]/table/tbody/tr[1]/td[2]/a")
    WebElement Created_content_name;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[2]/div/form/div[2]/table/tbody/tr/td[7]/div/div/ul/li[1]/a")
    WebElement Click_Edit_content;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div[2]/div/div[1]/div/div/div[2]/div")
    WebElement introfield;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[2]/div/form/div[2]/table/tbody/tr[1]/td[7]/div/div/ul/li[2]/button")
    WebElement deletedropdown;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[2]/div/form/div[2]/table/tbody/tr/td[7]/div/div/ul/li[3]/ul/li[2]/a")
    WebElement deletebutton;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[2]/div/form/div[2]/table/tbody/tr[1]/td[7]/div/div/ul/li[3]/ul/li[1]/a")
    WebElement deletebutton2;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[2]/div/form/div[2]/table/tbody/tr[1]/td[7]/div/div/ul/li[3]/ul/li[2]/a")
    WebElement deletebuttonforblog;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button[1]")
    WebElement MainDeletebutton;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[2]/div/form/div/table/tbody/tr/td")
    WebElement Nocontentfound;
    @FindBy(xpath = "/html/body/div[2]/header/div/div/div[2]/ul/li/a")
    WebElement Addcontent;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[2]/a")
    WebElement CampervanCollection_Module;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[1]/div/input")
    WebElement CampervanCollection_Module_TitleField;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[2]/div/div[1]/textarea")
    WebElement CampervanCollection_Module_PicUp_point_Field;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[3]/div/input")
    WebElement CampervanCollection_Module_Disclaimer_Field;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[4]/div/select")
    WebElement CampervanCollection_Country_Dropdown;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[4]/div/select/option[110]")
    WebElement CampervanCollection_Country_select;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/ul/li[4]/a/strong")
    WebElement CampervanCollection_Search_region;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/ul/li[4]/a/strong")
    WebElement CampervanCollection_Region_dropdown;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[4]/div/div/div/div[1]/div[1]/div/select/option[7]")
    WebElement CampervanCollection_Region_dropdown_select;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[4]/div/div/div/div[1]/div[1]/div[2]/select")
    WebElement CampervanCollection_Region_dropdown_1;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[4]/div/div/div/div[1]/div[1]/div[2]/select/option[3]")
    WebElement CampervanCollection_Region_dropdown_select1;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[4]/div/div/div/div[1]/div[1]/div[3]/select")
    WebElement CampervanCollection_Region_dropdown_2;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[4]/div/div/div/div[1]/div[1]/div[3]/select/option[5]")
    WebElement CampervanCollection_Region_dropdown_select2;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/ul/li[2]/a")
    WebElement Overviewtab;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[2]/div/div/div[1]/div/div[1]/textarea")
    WebElement CampervanCollection_Summary;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[3]")
    WebElement selectdropdown_CampervanCollection;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/ul/li[2]/a/strong")
    WebElement PriceTab_CampervanCollection;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[2]/div/div[1]/div/input")
    WebElement Price_field;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[3]/a")
    WebElement country;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/div/details[1]/div/div/div[1]/div/input")
    WebElement country_Title;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/ul/li[3]/a")
    WebElement country_media;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/ul/li[4]/a")
    WebElement country_continent;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/div/details[4]/div/div/div/div/select")
    WebElement country_continent_select;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/div/details[4]/div/div/div/div/select/option[5]")
    WebElement country_continent_select_Option;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/div/details[3]/div/div/div/fieldset/div/span[2]/input")
    WebElement mediaimage;
    @FindBy(xpath = "/html/body/div[9]/div[2]/div/div/div[2]/div/div[3]/div/form/div[2]/div[1]/div[2]/span/article/div[1]/div/img")
    WebElement Selctimg;
    @FindBy(xpath = "/html/body/div[9]/div[3]/div[2]/button")
    WebElement insertimage;
    @FindBy(xpath = "/html/body/div[2]/div/header/div/div/div[2]/input[1]")
    WebElement saveforcountry;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/div/details[1]/div/div/div[3]/div/div[2]/div/div/div[2]/div")
    WebElement Body_field;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[4]")
    WebElement dropdowncountry;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[4]/a")
    WebElement G_adv;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[6]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[1]/div/input")
    WebElement G_adv_titlefield;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[6]/div/div/details[1]/div/div/div/div/ul/li[3]/a")
    WebElement G_adv_titlefield_tag_Tab;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[6]/div/div/details[1]/div/div/div/div/div/details[3]/div/div[1]/fieldset/div/div/div[2]/input")
    WebElement G_adv_titlefield_Tag_Option;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[5]")
    WebElement G_advanture_dropdown;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[6]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[3]/div/input")
    WebElement G_advanture_Edit;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[5]/a")
    WebElement Generic_Article;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[6]")
    WebElement Generic_Article_dropdown;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div[2]/div/div[1]/textarea")
    WebElement Generic_Article_summeryfield;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[6]/a")
    WebElement Group_tour_module;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/input")
    WebElement Group_tour_title_field;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[7]")
    WebElement Group_tour_dropdown;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/div[2]/div/div/div[2]/div")
    WebElement Group_tour_Editfield;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[8]")
    WebElement Group_tour_Leanding_page_dropdown;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[7]/a")
    WebElement Group_tour_leanding_Page_module;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[4]/div/div[2]/div/div/div[2]/div")
    WebElement Group_tour_leanding_Edit_field;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[8]/a")
    WebElement Hotel_module;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[3]/div/input")
    WebElement Hotel_Edit_field;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[9]")
    WebElement Hotel_dropdown;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[9]/a")
    WebElement Itinerary;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[5]/div/ul/li[4]/a")
    WebElement Stopclick;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[5]/div/div/details[4]/div/div/div/div/div/table/tbody/tr/td[2]/div/div/div[2]/div[1]/div/div[1]/input")
    WebElement StopField;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[5]/div/div/details[1]/div/div/div[1]/div/div/table/tbody/tr/td[2]/div/div/input")
    WebElement ticketField;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[10]")
    WebElement Itinerarydropdown;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[10]/a")
    WebElement Landingpage;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[11]")
    WebElement Landingpagedropdown;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[5]/div/div[2]/div/div/div[2]/div")
    WebElement Landingpage_edit;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[9]/div/select")
    WebElement Landingpage_layout;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[9]/div/select/option[5]")
    WebElement Landingpage_layout_option;
    // /html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[7]/div/div/select/option[6]
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[11]/a")
    WebElement Package;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div[1]/div/input")
    WebElement Package_title;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[2]/div/div/div/div/select")
    WebElement select_package;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[2]/div/div/div/div/select/option[7]")
    WebElement select_package_value;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[12]")
    WebElement Packagedropdown;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div[2]/div/div[2]/div/div/div[2]/div")
    WebElement EditField_package;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[12]/a")
    WebElement Tickettype;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/div/details[1]/div/div/div[1]/div/input")
    WebElement ticketname_field;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/div/details[1]/div/div/div[2]/div/select")
    WebElement ticket_select;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/div/details[1]/div/div/div[2]/div/select/option[2]")
    WebElement ticket_select_option;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[13]")
    WebElement Ticketdropdown;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[13]/a")
    WebElement Tourmodule;
    @FindBy(xpath = "html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[2]/div/input")
    WebElement Tourcodefield;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[3]/div/input")
    WebElement Tourmodulestartloc;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[5]/div/input")
    WebElement Tourmodule_days;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[6]/div/select/option[2]")
    WebElement Tourmodule_country;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/ul/li[2]/a/strong")
    WebElement Tourmodule_tags;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[2]/div/div[1]/div/select")
    WebElement Tourmodule_tags_select;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[2]/div/div[1]/div/select/option[7]")
    WebElement Tourmodule_tags_selectoption;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[2]/div/div[2]/fieldset/div/div[1]/div[1]/input")
    WebElement Tourmodule_tags_Checkbox;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/ul/li[3]/a/strong")
    WebElement Tourmodule_search_reagions;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[3]/div/div/div/div[1]/div[1]/div/select")
    WebElement Tourmodule_search_reagions_select;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[3]/div/div/div/div[1]/div[1]/div/select/option[7]")
    WebElement Tourmodule_search_reagions_select_dropdown;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[3]/div/div/div/div[1]/div[1]/div[2]/select")
    WebElement Tourmodule_search_reagions_select_b;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[3]/div/div/div/div[1]/div[1]/div[2]/select/option[3]")
    WebElement Tourmodule_search_reagions_select_dropdown_b;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[3]/div/div/div/div[1]/div[1]/div[3]/select")
    WebElement Tourmodule_search_reagions_select_c;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[3]/div/div/div/div[1]/div[1]/div[3]/select/option[5]")
    WebElement Tourmodule_search_reagions_select_dropdowm_c;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/ul/li[4]/a")
    WebElement Tabbed_group_tab;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[4]/div/div/div/div/div/details[1]/div/div[1]/div/div[1]/textarea")
    WebElement Tabbed_group_textarea;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/ul/li[12]/a/span[1]/strong")
    WebElement Pricetab;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[12]/div/div/div[3]/div/select")
    WebElement Pricetab_currency_dropdown;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[12]/div/div/div[3]/div/select/option[3]")
    WebElement Pricetab_currency_dropdown_select;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[12]/div/div/div[8]/div/div/table/tbody/tr/td[2]/div/div/div[2]/div[4]/div/select")
    WebElement Pricetab_currency_dropdown_a;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[12]/div/div/div[8]/div/div/table/tbody/tr/td[2]/div/div/div[2]/div[4]/div/select/option[3]")
    WebElement Pricetab_currency_dropdown_select_A;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[14]")
    WebElement Tourdropdown;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[1]/div/div/details[1]/div/div/div/div/div/details[1]/div/div[4]/div/input")
    WebElement Touredit;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[14]/a")
    WebElement travelguide;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[15]")
    WebElement Travel_guide_dropdown;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[1]/form/div[2]/select/option[16]")
    WebElement HomepageVideo_dropdown;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[3]/div/div/details[1]/div/div/div[5]/div/div[1]/div/div/div[2]/div")
    WebElement Videohomepageedit;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[15]/a")
    WebElement HomePage_video;
    @FindBy(xpath = "/html/body/div[12]/div/div/div/div[3]/div[2]/button[2]")
    WebElement Accept_button;
    @FindBy(xpath = "/html/body/div[3]/main/div/section/div/div[1]/div/div[1]/div/div")
    WebElement Actual_message;
    @FindBy(xpath = "/html/body/div[3]/main/div/section/div/div[1]/div/div[1]/div/div/em/a")
    WebElement Verification_message;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[2]/div/div/div/div[2]/em/a")
    WebElement Edit_Verification_message;
    @FindBy(xpath = "/html/body/div[2]/div[5]/main/div[2]/div/div/div/div[2]/em")
    WebElement Delete_Verification_message;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[7]/div/div/details[1]/div/div/div[1]/div/input")
    WebElement Tourid;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[7]/div/div/details[1]/div/div/div[2]/div/input")
    WebElement Tripcode;
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/main/div[4]/div/form/div/div[1]/div[9]/div/select")
    WebElement dropdown;
    public Addcontent_Module(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.extentTest = test;
        PageFactory.initElements(driver, this);
    }
    public void verifyModuleNameInTable(String expectedModuleName) {
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[2]/div/form/div[2]/table/tbody/tr"));
        boolean moduleFound = false;
        for (WebElement row : rows) {
            WebElement moduleNameElement = row.findElement(By.xpath("./td[2]/a"));
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
        }
        else
            test.log(Status.PASS, "Module name verification passed. Expected module name: " + expectedModuleName + " was found in the table.");
        System.out.println("Module name verification passed Expected module name: " + expectedModuleName + " was found in the table.");
    }

    public void verifyModuleNameAndDateTime(String expectedModuleName, String expectedDateTime) {
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[2]/div[5]/main/div[4]/div/div/div/div[2]/div/form/div[2]/table/tbody/tr"));
        boolean moduleFound = false;
        for (WebElement row : rows) {
            WebElement moduleNameElement = row.findElement(By.xpath("./td[2]/a"));
            String actualModuleName = moduleNameElement.getText();
            System.out.println("Module Name: " + actualModuleName);
            if (actualModuleName.equals(expectedModuleName)) {
                test.log(Status.FAIL, "Module is not deleted from the table " + actualModuleName);
                System.out.println("Module is not deleted from the table " + actualModuleName);
                WebElement dateTimeElement = row.findElement(By.xpath("./td[6]/time"));
                String actualDateTime = dateTimeElement.getAttribute("datetime"); // Get the datetime attribute or text
                System.out.println("Found Date/Time: " + actualDateTime);
                if (actualDateTime.equals(expectedDateTime)) {
                    test.log(Status.FAIL, "Date/Time is same so module is not deleted: " + actualDateTime);
                    System.out.println("Date/Time is same so module is not deleted: " + actualDateTime);
                } else {
                    test.log(Status.PASS, "Date/Time is not same so the module is deleted successfully " + expectedDateTime + ", but found: " + actualDateTime);
                    System.out.println("Date/Time is not same so the module is deleted successfully " + expectedDateTime + ", but found: " + actualDateTime);
                }
                moduleFound = true;
                break;
            }
        }
        if (!moduleFound) {
            test.log(Status.PASS, "Module deleted successfully. Expected module name: " + expectedModuleName + " was not found in the table.");
            System.out.println("Module deleted successfully. Expected module name: " + expectedModuleName + " was not found in the table.");
        }
    }
    public void BlogPost(String titleField, String expectedMessage, String editTitleField, String editExpectedMessage, String deleteExpectedMessage) throws InterruptedException, IOException {
        ActionClass actionClass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actionClass.clickOnObject(Blogpost_module);
        actionClass.clickOnObject(Unpublish_Button);
        actionClass.setValueinTextbox(Titlefield, titleField);
        actionClass.clickOnObject(PagemediaTab);
        actionClass.clickOnObject(primaryimage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/div/div[3]/div/form/div[2]/div[2]/div[2]/span/article/div[1]/div/img")));
        actionClass.clickOnObject(Select_image);
        actionClass.clickOnObject(Insert_image);
        Thread.sleep(8000);
        actionClass.clickOnObject(Savebutton);
        Thread.sleep(8000);
        verificationClass.verifyTextPresent(Verification_message, titleField);
        actionClass.clickOnObject(Content);
        actionClass.setValueinTextbox(Contentfindfield, titleField);
        actionClass.clickOnObject(clickondropdown);
        actionClass.clickOnObject(blogpost_option);
        actionClass.clickOnObject(Filter_button);
        Thread.sleep(4000);
        verifyModuleNameInTable(titleField);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titleField)) {
            System.out.println("The created content name matches the title field.");
            actionClass.clickOnObject(Click_Edit_content);
            actionClass.setValueinTextbox(Titlefield, editTitleField);
            actionClass.setValueinTextbox(introfield, titleField);
            actionClass.clickOnObject(Savebutton);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime); // Print or log the time
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            actionClass.setValueinTextbox(Contentfindfield, editTitleField);
            actionClass.clickOnObject(clickondropdown);
            actionClass.clickOnObject(blogpost_option);
            actionClass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            actionClass.clickOnObject(deletedropdown);
            wait.until(ExpectedConditions.visibilityOf(deletebutton));
            actionClass.clickOnObject(deletebutton);
            wait.until(ExpectedConditions.visibilityOf(MainDeletebutton));
            actionClass.clickOnObject(MainDeletebutton);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionClass.setValueinTextbox(Contentfindfield, editTitleField);
            actionClass.clickOnObject(clickondropdown);
            actionClass.clickOnObject(blogpost_option);
            actionClass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String noContentMessage = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + noContentMessage);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void CampervanCollection(String titlefield, String pricefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(CampervanCollection_Module);
        actionclass.clickOnObject(Unpublish_Button);
        actionclass.setValueinTextbox(CampervanCollection_Module_TitleField, titlefield);
        actionclass.setValueinTextbox(CampervanCollection_Module_PicUp_point_Field, titlefield);
        actionclass.setValueinTextbox(CampervanCollection_Module_Disclaimer_Field, titlefield);
        actionclass.clickOnObject(CampervanCollection_Country_Dropdown);
        actionclass.clickOnObject(CampervanCollection_Country_select);
        Thread.sleep(1000);
        actionclass.clickOnObject(CampervanCollection_Search_region);
        Thread.sleep(1000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown);
        Thread.sleep(1000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown_select);
        Thread.sleep(2000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown_1);
        Thread.sleep(2000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown_select1);
        Thread.sleep(2000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown_2);
        Thread.sleep(2000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown_select2);
        Thread.sleep(2000);
        actionclass.clickOnObject(Overviewtab);
        actionclass.setValueinTextbox(CampervanCollection_Summary, titlefield);
        actionclass.clickOnObject(Savebutton);
        Thread.sleep(4000);
        verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(selectdropdown_CampervanCollection);
        actionclass.clickOnObject(Filter_button);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(CampervanCollection_Module_TitleField, editTitleField);
            actionclass.clickOnObject(PriceTab_CampervanCollection);
            actionclass.setValueinTextbox(Price_field, pricefield);
            actionclass.clickOnObject(Savebutton);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(3000);
            verifyModuleNameInTable(editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(selectdropdown_CampervanCollection);
            actionclass.clickOnObject(Filter_button);
            Thread.sleep(4000);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton);
            Thread.sleep(4000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(selectdropdown_CampervanCollection);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void Video_Homepage (String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(HomePage_video);
        actionclass.setValueinTextbox(ticketname_field, titlefield);
        actionclass.clickOnObject(Unpublish_Button);
        actionclass.clickOnObject(saveforcountry);
      //  verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(HomepageVideo_dropdown);
        actionclass.clickOnObject(Filter_button);
        Thread.sleep(4000);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(ticketname_field, editTitleField);
            actionclass.setValueinTextbox(Videohomepageedit, titlefield);
            actionclass.clickOnObject(saveforcountry);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(HomepageVideo_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton);
            Thread.sleep(4000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(HomepageVideo_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void Travel_guide (String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(travelguide);
        actionclass.setValueinTextbox(Package_title, titlefield);
        actionclass.clickOnObject(Unpublish_Button);
        actionclass.clickOnObject(Savebutton);
        verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(Travel_guide_dropdown);
        actionclass.clickOnObject(Filter_button);
        Thread.sleep(4000);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(Package_title, editTitleField);
            actionclass.setValueinTextbox(EditField_package, titlefield);
            actionclass.clickOnObject(Savebutton);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Travel_guide_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton);
            Thread.sleep(4000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Travel_guide_dropdown);
            actionclass.clickOnObject(Filter_button);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void Tour_module (String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(Tourmodule);
        actionclass.setValueinTextbox(CampervanCollection_Module_TitleField, titlefield);
        actionclass.setValueinTextbox(Tourcodefield, titlefield);
        actionclass.setValueinTextbox(Tourmodulestartloc, titlefield);
        actionclass.setValueinTextbox(Tourmodule_days, titlefield);
        actionclass.clickOnObject(Tourmodule_country);
        actionclass.clickOnObject(Tourmodule_tags);
        actionclass.clickOnObject(Tourmodule_tags_select);
        actionclass.clickOnObject(Tourmodule_tags_selectoption);
        actionclass.clickOnObject(Tourmodule_tags_Checkbox);
        actionclass.clickOnObject(Tourmodule_search_reagions);
        Thread.sleep(1000);
        actionclass.clickOnObject(Tourmodule_search_reagions_select);
        Thread.sleep(1000);
        actionclass.clickOnObject(Tourmodule_search_reagions_select_dropdown);
        Thread.sleep(1000);
        actionclass.clickOnObject(Tourmodule_search_reagions_select_b);
        Thread.sleep(1000);
        actionclass.clickOnObject(Tourmodule_search_reagions_select_dropdown_b);
        Thread.sleep(1000);
        actionclass.clickOnObject(Tourmodule_search_reagions_select_c);
        Thread.sleep(1000);
        actionclass.clickOnObject(Tourmodule_search_reagions_select_dropdowm_c);
        Thread.sleep(1000);
        actionclass.clickOnObject(Tabbed_group_tab);
        actionclass.setValueinTextbox(Tabbed_group_textarea, titlefield);
        actionclass.clickOnObject(Pricetab);
        actionclass.clickOnObject(Pricetab_currency_dropdown);
        actionclass.clickOnObject(Pricetab_currency_dropdown_select);
        actionclass.clickOnObject(Pricetab_currency_dropdown_a);
        actionclass.clickOnObject(Pricetab_currency_dropdown_select_A);
        actionclass.clickOnObject(Savebutton);
        verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(Tourdropdown);
        actionclass.clickOnObject(Filter_button);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(CampervanCollection_Module_TitleField, editTitleField);
            actionclass.setValueinTextbox(Touredit, titlefield);
            actionclass.clickOnObject(Savebutton);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Tourdropdown);
            actionclass.clickOnObject(Filter_button);
            Thread.sleep(4000);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton);
            Thread.sleep(4000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Tourdropdown);
            actionclass.clickOnObject(Filter_button);
            String contentName1 = Nocontentfound.getText();
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void Tickettype_module (String titlefield, String editTitleField, int price) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(Tickettype);
        actionclass.clickOnObject(Unpublish_Button);
        actionclass.setValueinTextbox(ticketname_field, titlefield);
        actionclass.clickOnObject(saveforcountry);
      //  verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(Ticketdropdown);
        actionclass.clickOnObject(Filter_button);
        Thread.sleep(4000);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(ticketname_field, editTitleField);
            actionclass.clickOnObject(ticket_select);
            actionclass.clickOnObject(ticket_select_option);
            actionclass.clickOnObject(saveforcountry);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Ticketdropdown);
            actionclass.clickOnObject(Filter_button);
            Thread.sleep(4000);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton);
            Thread.sleep(4000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Ticketdropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void PackageModule (String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(Package);
        actionclass.clickOnObject(Unpublish_Button);
        actionclass.setValueinTextbox(Package_title, titlefield);
        actionclass.clickOnObject(Overviewtab);
        actionclass.clickOnObject(select_package);
        actionclass.clickOnObject(select_package_value);
        actionclass.clickOnObject(saveforcountry);
        verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(Packagedropdown);
        actionclass.clickOnObject(Filter_button);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(Package_title, editTitleField);
            actionclass.setValueinTextbox(EditField_package, titlefield);
            actionclass.clickOnObject(saveforcountry);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Packagedropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton);
            Thread.sleep(3000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Packagedropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void  Landingpage (String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(Landingpage);
        actionclass.clickOnObject(Unpublish_Button);
        actionclass.setValueinTextbox(Group_tour_title_field, titlefield);
        actionclass.clickOnObject(Landingpage_layout);
        Thread.sleep(5000);
        actionclass.clickOnObject(Landingpage_layout_option);
        actionclass.clickOnObject(saveforcountry);
     //   verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(Landingpagedropdown);
        actionclass.clickOnObject(Filter_button);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(Group_tour_title_field, editTitleField);
          //  actionclass.setValueinTextbox(Landingpage_edit, titlefield);
            actionclass.clickOnObject(saveforcountry);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Landingpagedropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton);
            Thread.sleep(3000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Landingpagedropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void  Itinerary (String titlefield, String stop, String ticketfield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(Itinerary);
        actionclass.clickOnObject(Unpublish_Button);
        actionclass.setValueinTextbox(Group_tour_title_field, titlefield);
        actionclass.selectFromDropdown(dropdown,"index","4");

        actionclass.clickOnObject(Stopclick);
        actionclass.setValueinTextbox(StopField, stop);
        actionclass.clickOnObject(Savebutton);
        Thread.sleep(5000);
      //  verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(Itinerarydropdown);
        actionclass.clickOnObject(Filter_button);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(Group_tour_title_field, editTitleField);
            actionclass.setValueinTextbox(ticketField, ticketfield);
            actionclass.clickOnObject(Savebutton);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Itinerarydropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton);
            Thread.sleep(3000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Itinerarydropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void  Hotels (String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(Hotel_module);
        actionclass.setValueinTextbox(CampervanCollection_Module_TitleField, titlefield);
        Thread.sleep(1000);
        actionclass.clickOnObject(CampervanCollection_Search_region);
        Thread.sleep(1000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown);
        Thread.sleep(1000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown_select);
        Thread.sleep(2000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown_1);
        Thread.sleep(2000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown_select1);
        Thread.sleep(2000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown_2);
        Thread.sleep(2000);
        actionclass.clickOnObject(CampervanCollection_Region_dropdown_select2);
        Thread.sleep(2000);
        actionclass.clickOnObject(saveforcountry);
        verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(Hotel_dropdown);
        actionclass.clickOnObject(Filter_button);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(CampervanCollection_Module_TitleField, editTitleField);
            actionclass.setValueinTextbox(Hotel_Edit_field, titlefield);
            actionclass.clickOnObject(saveforcountry);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Hotel_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton2);
            Thread.sleep(3000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Hotel_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void  GroupTourlandingpage (String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(Group_tour_leanding_Page_module);
        actionclass.clickOnObject(Unpublish_Button);
        actionclass.setValueinTextbox(Group_tour_title_field, titlefield);
        actionclass.clickOnObject(saveforcountry);
        Thread.sleep(3000);
        verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(Group_tour_Leanding_page_dropdown);
        actionclass.clickOnObject(Filter_button);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(Group_tour_title_field, editTitleField);
            actionclass.clickOnObject(saveforcountry);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Group_tour_Leanding_page_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton2);
            Thread.sleep(3000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Group_tour_Leanding_page_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void Group_tour(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(Group_tour_module);
        actionclass.clickOnObject(Unpublish_Button);
        actionclass.setValueinTextbox(Group_tour_title_field, titlefield);
        actionclass.setValueinTextbox(Tourid, String.valueOf(Price));
        actionclass.setValueinTextbox(Tripcode, titlefield);
        actionclass.clickOnObject(Savebutton);
       // verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(Group_tour_dropdown);
        Thread.sleep(3000);
        actionclass.clickOnObject(Filter_button);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(Group_tour_title_field, editTitleField);
            actionclass.setValueinTextbox(Group_tour_Editfield, titlefield);
            actionclass.clickOnObject(Savebutton);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Group_tour_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton2);
            Thread.sleep(3000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Group_tour_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void CountryModule(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(country);
        actionclass.clickOnObject(Unpublish_Button);
        actionclass.setValueinTextbox(country_Title, titlefield);
        actionclass.clickOnObject(country_media);
        actionclass.clickOnObject(mediaimage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[9]/div[2]/div/div/div[2]/div/div[3]/div/form/div[2]/div[1]/div[2]/span/article/div[1]/div/img")));
        Thread.sleep(1000);
        actionclass.clickOnObject(Selctimg);
        actionclass.clickOnObject(insertimage);
        Thread.sleep(10000);
        actionclass.clickOnObject(country_continent);
        actionclass.clickOnObject(country_continent_select);
        actionclass.clickOnObject(country_continent_select_Option);
        actionclass.clickOnObject(Savebutton);
        verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        Thread.sleep(5000);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(dropdowncountry);
        actionclass.clickOnObject(Filter_button);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(country_Title, editTitleField);
            actionclass.setValueinTextbox(Body_field, titlefield);
            actionclass.clickOnObject(Savebutton);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(dropdowncountry);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton);
            Thread.sleep(4000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(dropdowncountry);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
    public void GAdventurestour(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(G_adv);
        actionclass.setValueinTextbox(G_adv_titlefield, titlefield);
        actionclass.clickOnObject(G_adv_titlefield_tag_Tab);
        actionclass.clickOnObject(G_adv_titlefield_Tag_Option);
        actionclass.clickOnObject(Savebutton);
        verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        Thread.sleep(1000);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(G_advanture_dropdown);
        actionclass.clickOnObject(Filter_button);
        Thread.sleep(2000);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(G_adv_titlefield, editTitleField);
            actionclass.setValueinTextbox(G_advanture_Edit, titlefield);
            actionclass.clickOnObject(Savebutton);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(G_advanture_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton);
            Thread.sleep(5000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(G_advanture_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }

    public void loginToGitHub(WebDriver driver, String username, String password) {
        driver.get("https://github.com/login");

        // Enter username
        WebElement usernameField = driver.findElement(By.id("login_field"));
        usernameField.sendKeys(username);

        // Enter password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        // Click the login button
        WebElement loginButton = driver.findElement(By.name("commit"));
        loginButton.click();
    }

    public void Generic_Article(String titlefield, String editTitleField) throws InterruptedException, IOException {
        ActionClass actionclass = new ActionClass(driver, extentTest);
        VerificationClass verificationClass = new VerificationClass(driver, extentTest);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actionclass.clickOnObject(Addcontent);
        actionclass.clickOnObject(Generic_Article);
        actionclass.setValueinTextbox(Titlefield, titlefield);
        actionclass.clickOnObject(PagemediaTab);
        actionclass.clickOnObject(primaryimage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[9]/div[2]/div/div/div[2]/div/div[3]/div/form/div[2]/div[1]/div[2]/span/article/div[1]/div/img")));
        actionclass.clickOnObject(Selctimg);
        actionclass.clickOnObject(insertimage);
        Thread.sleep(8000);
        actionclass.clickOnObject(Savebutton);
        // verificationClass.verifyTextPresent(Verification_message, titlefield);
        actionclass.clickOnObject(Content);
        Thread.sleep(1000);
        actionclass.setValueinTextbox(Contentfindfield, titlefield);
        actionclass.clickOnObject(clickondropdown);
        actionclass.clickOnObject(Generic_Article_dropdown);
        actionclass.clickOnObject(Filter_button);
        verifyModuleNameInTable(titlefield);
        String contentName = Created_content_name.getText();
        System.out.println("Created Content Name: " + contentName);
        if (contentName.equals(titlefield)) {
            System.out.println("The created content name matches the title field.");
            actionclass.clickOnObject(Click_Edit_content);
            actionclass.setValueinTextbox(Titlefield, editTitleField);
            actionclass.setValueinTextbox(Generic_Article_summeryfield, titlefield);
            actionclass.clickOnObject(Savebutton);
            String clickTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date());
            System.out.println("Save button clicked at: " + clickTime);
            verificationClass.verifyTextPresent(Edit_Verification_message, editTitleField);
            Thread.sleep(2000);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Generic_Article_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameInTable(editTitleField);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletedropdown);
            Thread.sleep(2000);
            actionclass.clickOnObject(deletebutton);
            Thread.sleep(4000);
            actionclass.clickOnObject(MainDeletebutton);
            Thread.sleep(2000);
            verificationClass.verifyTextPresent(Delete_Verification_message, editTitleField);
            actionclass.setValueinTextbox(Contentfindfield, editTitleField);
            actionclass.clickOnObject(clickondropdown);
            actionclass.clickOnObject(Generic_Article_dropdown);
            actionclass.clickOnObject(Filter_button);
            verifyModuleNameAndDateTime(editTitleField, clickTime);
            String contentName1 = Nocontentfound.getText();
            System.out.println("Message appears on the table = " + contentName1);
        } else {
            System.out.println("The created content name does NOT match the title field.");
        }
    }
}