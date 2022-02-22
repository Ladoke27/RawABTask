package step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class unsuccessfulLogin {

    public WebDriver driver;

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://evernote.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

    }

    @Given("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a")).click();
        driver.findElement(By.linkText("Log In")).click();

    }

    @When("^I enter incorrect  \"([^\"]*)\"$")
    public void i_enter_incorrect(String loginEmail) throws Throwable {
        driver.findElement(By.id("username")).sendKeys(loginEmail);

    }

    @When("^I click continue$")
    public void i_click_continue() throws Throwable {
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(5000);
    }

    @Then("^I should get \"([^\"]*)\"$")
    public void i_should_get(String errorMessage) throws Throwable {
        String ExpectedErrorMessage = errorMessage;
        String ActualErrorMessage = driver.findElement(By.id("responseMessage")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);

    }
}
