package com.steps;

import com.assuresoft.core.BaseTestSteps;
import com.pages.TaskPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaskSteps extends BaseTestSteps {

    TaskPage taksListPage;



    @Given("Navigate to the home page")
    public void navigate_to_the_home_page() {
        this.taksListPage= new TaskPage();

       // page.navigate("https://demo.playwright.dev/todomvc/#/");
//

    }
    @When("I click on clear all button")
    public void i_click_on_clear_all_button() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("all the completed task should clear")
    public void all_the_completed_task_should_clear() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("add a task item")
    public void add_a_task_item() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Given("complete a task item")
    public void complete_a_task_item() {
        // Write code here that turns the phrase above into concrete actions
    }

}

