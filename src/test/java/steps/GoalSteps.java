package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.DriverInt;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GoalSteps extends DriverInt {
    @Given("user navigates to Goals")
    public void userNavigatesToGoals() {
        driver.findElement(By.xpath("//button[@class='dropdown-btn btn']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Goals']")).click();
    }

    @Given("user adds a goal {string}")
    public void userAddsAGoal(String string) {
        WebElement input = driver.findElement(By.xpath("//input[@placeholder='Add a goal']"));
        input.sendKeys("Bench 225");
        input.sendKeys(Keys.ENTER);
    }

    @When("user clicks the complete goal button")
    public void userClicksTheCompleteGoalButton() {
       driver.findElement(By.xpath("//button[@class='goal-complete-btn']")).click();
    }

    @Then("the complete goal button should update")
    public void theCompleteGoalButtonShouldUpdate() {
        String color = driver.findElement(By.xpath("//button[@class='goal-complete-btn-complete']"))
                .getCssValue("background-color");
        System.out.println(color);
        boolean isSame = color.equals("rgba(56, 173, 32, 1)");
        driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M6 19c0 1.')]")).click();
    }

    @When("user clicks the remove goal")
    public void userClicksTheRemoveGoal() {
        driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M6 19c0 1.')]")).click();
    }

    @Then("the goal should be removed")
    public void theGoalShouldBeRemoved() {
        String innerElements = driver.findElement(By.xpath("//div[@class='goal-container']"))
                .getAttribute("innerHTML");
        if(innerElements.equals("<ul></ul>")) {
            System.out.println("goals are deleted");
        } else System.out.println(innerElements);

    }


}
