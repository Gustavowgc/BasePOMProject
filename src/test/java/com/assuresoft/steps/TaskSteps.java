package com.assuresoft.steps;

import com.assuresoft.pages.TaskPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import java.util.List;

public class TaskSteps {
private    TaskPage taksListPage;
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

    }
    @Given("add a task item")
    public void add_a_task_item() {
        this.taksListPage.newEntryTodo();
    }
    @Given("complete a task item")
    public void complete_a_task_item() {
        this.taksListPage.clickCompleteATaskItem();
    }
    @Then("the items titles should match")
    public void the_items_titles_should_match() {
    }

    @Then("I was not able to see the clear button")
    public void i_was_not_able_to_see_the_clear_button() {
    }

    @When("I enter text and press enter")
    public void i_enter_text_and_press_enter() {
        this.taksListPage.newEntryTodo();
    }
    @Then("a new task should be added")
    public void a_new_task_should_be_added() {
        List<String> tasks = this.taksListPage.getTaskList();
        String lastTask = tasks.get(tasks.size() - 1);
        assertTrue(this.taksListPage.isTaskAdded(lastTask), "New task was not added successfully");
    }

    @When("I click on delete button")
    public void i_click_on_delete_button() {
        this.taksListPage.clickDeleteTask();
    }
    @Then("the selected task should be deleted")
    public void the_selected_task_should_be_deleted() {
        assertFalse(this.taksListPage.isTaskPresent(), "Selected task was not deleted successfully");
    }

    @When("I validate the items left")
    public void i_validate_the_items_left() {
    }
    @Then("the number should be match")
    public void the_number_should_be_match() {
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

    }
    @When("I click on complete button")
    public void i_click_on_complete_button() {
        this.taksListPage.clickCompleteButton();
    }
    @Then("the selected task should be remain uncompleted")
    public void the_selected_task_should_be_remain_uncompleted() {
    }
    @Given("add a task item predefined")
    public void add_a_task_item_predefined() {
        this.taksListPage.newEntryTodoPredefined();
    }
}

