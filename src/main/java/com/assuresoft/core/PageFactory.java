package com.assuresoft.core;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PageFactory {


    public Page initBrowser(){
        Playwright playwright= Playwright.create();
        Browser browser =
                playwright.chromium().launch(
                        new BrowserType.LaunchOptions().setHeadless(false)
                );
        return browser.newPage();

    }
}
