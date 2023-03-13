package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.DriverInt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginStep extends DriverInt {

    @Given("user enters a password as {string}")
    public void userEntersAPasswordAs(String password) {
        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(password);
    }

    @When("user clicks the login button")
    public void userClicksTheLoginButton() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("Login should be successful")
    public void loginShouldBeSuccessful() {
        WebElement welcomeElement = driver.findElement(By.xpath("//h2[@class='welcome-header']"));
        String text = wait.until(ExpectedConditions.visibilityOf(welcomeElement)).getText();
        System.out.println(text);
    }

    @Then("Login should be unsuccessful")
    public void loginShouldBeUnsuccessful() {
        WebElement welcomeElement = driver.findElement(By.xpath("//img[@alt='logo']"));
        wait.until(ExpectedConditions.visibilityOf(welcomeElement)).getText();
    }
}
