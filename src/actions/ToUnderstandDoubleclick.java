package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandDoubleclick {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	WebElement addButton= driver.findElement(By.id("add"));
	WebElement minusButton= driver.findElement(By.id("minus"));
	action.doubleClick(addButton).perform();
	Thread.sleep(2000);
	//action.doubleClick(addButton).perform();
	action.moveToElement(addButton).doubleClick().perform();
	Thread.sleep(2000);
	
	action.doubleClick(addButton).perform();
	Thread.sleep(2000);
	driver.quit();


	}
	}

