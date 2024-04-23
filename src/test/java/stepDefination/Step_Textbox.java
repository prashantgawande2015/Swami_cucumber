package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class Step_Textbox {
	WebDriver driver;
	

	@Given("Launch the TextBox Page")
	public void launch_the_text_box_page()throws Throwable {
	    
	System.out.println("shree swami samarth");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		
		driver= (WebDriver) new ChromeDriver();	
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	//
			
	}
	
	
	
	

	@When("I enter the name as  {string}")
	public void i_enter_the_name_as(String fullName) {
		
		WebElement userNameTextbox =driver.findElement(By.xpath("//input[@id='userName']"));
		userNameTextbox.sendKeys(fullName);
	}

	@When("I enter the email as {string}")
	public void i_enter_the_email_as(String email) {
	   
		WebElement email_Text = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email_Text.sendKeys(email);
		
	}

	@When("I enter the current address as {string}")
	public void i_enter_the_current_address_as(String curretaddress) {
	
	}

	@When("I enter the permaddress as  {string}")
	public void i_enter_the_permaddress_as(String permaddress) {
	 
		}

	@When("I click on submit button")
	public void i_click_on_submit_button() {
	  WebElement submitBtn=  driver.findElement(By.xpath("//button[@id='submit']"));
	  submitBtn.click();
	}

	@Then("I verify the submitted details")
	public void i_verify_the_submitted_details() {
	   
	}



	



}
