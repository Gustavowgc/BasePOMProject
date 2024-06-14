package com.assuresoft.pages;

import com.assuresoft.core.PageBase;
import com.microsoft.playwright.Page;
import io.cucumber.java.StepDefinitionAnnotation;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class TaskPage extends PageBase {
    private List<String> taskList;

    public TaskPage() {
        this.taskList = new ArrayList<>();
    }
    private String inputToggle = "//input[@class='toggle']";
    private String clearButton = "//button[@class='clear-completed']";
    private String completeButton = "//a[@href='#/completed']";
    private String newTodo = "//input[@class='new-todo']";
    private String deleteTaskButton = "//button[@aria-label='Delete' and @class='destroy']";
    private String labelTodo = "//label[@data-testid='todo-title']";

    public void clickClearButton() {
        page.click(clearButton);

    }
    public void clickCompleteATaskItem() {
        page.click(inputToggle);

    }
    public void clickCompleteButton() {
        page.click(completeButton);

    }
    public void clickDeleteTask() {
        page.click(labelTodo);
        page.click(deleteTaskButton);
    }

    private char generateRandomChar() {
        Random random = new Random();
        char randomChar = (char) (random.nextInt(26) + 'a');
        return randomChar;
    }

    public void newEntryTodo(){
        page.click(newTodo);
        char randomChar = generateRandomChar();
        page.type(newTodo, String.valueOf(randomChar) + "\n");
        String newTask = String.valueOf(randomChar);
        this.taskList.add(newTask);
    }
    public void doubleClickOnATask() {
        page.dblclick(labelTodo);
        char randomChar = generateRandomChar();
        page.type(labelTodo, String.valueOf(randomChar) + "\n");
        String newTask = String.valueOf(randomChar);
        this.taskList.add(newTask);
    }
    public void newEntryTodoPredefined() {
        page.click(newTodo);
        page.type(newTodo, "a\n");
    }
    public boolean isTaskAdded(String taskText) {
        return this.taskList.contains(taskText);
    }
    public List<String> getTaskList() {
        return this.taskList;
    }
    public boolean isTaskPresent() {
        return this.taskList.isEmpty();
    }

}