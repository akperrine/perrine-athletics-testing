package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks extends DriverInt{
//      System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
//    driver = new ChromeDriver();
//    wait = new WebDriverWait(driver, 10);
//        driver.get("https://bookcart.azurewebsites.net/");
//    WebDriver.Options manage = driver.manage();
//        manage.timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        manage.window().maximize();
    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrom.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://earnest-crostata-07916d.netlify.app/");
        WebDriver.Options manage = driver.manage();
            manage.timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            manage.window().maximize();
    }

    @After
    public void afterScenario(Scenario scenario) {
        boolean failed = scenario.isFailed();
        System.out.println("is Failed? "+ failed);
        if(failed) {
            byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotAs, "image/png");
        }

        driver.quit();
    }
}
