package step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAgain {

    public WebDriver driver;

    @Given("^User is back on the homepage$")
    public void user_is_back_on_the_homepage() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://evernote.com/logged-out/?logout&uid=32300216");
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

    @Then("^Open the previously created note$")
    public void open_the_previously_created_note() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"4cc6c77d-efea-e9cb-5646-b5acc06f9b86_qa-NOTES_SIDEBAR_NOTE_SNIPPET\"]/span")).click();

    }
}
