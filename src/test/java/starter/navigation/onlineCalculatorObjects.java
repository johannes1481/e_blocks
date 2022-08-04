package starter.navigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class onlineCalculatorObjects {
	
	@FindBy(xpath = "//div[text()='display']")
	private WebElement display;
	
	@FindBy(name = "clearButton")
	private WebElement AC;
	
	@FindBy(name = "divide")
	private WebElement divideBtn;
	
	//Operation objects
	@FindBy(name = "add")
	private WebElement additionBtn;
	
	@FindBy(xpath = "subtract")
	private WebElement subtractBtn;
	
	@FindBy(xpath = "multiply")
	private WebElement multiplyBtn;
	
	//number objects
	@FindBy(xpath = "zero")
	private WebElement zeroBtn;
	
	@FindBy(name = "one")
	private WebElement oneBtn;
	
	@FindBy(name = "two")
	private WebElement twoBtn;
	
	@FindBy(name = "three")
	private WebElement threeBtn;
	
	@FindBy(name = "four")
	private WebElement fourBtn;
	
	@FindBy(name = "five")
	private WebElement fiveBtn;
	
	@FindBy(name = "six")
	private WebElement sixBtn;
	
	@FindBy(name = "seven")
	private WebElement sevenBtn;
	
	@FindBy(name = "eight")
	private WebElement eightBtn;
	
	@FindBy(name = "nine")
	private WebElement nineBtn;
	
	//method to click an webElement
	public void clickCalculatorBtn(WebElement element) {
		
	}
	
	//return the value from the screen
	public String getDisplayedAnswer(WebElement wElement) {
		return wElement.getText();
		
	}
	
	public WebElement getOneBtn() {
		return oneBtn;
	}

}
