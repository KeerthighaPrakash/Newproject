package Stepdefin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefin {
	
	 String expected="Login";
	    WebDriver driver;
	    @Given("launches chrome browser")
	    public void launches_chrome_browser() {
	        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
	    }

	@When("user navigates to registration page")
	public void user_navigates_to_registration_page() {
        System.out.println("user navigates to registration page");
        driver.findElement(By.linkText("New User?Register Here")).click();
        
	}

	@When("user enters with username as {string}")
	public void user_enters_with_username_as(String un) {
		  System.out.println("user enters username is" +un);
	        driver.findElement(By.name("userName")).sendKeys(un);
	}
	 @When("user enters with firstname as {string}\"")
	    public void user_enters_with_firstname_as(String fn) {
	           driver.findElement(By.name("firstName")).sendKeys(fn);
	     
	    }     @When("user enters with lastname as {string}")
	    public void user_enters_with_lastname_as(String ln) {
	        driver.findElement(By.name("lastName")).sendKeys(ln);
	       
	    }     @When("user enters with password as {string}")
	    public void user_enters_with_password_as(String pwd) {
	        driver.findElement(By.name("password")).sendKeys(pwd);
	       
	    }     @When("user enters with confirm password as {string}")
	    public void user_enters_with_confirm_password_as(String cpwd) {
	        driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
	        
	    }     @When("user enters with gender as {string}")
	    public void user_enters_with_gender_as(String gen) {
	        driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/input[2]")).click();;
	           
	    }     @When("user enters with email as {string}")
	    public void user_enters_with_email_as(String em) {
	        driver.findElement(By.name("emailAddress")).sendKeys(em);
	           
	    }     @When("user enters with mobileno as {string}")
	    public void user_enters_with_mobileno_as(String mn) {
	         driver.findElement(By.name("mobileNumber")).sendKeys(mn);
	           
	    }     @When("user enters with dob as {string}")
	    public void user_enters_with_dob_as(String db) {
	        driver.findElement(By.name("dob")).sendKeys(db);
	           
	    }     @When("user enters with address as {string}")
	    public void user_enters_with_address_as(String ad) {
	        driver.findElement(By.id("address")).sendKeys(ad);
	          
	            }     @When("user enters with answer as {string}")
	    public void user_enters_with_answer_as(String ans) {
	        driver.findElement(By.name("answer")).sendKeys(ans);
	          
	    }     @When("user clicks on Register button")
	    public void user_clicks_on_Register_button() {
	         driver.findElement(By.name("Submit")).click();
	         
	    }     @Then("verify registration success")
	    public void verify_registration_success() {
	          Assert.assertEquals(expected, "Login");
	          driver.close();
	              }
}
	     
