package step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_addnote_logout {
    public WebDriver driver;

    @Given("^I am successfully logged in$")
    public void iAmSuccessfullyLoggedIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://evernote.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a")).click();
        driver.findElement(By.linkText("Log In")).click();
        driver.findElement(By.id("username")).sendKeys("quantitative307@yahoo.com");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys("Jamantino1759");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
        Thread.sleep(10000);

    }

    @When("^Add note$")
    public void addNote() {
        driver.findElement(By.xpath("//*[@id=\"qa-HOME_NOTE_WIDGET_CREATE_NOTE\"]/svg/g/path[1]")).click();
    }

    @Then("^I should be signed out$")
    public void iShouldBeSignedout() {
        driver.findElement(By.linkText(""));


    }

}
