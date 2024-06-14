package com.assuresoft.steps;

import com.assuresoft.pages.TaskPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        this.taksListPage.clickCompleteButton();

    }

    @Given("add a task item")
    public void add_a_task_item() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Given("complete a task item")
    public void complete_a_task_item() {
        this.taksListPage.clickClearButton();
    }

    @When("I validate the items titles")
    public void i_validate_the_items_titles() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the items titles should match")
    public void the_items_titles_should_match() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I was not able to see the clear button")
    public void i_was_not_able_to_see_the_clear_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter text and press enter")
    public void i_enter_text_and_press_enter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("a new task should be added")
    public void a_new_task_should_be_added() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on delete button")
    public void i_click_on_delete_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the selected task should be deleted")
    public void the_selected_task_should_be_deleted() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I validate the items left")
    public void i_validate_the_items_left() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the number should be match")
    public void the_number_should_be_match() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

