//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class launchBrowser {

    String username = "standard_user";
    String password = "secret_sauce";
    int sleepTime = 2000;
    List<WebElement> extractedListOfPrices;
    String extractedPrices[] ={};
    String sortedPrices[] = {};

    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/seaparasathekge/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        //Thread.sleep(3000);

        driver.findElement(By.id("user-name")).sendKeys(username);
        Thread.sleep(sleepTime);

        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(sleepTime);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(sleepTime);

        //click to sort
        driver.findElement(By.xpath("//SELECT[@class='product_sort_container']")).click();
        Thread.sleep(sleepTime);

        driver.findElement(By.xpath("//OPTION[text() = 'Price (low to high)']")).click();
        Thread.sleep(sleepTime);

        List<WebElement> listOfPrices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        System.out.println("Number of price elements is :" +listOfPrices.size());
        int sizeOfArray = listOfPrices.size();

        for (int i=0; i<listOfPrices.size();i++){
            System.out.println("Price :" + listOfPrices.get(i).getText().substring(1));
           // extractedPrices[i] = listOfPrices.get(i).getText();//.substring(1);
        }
        sortedPrices = extractedPrices;
        //Arrays.stream(SortedPrices).sorted();
        //Assert.

        for(int k = 0; k <extractedPrices.length; k++ ){
            if(sortedPrices[k] == extractedPrices[k] )
            {
               Assert.assertEquals(sortedPrices[k], extractedPrices[k]);
            }

        }



        driver.close();

    }
    @AfterTest
    public void closeBrowser()
    {
       // driver.close();
    }

}
