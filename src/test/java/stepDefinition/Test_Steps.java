package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by orson on 2017/4/22.
 */
public class Test_Steps {

    private WebDriver driver = null;


    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
    }

    @When("^User enters orson and zhu(\\d+)$")
    public void user_enters_orson_and_zhu(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("log")).sendKeys("orson");
        driver.findElement(By.id("pwd")).sendKeys("zhu" + arg1);
        driver.findElement(By.id("login")).click();
    }

//    @When("^User enters boee and box(\\d+)$")
//    public void user_enters_boee_and_box(int arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.id("log")).sendKeys("boee");
//        driver.findElement(By.id("pwd")).sendKeys("box"+arg1);
//        driver.findElement(By.id("login")).click();
//    }


    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement element = driver.findElement(By.partialLinkText("Log out"));
    }

//    @When("^User LogOut form the application$")
//    public void user_LogOut_form_the_application() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
//    }
//
//    @Then("^Message displayed LogOut Successfully$")
//    public void message_displayed_LogOut_Successfully() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("LogOut Successfully");
//    }

    @Given("^I rent a house$")
    public void i_rent_a_house() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I have rent a house.");
    }

    @When("^Today is the end of the month$")
    public void today_is_the_end_of_the_month() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("today is the end of the month.");
    }

    @Then("^I need to pay the bill$")
    public void i_need_to_pay_the_bill() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The bill is payed.");
    }

}
