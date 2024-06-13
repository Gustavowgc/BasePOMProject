package com.assuresoft.core;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class PageBase {

    protected Page page;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"Environment"})
    public void init(String sEnv) {
        Playwright playwright= Playwright.create();
        Browser browser =
                playwright.chromium().launch(
                        new BrowserType.LaunchOptions().setHeadless(false)
                );
        page =browser.newPage();

    }


    @AfterMethod(alwaysRun = true)
    public void terminate() {
        //TODO
    }
}
