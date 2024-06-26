package com.assuresoft.core;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.StepDefinitionAnnotation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class PageBase {

    protected Page page;

    public PageBase(){
        PageFactory factory= new PageFactory();
        this.page =factory.initBrowser();

    }




    @AfterMethod(alwaysRun = true)
    public void terminate() {
        //TODO
        this.page.close();
    }


    public String getPageTitle(){
        return this.page.title();
    }

}
