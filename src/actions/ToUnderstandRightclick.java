package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandRightclick {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	Actions action=new Actions(driver);
	
	
driver.get("https://demowebshop.tricentis.com/ ");
WebElement jewelry = driver.findElement(By.partialLinkText("Jewelry"));
//move to element and then right click on that element
action.moveToElement(jewelry).contextClick().perform();
Thread.sleep(8000);
driver.quit();


}
}