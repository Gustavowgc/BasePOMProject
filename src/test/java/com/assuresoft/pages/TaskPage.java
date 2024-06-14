package com.assuresoft.pages;

import com.assuresoft.core.PageBase;
import com.microsoft.playwright.Page;
import io.cucumber.java.StepDefinitionAnnotation;


public class TaskPage extends PageBase {
    private String inputNewTodoSelector="//input[@class='new-todo']";
    private String inputToggle="//input[@class='toggle']";
    private String clearButton="//button[@class='clear-completed']";

    private String completeButton="";




    public void clickClearButton(){
        page.click(clearButton);

    }

    public void clickCompleteButton(){
        page.click(completeButton);

    }
}
    







