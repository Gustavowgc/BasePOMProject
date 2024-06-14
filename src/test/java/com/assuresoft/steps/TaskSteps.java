package com.assuresoft.steps;

import com.assuresoft.pages.TaskPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;



public class TaskSteps {

    TaskPage taksListPage;

    @Given("Navigate to the home page")
    public void navigate_to_the_home_page() {
        this.taksListPage= new TaskPage();
    }
    @When("I click on clear all button")
    public void i_click_on_clear_all_button() {
        this.taksListPage.clickClearButton();
    }
    @Then("all the completed task should clear")
    public void all_the_completed_task_should_clear() {
        throw new io.cucumber.java.PendingException();
    }
    @Given("add a task item")
    public void add_a_task_item() {
        this.taksListPage.newEntryTodo();
    }
    @Given("complete a task item")
    public void complete_a_task_item() {
        this.taksListPage.clickCompleteATaskItem();
    }
    @When("I validate the items titles")
    public void i_validate_the_items_titles() {
        throw new io.cucumber.java.PendingException();
    }
    @Then("the items titles should match")
    public void the_items_titles_should_match() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("I was not able to see the clear button")
    public void i_was_not_able_to_see_the_clear_button() {
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter text and press enter")
    public void i_enter_text_and_press_enter() {
        this.taksListPage.newEntryTodo();
    }
    @Then("a new task should be added")
    public void a_new_task_should_be_added() {
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on delete button")
    public void i_click_on_delete_button() {
        this.taksListPage.clickDeleteTask();
    }
    @Then("the selected task should be deleted")
    public void the_selected_task_should_be_deleted() {
        throw new io.cucumber.java.PendingException();
    }

    @When("I validate the items left")
    public void i_validate_the_items_left() {
        throw new io.cucumber.java.PendingException();
    }
    @Then("the number should be match")
    public void the_number_should_be_match() {
        throw new io.cucumber.java.PendingException();
    }
    @When("I double click on a task")
    public void i_double_click_on_a_task() {
        this.taksListPage.doubleClickOnATask();
    }
    @When("enter a new title value")
    public void enter_a_new_title_value() {
        this.taksListPage.newEntryTodo();
    }
    @Then("the selected task should be updated")
    public void the_selected_task_should_be_updated() {
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on complete button")
    public void i_click_on_complete_button() {
        this.taksListPage.clickCompleteButton();
    }
    @Then("the selected task should be completed")
    public void the_selected_task_should_be_completed() {
        throw new io.cucumber.java.PendingException();
    }
    @Then("the selected task should be remain uncompleted")
    public void the_selected_task_should_be_remain_uncompleted() {
        throw new io.cucumber.java.PendingException();
    }
    @Given("add a task item predefined")
    public void add_a_task_item_predefined() {
        this.taksListPage.newEntryTodoPredefined();
    }
}

