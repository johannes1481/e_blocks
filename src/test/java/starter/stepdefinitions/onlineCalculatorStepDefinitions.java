package starter.stepdefinitions;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.navigation.onlineCalculatorMethods;

import java.util.logging.Logger;

public class onlineCalculatorStepDefinitions {
	
	static Logger logger = Logger.getLogger(onlineCalculatorStepDefinitions.class.getName());
	
	public WebDriver wdriver;
	
	onlineCalculatorMethods methods = new onlineCalculatorMethods();
	
	public void launchUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_103.exe");
        wdriver = new ChromeDriver();
        wdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wdriver.manage().window().maximize();
        wdriver.get("https://www.calculator.net/");
        Thread.sleep(2000);
		    
	} 

	@Given("an online calculator is launched")
	public void an_online_calculator_is_launched() throws InterruptedException {
		launchUrl();
		
		        
	}
	
	@Given("title is displayed")
	public void title_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	
	}
	
	@Given("{string} two numbers")
	public void two_numbers(String string) {
	   
	    System.out.println("operation "+string);
	    
	}
	
	@Given("first number {string} is punched on the calculator")
	public void first_number_is_punched_on_the_calculator(String firstNumber) throws InterruptedException {
	   
		methods.clickButton(wdriver, firstNumber);
	    logger.info("first number :"+firstNumber);
	}
	
	@Given("Operation {string} is applied")
	public void operation_is_applied(String operation) throws InterruptedException {
	  
		methods.clickButton(wdriver, operation);
		logger.info("operation sign is : "+operation);
	    System.out.println("operqation :"+operation);
	}
	
	@Given("Second number {string} is punched on the calculator")
	public void second_number_is_punched_on_the_calculator(String secondNumber) throws InterruptedException {
		
		methods.clickButton(wdriver, secondNumber);
		System.out.println("Second : "+secondNumber);
	}
	
	@SuppressWarnings("static-access")
	@When("operation = is applied")
	public void operation_is_applied() throws Exception {
	    
		methods.clickButton(wdriver, "=");
		methods.takeSnapShot(wdriver, "/cucumber-starter/target/screenshots/test.png");
	}
	
	@Then("answer should be {string}")
	public void answer_should_be(String answerFromScript) {
		
		String results = wdriver.findElement(By.id("sciOutPut")).getText();
		System.out.println("results : "+results);
		logger.info("Answer is :"+answerFromScript);
		assertEquals(answerFromScript.trim(), results.trim());
	
	}


}
