package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.DriverInt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UpdateWorkout extends DriverInt {


    @Given("user logs in as {string}")
    public void userLogsInAs(String password) {
        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Given("navigates to Week View")
    public void navigatesToWeekView() {
       driver.findElement(By.xpath("//button[@class='dropdown-btn btn']")).click();
       driver.findElement(By.xpath("//button[normalize-space()='Week View']")).click();
    }

    @When("user clicks the button with text as {string}")
    public void userClicksTheButtonWithTextAs(String buttonText) {
        WebElement monday = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        String mondayText = monday.getText();

        if(buttonText.equals("Completed") && mondayText.equals("Mark as Complete")) {
            System.out.println("needed");
            monday.click();
        }
        if(buttonText.equals("Mark as Complete") && mondayText.equals("Complete")) {
            System.out.println("needed");
            monday.click();
        }

        monday.click();
    }

    @Then("complete button should say {string}")
    public void completeButtonShouldSay(String updatedText) {
        String text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]"))
                .getText();
        Assert.assertEquals(text, updatedText);
    }

}
