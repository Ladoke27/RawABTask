package step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class successfulLogin {
    public WebDriver driver;

    @Given("^I am on the homescreen$")
    public void iAmOnTheHomescreen() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://evernote.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @And("^I click the login$")
    public void iClickTheLogin() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a")).click();
        driver.findElement(By.linkText("Log In")).click();
    }

    @And("^I enter valid email$")
    public void iEnterValidEmail() {
        driver.findElement(By.id("username")).sendKeys("quantitative307@yahoo.com");

    }

    @And("^I select continue$")
    public void iSelectContinue() throws InterruptedException {
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(5000);
    }

    @And("^I enter password$")
    public void iEnterPassword() throws InterruptedException {
        driver.findElement(By.id("password")).sendKeys("Jamantino1759");
        Thread.sleep(5000);
    }

    @When("^I click on Signin$")
    public void iClickOnSignin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
        Thread.sleep(10000);
    }

    @Then("^I should be successfully logged in$")
    public void iShouldBeSuccessfullyLoggedIn() {
        driver.findElement(By.xpath("//*[@id=\"qa-NAV_USER\"]/div/div/span/span/div")).isDisplayed();
    }


}
